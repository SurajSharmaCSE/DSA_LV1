import java.io.*;
import java.util.*;

public class Main{

    public static int precedance(char x)
    {
        if(x=='+'||x=='-')
        {
            return 1;
        }
        else if(x=='*'||x=='/')
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
    Stack<String> st1=new Stack<>(); // for prefix
    Stack<Character> st2=new Stack<>(); // for operator
    Stack<String> st3=new Stack<>();     // for postfix



    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);

        if(ch>='a'&&ch<='z')
        {
            st1.push(ch+"");
            st3.push(ch+"");
        }
        else if(ch=='(')
        {
            st2.push(ch);
        }
        else if(ch=='+'|| ch=='-'||ch=='*'|| ch=='/')
        {
            while(st2.size()>0 && precedance(st2.peek())>=precedance(ch)) 
            {
                 // Make Ans --> prefix using stack 1
                 String op2= st1.pop();
                 String op1= st1.pop();
                 char operator= st2.peek();

                 st1.push(operator+op1+op2);

                 // Make ans Again for Postfix using stack 3
                 String opp2= st3.pop();
                 String opp1= st3.pop();
                 char operator2= st2.pop();

                 st3.push(opp1+opp2+operator2);

            }
            st2.push(ch);
        }
        else if(ch==')')
        {
            while(st2.peek()!='(')
            {
                // Make Ans --> prefix using stack 1
                 String op2= st1.pop();
                 String op1= st1.pop();
                 char operator= st2.peek();

                 st1.push(operator+op1+op2);

                 // Make ans Again for Postfix using stack 3
                 String opp2= st3.pop();
                 String opp1= st3.pop();
                 char operator2= st2.pop();

                 st3.push(opp1+opp2+operator2);
            }
            st2.pop();
        }
        else{
            // do noting
        }
       

    }
    while(st2.size()!=0)
    {
        // Make Ans --> prefix using stack 1
                 String op2= st1.pop();
                 String op1= st1.pop();
                 char operator= st2.peek();

                 st1.push(operator+op1+op2);

                 // Make ans Again for Postfix using stack 3
                 String opp2= st3.pop();
                 String opp1= st3.pop();
                 char operator2= st2.pop();

                 st3.push(opp1+opp2+operator2);
    }
    System.out.println(st3.pop());
    System.out.println(st1.pop());
 }
}