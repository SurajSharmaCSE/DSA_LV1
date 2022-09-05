public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int size(Node node) {
    // write your code here
    // base case
    if(node==null)
    {
      return 0;
    }
    // faith
    int ls=size(node.left);
    int rs=size(node.right);
    //My work
    return ls+rs+1;


  }

  public static int sum(Node node) {
    // write your code here
    if(node==null)
    {
      return 0;
    }
    int left_sum=sum(node.left);
    int right_sum=sum(node.right);

    return left_sum+right_sum+node.data;
  }

  public static int max(Node node) {
    // write your code here
    if(node==null)
    {
      return Integer.MIN_VALUE;
    }
    int left_max=max(node.left);
    int right_max=max(node.right);

    int ans=Math.max(node.data,Math.max(left_max,right_max));
    return ans;
  }

  public static int height(Node node) {
    // write your code here
    if(node==null)
    {
      return -1;
    }
    int left_h=height(node.left);
    int right_h=height(node.right);

    int myh=Math.max(left_h,right_h)+1;
    return myh;

  }
