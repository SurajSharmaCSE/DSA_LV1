public static void displayArrReverse(int[] arr, int idx) {

    //base condition
     if(idx==arr.length)
     {
        return;
     }

    

    //faith or expection

    displayArrReverse(arr,idx+1);

     // My work
     System.out.println(arr[idx]);

}