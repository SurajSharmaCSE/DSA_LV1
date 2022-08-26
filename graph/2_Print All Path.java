  // my code
  public static void AllPath(ArrayList<Edge>graph[],int src,int dest,boolean visited[],String asf)
  {
     //base case
     if(src==dest)
     {
        System.out.println(asf);
        return;
     }
     // main logic
     visited[src]=true;
     for(Edge e:graph[src])
     {
        int nbr=e.nbr;
        if(visited[nbr]==false)
        {
          AllPath(graph,nbr,dest,visited,asf+nbr);
           
        }
     }
     visited[src]=false;
  }
  