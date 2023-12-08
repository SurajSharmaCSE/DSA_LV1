
   // CODE Start -------
 // create a class BST pair that contain min max boolean for every stage
 public static class BST_pair
 {
   int min;
   int max;
   boolean IsBst;
   Node root;
   int size;
 }
  public static BST_pair IsBst(Node node)
  {
    // base condtion
    if(node==null)
    {
      BST_pair bp=new BST_pair();
      bp.IsBst=true;
      bp.max=Integer.MIN_VALUE;
      bp.min=Integer.MAX_VALUE;
      bp.root=null;
      bp.size=0;

      return bp;
    }
       
       // main logic
       BST_pair lp=IsBst(node.left);
       BST_pair rp=IsBst(node.right);

       BST_pair mp=new BST_pair();

       mp.min=Math.min(Math.min(lp.min,rp.min),node.data);
       mp.max=Math.max(Math.max(lp.max,rp.max),node.data);
       
      //  main logic for this code
       mp.IsBst=lp.IsBst==true && rp.IsBst==true && (lp.max<node.data && rp.min>node.data);

       if(mp.IsBst==true)
       {
         mp.root=node;
         mp.size=lp.size+rp.size+1;
       }
       else if(lp.size>rp.size)
       {
         mp.root=lp.root;
         mp.size=lp.size;
       }
       else
       {
         mp.root=rp.root;
         mp.size=rp.size;
       }
       return mp;
      // main logic end 
  }