import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

  public static void get_comp(ArrayList<Edge>graph[],int src,boolean visite[],ArrayList<Integer>curr_comp)
  {
     visite[src]=true;
     curr_comp.add(src);

     for(Edge e:graph[src])
     {
        int nbr=e.nbr;
        if(visite[nbr]==false)
        {
           get_comp(graph,nbr,visite,curr_comp);
        }
     }
  }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
      boolean visite[]=new boolean[vtces];
      // write your code here
      for(int i=0;i<vtces;i++)
      {
         if(visite[i]==false)
         {
            ArrayList<Integer>curr_comp = new ArrayList<>();
            get_comp(graph,i,visite,curr_comp);
            ans.add(curr_comp);
         }
      }

      System.out.println(ans);
   }
}