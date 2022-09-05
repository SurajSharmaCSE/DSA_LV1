public static int power(int x, int n){
    //base condition
    if(n==0)
    {
        return 1;
    }

    // faith
    int xnp=power(x,n/2);

    // my work
    int ans=xnp*xnp;

    if(n%2!=0)
    {
        ans*=x;
    }
    return ans;
}
