import java.io.*;
import java.util.*;

public class Main {

   // checkrer handler function
   public static boolean check(Stack<Character> st,char bracket)
   {
      if(st.size()==0)
      {
         return false;
      }
      else if(st.peek()!=bracket)
      {
         return false;
      }
      else
      {
         st.pop();
         return true;
      }
   }

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
   // Main Logic
    String str = scn.nextLine();
    Stack< Character> st = new Stack<>();

    for (int i = 0; i < str.length(); i++)
    {
      char ch = str.charAt(i);
      // opening bracket handle
      if (ch == '(' || ch == '[' || ch == '{')
      {
        st.push(ch);
      }
      // clossing braket handle
      else if (ch == ')')
      {
        boolean val = check(st, '(');
        if (val == false)
        {
          System.out.println(val);
          return;
        }
      }
      else if (ch == ']')
      {
        boolean val = check(st, '[');
        if (val == false)
        {
          System.out.println(val);
          return;
        }
      }
      else if (ch == '}')
      {
        boolean val = check(st, '{');
        if (val == false)
        {
          System.out.println(val);
          return;
        }
      }
      else{ }
    }
    if (st.size()!=0)
    {
      System.out.println(false);
    }
    else
    {
      System.out.println(true);
    }

  }
  
}