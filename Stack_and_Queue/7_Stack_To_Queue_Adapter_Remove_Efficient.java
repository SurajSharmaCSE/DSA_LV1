public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() 
    {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }

    int size() {
      // write your code here
      return mainS.size();
    }

    void add(int val) {
      // write your code here

    // Main Logic
      // step-1 => pop() all element from mainS and push helperS() 
      while(mainS.size()>0)
      {
        helperS.push(mainS.pop());
      }
      // step-2 => add our value i.e push val
      mainS.push(val);
      // step-3 => pop() all element from helperS and push in mainS() 
      while(helperS.size()>0)
      {
        mainS.push(helperS.pop());
      }
    }

    int remove() {
      // write your code here
      // base case
      if(size()==0)
      {
        System.out.println("Queue underflow");
        return -1;
      }
      return mainS.pop();
    }

    int peek() {
      // write your code here
       if(size()==0)
      {
        System.out.println("Queue underflow");
        return -1;
      }
      
      return mainS.peek();
    }
  }