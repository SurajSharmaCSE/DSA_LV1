public class 6_Queue_To_Stack_Adapter_popEfficency {

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
          // main logic
            // step-1 => remvoe all element from mainQ and add in helper Queue
            while(mainQ.size()>0)
            {
              helperQ.add(mainQ.remove());
            }
            // step-2 add our val i.e push val
            mainQ.add(val);
            // step-3 => remvoe all element from helperQ and add in mainQ Queue
            while(helperQ.size()>0)
            {
              mainQ.add(helperQ.remove());
            }
          
        }
    
        int pop() {
          // write your code here
          if(size()==0)
          {
            System.out.println("Stack underflow");
            return -1;
          }
          return mainQ.remove();
        }
    
        int top() {
          // write your code here
          if(size()==0)
          {
            System.out.println("Stack underflow");
            return -1;
          }
          return mainQ.peek();
        }
      }
    
}
