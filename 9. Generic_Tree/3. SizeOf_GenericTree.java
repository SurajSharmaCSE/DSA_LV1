public static int size(Node node){
    // write your code here
    if(node==null)
    {
      return 1;
    }
     int sz=0;
    // FAITH
    for(Node child:node.children)
    {
      sz+=size(child);
    }

    // My Work
     return sz+1;

  }
