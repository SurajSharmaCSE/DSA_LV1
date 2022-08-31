public static void HPC(ArrayList<Edge> graph[],int src1,int src2,boolean visited[],String asf,int vvasf)
{
   // Base Condition
   if(vvasf==graph.length-1)
   {
      System.out.print(asf);

      // check it cyclic graph or or path
      boolean check=false;

      for(Edge e: graph[src2])
      {
         int nbr=e.nbr;
         if(nbr==src1)
         {
            check=true;
            break;
         }
      }
      if(check==true)
      {
         System.out.print("*");
      }
      else
      {
         System.out.print(".");
      }
      System.out.println();
   }


   visited[src1]=true;
   for(Edge e:graph[src1])
   {
      int nbr=e.nbr;
      if(visited[nbr]==false)
      {
         HPC(graph,nbr,src2,visited,asf+nbr,vvasf+1);
      }
   }
   visited[src1]=false;
}