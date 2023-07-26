//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long[] answer = new long[2];
        long min = Long.MAX_VALUE;;
        long min_two = Long.MAX_VALUE;;
        
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        
        answer[0] = min;
        
        for(int j=0;j<n;j++){
            if(a[j]<min_two && a[j]>min){
                min_two = a[j];
            }
        }
        
        answer[1] = min_two;
        
        if(min == Long.MAX_VALUE || min_two == Long.MAX_VALUE){
            answer[0] = -1;
            answer[1]= -1;
        }
        
        
        
        return answer;
    }
}
