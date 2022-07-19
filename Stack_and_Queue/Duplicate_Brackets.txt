import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
       String exp=scn.nextLine();

       // step - creating Stack
       Stack<Character> st=new Stack();

       // step-2 travese one by one of charcter and check
       for(int i=0;i<exp.length();i++)
       {
          char ch=exp.charAt(i);
         if(ch==')')
         {
            if(st.peek()=='(')
            {
               System.out.println(true);
               return;
            }
            else
            {
               while(st.peek()!='(')
               {
                  st.pop();
               }
               st.pop();
            }
         }
         else
         {
            st.push(ch);
         }
       }
       System.out.println(false);

    }

}