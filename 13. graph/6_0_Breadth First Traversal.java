
static class Edge {
    int src;
    int nbr;

    Edge(int src, int nbr) {
       this.src = src;
       this.nbr = nbr;
    }
 }
 public static class pair
 {
    int vtx;
    String psf;

    public pair(int vtx,String psf)
    {
        this.vtx=vtx;
        this.psf=psf;
    }
 }
// --------------------------IN Main Fuction----------

      // write your code here  
      Queue<pair>q=new ArrayDeque();
      boolean visited[]=new boolean[vtces];

      q.add(new pair(src,src+""));
      while(q.size()>0)
      {
         // step-1: remove node from queue
         pair rp=q.remove();

         // step-2: check is it visited or note   
         if(visited[rp.vtx]==false)
         {
            // step-3: mark visited and print
            visited[rp.vtx]=true;
            System.out.println(rp.vtx+"@"+rp.psf);

            // step-4: Add they vartex unvisited navaour
            for(Edge e:graph[rp.vtx])
            {
                 int nbr=e.nbr;
                 if(visited[nbr]==false)
                 {
                    // add in queue
                    q.add(new pair(nbr,rp.psf+nbr));
                 }
            }
         }   
      }