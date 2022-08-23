public static boolean find(Node node, int data) {
    // write your code here
    // strp -1 First copara with node data
    if(node.data==data)
    {
      return true;
    }
    // step-2 , search the node baki ke children me
    for(Node child:node.children)
    {
      boolean ans=find(child,data);
      if(ans==true)
      {
        return true;
      }
    }
    return false;
  }