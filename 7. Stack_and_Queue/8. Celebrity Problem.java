public static void findCelebrity(int[][] arr) {
    // My Code

    // Step1 - Push All the celebrity in stack
    Stack<Integer> st=new Stack<>();
    
    for(int i=0;i<arr.length;i++)
    {
        st.push(i);
    }

    // Step 2- pop 2 celeberity from stack and check its know each other and after checking push 1 potential celebrity

    while(st.size()>=2)
    {
        int i=st.pop();
        int j=st.pop();

        if(arr[i][j]==1)
        {
            // i know j --> i is not a celebrity
            st.push(j); 
        }
        else
        {
            // i does't know j --> j is not a celebrity 
            st.push(i);
        }
    }
    
    // we get a potential_celebrity 
    int pot =st.pop();

    // step - 4 => check row wise and colum wise it real celebrity or not

    for(int i=0;i<arr.length;i++)
    {
        if(i!=pot)
        {
            if(arr[i][pot]==0|| arr[pot][i]==1)
            {
                System.out.println("none");
                return;
            }
        }
    }

    System.out.println(pot);

    
}