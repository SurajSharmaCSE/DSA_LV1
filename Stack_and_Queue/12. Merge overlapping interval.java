// main LOGIC  CODE START-------------------------------

public static void mergeOverlappingIntervals(int[][] arr) {
    // merge overlapping intervals and print in increasing order of start time
  // step 2=> start - make pair array and store in given 2d pair value
    pair[] pairs_arr=new pair[arr.length];
    for(int i=0;i<arr.length;i++)
    {
        pairs_arr[i]=new pair(arr[i][0],arr[i][1]);
    }
//   step 2=> end

// step 3 => start -> sort the pair array using Arrays.sort() function
    Arrays.sort(pairs_arr);
// step 3 => start ->

// step 4 i.e final => start 
    // main logic statre ----------------
    Stack<pair> st=new Stack<>();
    for(int i=0;i<arr.length;i++)
    {
        if(i==0)
        {
            st.push(pairs_arr[i]);
        }
        else
        {
            pair top=st.peek();
            if(pairs_arr[i].st>top.et)
            {
                st.push(pairs_arr[i]);
            }
            else
            {
                top.et=Math.max(top.et,pairs_arr[i].et);
            }
        }
    }
    
    // main logic end----------------
// step 4 i.e final => end
  
    Stack<pair> rs=new Stack<>();
    while(st.size()>0)
    {
        rs.push(st.pop());
    }

   // print our ans
   while(rs.size()>0)
   {
       pair val=rs.pop();
       System.out.println(val.st+" "+val.et);
   }

}

// step1 -1 => start
// Make pair class
public static class pair implements Comparable<pair>
{
    int st;  // starting
    int et; // ending 

    pair(int st,int et)
    {
        this.st=st;
        this.et=et;
    }
    
    // this>other return +ve
    // this==other return 0
    // this<other return -ve
    public int compareTo(pair other)
    {
        if(this.st!=other.st)
        {
            return this.st-other.st;
        }
        else
        {
            return this.et-other.et;
        }
    }
}
// step1 -1 => start

// main LOGIC  CODE END-------------------------------



// full code run in anywhere
// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[][] arr = new int[n][2];

//         for (int j = 0; j < n; j++) {
//             String line = br.readLine();
//             arr[j][0] = Integer.parseInt(line.split(" ")[0]);
//             arr[j][1] = Integer.parseInt(line.split(" ")[1]);
//         }

//         mergeOverlappingIntervals(arr);
//     }

//     public static void mergeOverlappingIntervals(int[][] arr) {
//         // merge overlapping intervals and print in increasing order of start time
//       // step 2=> start - make pair array and store in given 2d pair value
//         pair[] pairs_arr=new pair[arr.length];
//         for(int i=0;i<arr.length;i++)
//         {
//             pairs_arr[i]=new pair(arr[i][0],arr[i][1]);
//         }
//     //   step 2=> end
    
//     // step 3 => start -> sort the pair array using Arrays.sort() function
//         Arrays.sort(pairs_arr);
//     // step 3 => start ->

//     // step 4 i.e final => start 
//         // main logic statre ----------------
//         Stack<pair> st=new Stack<>();
//         for(int i=0;i<arr.length;i++)
//         {
//             if(i==0)
//             {
//                 st.push(pairs_arr[i]);
//             }
//             else
//             {
//                 pair top=st.peek();
//                 if(pairs_arr[i].st>top.et)
//                 {
//                     st.push(pairs_arr[i]);
//                 }
//                 else
//                 {
//                     top.et=Math.max(top.et,pairs_arr[i].et);
//                 }
//             }
//         }
        
//         // main logic end----------------
//     // step 4 i.e final => end
      
//         Stack<pair> rs=new Stack<>();
//         while(st.size()>0)
//         {
//             rs.push(st.pop());
//         }

//        // print our ans
//        while(rs.size()>0)
//        {
//            pair val=rs.pop();
//            System.out.println(val.st+" "+val.et);
//        }

//     }

// // step1 -1 => start
//     // Make pair class
//     public static class pair implements Comparable<pair>
//     {
//         int st;  // starting
//         int et; // ending 

//         pair(int st,int et)
//         {
//             this.st=st;
//             this.et=et;
//         }
        
//         // this>other return +ve
//         // this==other return 0
//         // this<other return -ve
//         public int compareTo(pair other)
//         {
//             if(this.st!=other.st)
//             {
//                 return this.st-other.st;
//             }
//             else
//             {
//                 return this.et-other.et;
//             }
//         }
//     }
//     // step1 -1 => start

// }