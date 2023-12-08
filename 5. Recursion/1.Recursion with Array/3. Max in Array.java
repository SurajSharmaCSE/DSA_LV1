public static int maxOfArray(int[] arr, int idx){
    //base condition
    if(idx==arr.length)
    {
        return Integer.MIN_VALUE;
    }

    //faith
    int f1=maxOfArray(arr,idx+1);

    //My work
    int max=Math.max(f1,arr[idx]);

    return max;
}