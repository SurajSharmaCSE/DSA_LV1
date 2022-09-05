public static int lastIndex(int[] arr, int idx, int x)
    {
       
       //Base Condition
       if(idx==arr.length)
       {
           return -1;
       }
       // faith
       int f1=lastIndex(arr,idx+1,x);
      // My Work
       if(f1==-1)
       {
           if(arr[idx]==x)
           {
               return idx;
           }
           else
           {
               return -1;
           }
       }
       return f1;
    }
