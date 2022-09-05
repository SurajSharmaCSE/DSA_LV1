public static void displayArr(int[] arr, int idx){

    //base condition
     if(idx==arr.length)
     {
        return;
     }

     // My work
     System.out.println(arr[idx]);

    //faith or expection

    displayArr(arr,idx+1);
    
}
