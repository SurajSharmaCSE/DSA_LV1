/*
  Approch:-
  1. make an Array ans for ANS
  2. Create Stack st 
  3. push last element of Array in Stack
  4. fill ans[n-1]=-1;
  5. Run Loop from i=n-2 to i>=0
  6. run loop while(st.size>0 and arr[i]>st.peek())
  7. if(st.size==0) then set ans[i]=-1
     else ans[i]=st.peek();
  8 and then push current element in stack;
*/

CODE:-

public static int[] solve(int[] arr){
   // solve
   int n=arr.length;
   int ans[]=new int[n];

   // step-1
   Stack<Integer> st=new Stack();
   ans[n-1]=-1;
   st.push(arr[n-1]);

   // step -2
   for(int i=n-2;i>=0;i--)
   {
     // pop all smaller element from stack
     while(st.size()>0 && arr[i]>st.peek())
     {
       st.pop();
     }
     // filing ans
     if(st.size()==0)
     {
       ans[i]=-1;
     }
     else
     {
       ans[i]=st.peek();
     }

     // push current Element
     st.push(arr[i]);
   }
   return ans;

 }
