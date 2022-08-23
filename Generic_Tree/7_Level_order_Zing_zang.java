public static void levelOrderLinewiseZZ(Node node){
    // write your code here
    Stack<Node>c1=new Stack<>();
    Stack<Node>c2=new Stack<>();

    // step-2 given variable level=0
    int level=0;
    c1.push(node);

    while(c1.size()>0)
    {
      // step-2 pop and print
      node=c1.pop();
      System.out.print(node.data+" ");
      // step-2 checking level even or odd
      if(level%2==0)
      {
        for(int i=0;i<node.children.size();i++)
         {
           Node child=node.children.get(i);
           c2.push(child);
         }
      }
      else
      {
        for(int i=node.children.size()-1;i>=0;i--)
         {
           Node child=node.children.get(i);
           c2.push(child);
         }
      }
      // step- 4 
      if(c1.size()==0)
      {
        c1=c2;
        c2=new Stack<>();
        level++;
        System.out.println();
      }
    }
  

  }
