public static class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
    }

    int size() {
      // write your code here
      return mainQ.size();
    }

    void push(int val) {
      // write your code here
       mainQ.add(val);
    }

    int pop() {
      // write your code here

      if(size()==0)
      {
        System.out.println("stack underflow");
        return -1;
      }
      else
      {
        while(mainQ.size()>1)
        {
          helperQ.add(mainQ.remove());
        }
        int val=mainQ.remove();
        

        // again push helperQ value into mainQ
        while(helperQ.size()>0)
        {
          mainQ.add(helperQ.remove());
        }
        
        return val;
      }

    }

    int top() {
      // write your code here

      // Base case
      if(size()==0)
      {
        System.out.println("stack underflow");
        return -1;
      }
      // MainLogic
      else
      {
        // Remove value from mainQ and push in helperQ
        while(mainQ.size()>1)
        {
          helperQ.add(mainQ.remove());
        }
        // capture our value
        int val=mainQ.remove();
        // Again push capture value in hellper Q
        helperQ.add(val);

        // again push helperQ value into mainQ
        while(helperQ.size()>0)
        {
          mainQ.add(helperQ.remove());
        }

        return val;
      }
    }