public static void levelOrder(Node node){
    // write your code here
    // step-1 create queue
    Queue<Node> q=new ArrayDeque<>();
    // add node in queue
    q.add(node); 
   while(q.size()>0)
   {
     // step-2 remove and printy
    Node nn=q.remove();
    System.out.print(nn.data+" ");
    // step-3 add node children again in queue
    for(Node child:nn.children)
    {
      q.add(child);
    }
   }
   System.out.print(".");

  }