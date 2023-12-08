public static void removeLeaves(Node node) {
    // write your code here
    // step-2 - checking in postordering is any childeren size==0 or nor
    for(int i=0;i<node.children.size();i++)
    {
      // get a child of next node
      Node child=node.children.get(i);
      // check arraylist size of child , Zero or not
      if(child.children.size()==0)
      {
        node.children.remove(child);
        i--;
      }
    }

    // step 1
    for(Node child:node.children)
    {
      removeLeaves(child);
    }
  }