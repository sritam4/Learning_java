import java.util.*;

public class Subarrays {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of element in your array  :");
        int totalIndex=sc.nextInt();
        int arr[]=new int[totalIndex];
        System.out.println("enter elements in your array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        get_subarray(arr);
    }

    public static void get_subarray(int arr[]) //This method prints all the Sub arrays of the given array
                                                //also print the sum of all subarrays and the max and min sum.
    {
        int curr;
        int highest=Integer.MIN_VALUE;
        int lowest= Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                curr=0;
                System.out.print("[");
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+",");
                    curr=curr+arr[k];
                }
                System.out.print("]"+"="+curr+"\t");
                count++;
                if(curr>highest)
                {
                    highest=curr;
                }
                if(curr<lowest)
                {
                    lowest=curr;
                }
                
            }
            System.out.println();
        }
        // we can calculate total no. of sub arrays by the formula
        // ts=n(n+1)/2;   where n is total no of elements
        System.out.println("total no. of sub arrays are   :"+ count);

        System.out.println("Sum of max subarray = "+highest);
        System.out.println("Sum of min subarray = "+lowest);
    }
    
}
