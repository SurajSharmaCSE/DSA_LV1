import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    // code
     Deque<Integer> dq=new ArrayDeque<>();
    // Code for First K element 
    for(int i=0;i<k;i++)
    {
       while(dq.size()>0&&a[dq.getLast()]<a[i])
       {
           dq.removeLast();
       }
       dq.addLast(i);
    }

    // Print ans
    System.out.println(a[dq.peek()]);

    // Code for rest window
    for(int i=k;i<n;i++)
    {
        while(dq.size()>0&&a[dq.getLast()]<a[i])
       {
           dq.removeLast();
       }
        dq.addLast(i);

        if(dq.peek()<=i-k)
        {
           dq.removeFirst();
        }
         System.out.println(a[dq.getFirst()]);
    }
 }
}