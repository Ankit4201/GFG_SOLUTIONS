//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        
        // code here
        int n=S.length();
        int start=0;
        int end=n-1;
        boolean isPalin=true;
        while(start<=end)
        {
            if(S.charAt(start)!=S.charAt(end))
            {
                isPalin=false;
                break;
            }
            start++;
            end--;
        }
        if(isPalin)
           return 1;
        else
           return 0;
    }
}