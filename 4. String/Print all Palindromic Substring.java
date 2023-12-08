import java.io.*;
import java.util.*;

public class Main {
	public static boolean isPalindrome(String str){

		int left=0;
		int right=str.length()-1;

		while(left<right){
			if(str.charAt(left)!=str.charAt(right)){
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void solution(String str){
		//write your code here
		for(int si=0;si<str.length();si++){
			for(int ei=si;ei<str.length();ei++){
				if(isPalindrome(str.substring(si,ei+1))){
					System.out.println(str.substring(si,ei+1));
				}
			}

		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
