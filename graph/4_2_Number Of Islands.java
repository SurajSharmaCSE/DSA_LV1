import java.io.*;
import java.util.*;

public class Main {

   public static void get_comp(int arr[][],int i,int j,boolean visited[][])
   {
      //base case
      if(i<0 || j<0 || i>=arr.length || j>=arr.length || arr[i][j]==1 || visited[i][j]==true)
      {
         return;
      }

      visited[i][j]=true;
      get_comp(arr,i-1,j,visited);
      get_comp(arr,i,j+1,visited);
      get_comp(arr,i,j-1,visited);
      get_comp(arr,i+1,j,visited);
   }
   
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      // write your code here
      boolean visited[][]=new boolean[arr.length][arr[0].length];
      int count=0;

      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<arr[i].length;j++)
         {
            if(arr[i][j]==0 && visited[i][j]==false)
            {
               get_comp(arr,i,j,visited);
               count++;
            }
         }
      }
      System.out.println(count);
   }

}