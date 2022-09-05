import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        // Base Condtion
        if(n==0)
        {
            return 1;
        }
        
        //faith
        int p=power(x,n-1);

        // my work
         int ans=x*p;
        
        return ans;
    }

}