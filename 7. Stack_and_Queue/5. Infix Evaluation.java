import java.io.*;
import java.util.*;

public class Main{
    
    public static int solve(int n1,int n2,char opt)
    {
        if(opt=='+')
        {
            return n1+n2;
        }
        else if(opt=='-')
        {
            return n1-n2;
        }
        else if(opt=='*')
        {
            return n1*n2;
        }
        else
        {
            return n1/n2;
        }
    }
    public static int precedance(char ch)
    {
        if(ch=='+'|| ch=='-')
        {
            return 1;
        }
        else if(ch=='*'|| ch=='/')
        {
               return 2;
        }
        else
        {
            return 0;
        }
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> st1=new Stack<>();
    Stack<Character> st2=new Stack<>();
    
    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);
        if(ch>='0' && ch<='9')
        {
            st1.push(ch-'0');
        }
        else if(ch=='(')
        {
             st2.push(ch);
        }
     else if(ch=='+' || ch=='-'|| ch=='*'|| ch=='/')
      {
       while(st2.size()>0 && precedance(st2.peek())>=precedance(ch))
       {
           char operator=st2.pop();
           int op2=st1.pop();
           int op1=st1.pop();
           
           int ans=solve(op1,op2,operator);
           st1.push(ans);
       }
       st2.push(ch);
      }
      
       else if(ch==')')
    {
        while(st2.peek()!='(')
        {
            
           char operator=st2.pop();
           int op2=st1.pop();
           int op1=st1.pop();
           
           int ans=solve(op1,op2,operator);
           st1.push(ans);
        }
        
        st2.pop();
     }
    }
    
    while(st2.size()!=0)
    {
          char operator=st2.pop();
           int op2=st1.pop();
           int op1=st1.pop();
           
           int ans=solve(op1,op2,operator);
           st1.push(ans);
    }
    
    System.out.println(st1.peek());
   
 }
}