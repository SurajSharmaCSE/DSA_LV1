import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> ans = getMazePaths(0,0,n,m);
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // Base Case
          if(sr==dr-1&&sc==dc-1)
          {
              ArrayList<String> base1 = new ArrayList<>();
              base1.add("");
              return base1;
          }
          if(sr>dr||sc>dc)
          {
              ArrayList<String> base2 = new ArrayList<>();
              return base2;
          }

        // faith-1 for horizontal or row direvtion
        ArrayList<String> r1 = getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> r2 = getMazePaths(sr+1,sc,dr,dc);

        // My Work
        ArrayList<String> Myans = new ArrayList<>();

        // add verical(v)
        for(int i=0;i<r1.size();i++)
        {
            Myans.add("h"+r1.get(i));
        }
        for(int i=0;i<r2.size();i++)
        {
            Myans.add("v"+r2.get(i));
        }

        return Myans;
        

    }

}