import java.io.*;
import java.util.*;

public class Main{

    public static int solve(int op1,int op2,char ch)
    {
        if(ch=='+')
        {
            return op1+op2;
        }
        else if(ch=='-')
        {
            return op1-op2;
        }
        else if(ch=='*')
        {
            return op1*op2;
        }
        else
        {
            return op1/op2;
        }
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> st1=new Stack<>(); // evaluation
    Stack<String> st2=new Stack<>();  // infix
    Stack<String> st3=new Stack<>();  // postfix

    for(int i=exp.length()-1;i>=0;i--)
    {
        char ch=exp.charAt(i);
        if(ch>='0'&&ch<='9')
        {
            st1.push(ch-'0');
            st2.push(ch+"");
            st3.push(ch+"");
        }
        else
        {
            // Make value of given expression
            int op1=st1.pop();
            int op2=st1.pop();
            int ans=solve(op1,op2,ch);
            st1.push(ans);

            // Make infix
            String opp1=st2.pop();
            String opp2=st2.pop();
            st2.push('('+opp1+ch+opp2+')');

            // postfix
            String oppp1=st3.pop();
            String oppp2=st3.pop();
            st3.push(oppp1+oppp2+ch);
        }
    }
    System.out.println(st1.pop());
    System.out.println(st2.pop());
    System.out.println(st3.pop());
 }
}