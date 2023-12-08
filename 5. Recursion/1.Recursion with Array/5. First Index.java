public static int firstIndex(int[] arr, int idx, int x){
    // base canodition
    if(idx==arr.length)
    {
        return -1;
    }

    if(x==arr[idx])
    {
        return idx;
    }
    else
    {
    // faith
    return firstIndex(arr,idx+1,x);

    }