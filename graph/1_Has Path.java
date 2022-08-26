public static boolean hasPath(ArrayList<Edge>graph[],int src,int dest,boolean visited[])
{
   //base case
   if(src==dest)
   {
      return true;
   }
   // main logic
   visited[src]=true;
   for(Edge e:graph[src])
   {
      int nbr=e.nbr;
      if(visited[nbr]==false)
      {
         boolean nTd=hasPath(graph,nbr,dest,visited);
         if(nTd==true)
         {
            return true;
         }
      }
   }
   return false;
}