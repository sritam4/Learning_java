//Find maximum

import java.util.*;
public class Kadanes_algo {

    static void kadanes(int arr[])
    {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int ispositive=0;

        for(int i=0;i<arr.length;i++) //check wheather all elements in the array are -ve 
                                        //kadans algo doesn't work for a -ve array
        {
            if(arr[i]>0)
            {
                ispositive=1;
                break; 
            }
            else{
                maxSum=Math.max(maxSum,arr[i]); //returns the largest no
            }
        }

        if(ispositive==1) //if there is any +ve elements in the array we use kadans algorithm
        {
            for(int i=0;i<arr.length;i++)
            {
                currSum=currSum+arr[i];
                if(currSum<0)
                {
                    currSum=0;
                }
                maxSum=Math.max(currSum,maxSum);
                
            }
        }
           
        System.out.println("Maximum Sum is :"+maxSum);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of element in your array :");
        int n=sc.nextInt();
        int arr[]=new  int[n];
        System.out.println("enter Elements in your arrray :");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        kadanes(arr);
    }
    
}
