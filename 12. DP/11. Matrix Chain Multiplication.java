// gfg
class Solution{
    public static int helper(int arr[],int i,int j,int dp[][])
    {
        if(i>=j)
        {
            return 0;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        // main logic
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int ans1=helper(arr,i,k,dp);
            int ans2=helper(arr,k+1,j,dp);
            int myans=arr[i-1]*arr[k]*arr[j];
            myans+=ans1+ans2;
            
            if(ans>myans)
            {
                ans=myans;
            }
        }
        return dp[i][j]=ans;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int dp[][]=new int[N+1][N+1];
        for(int a[]:dp)
        {
            Arrays.fill(a,-1);
        }
        int ans=helper(arr,1,N-1,dp);
        return ans;
    }
}