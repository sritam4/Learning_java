import java.util.*;
public class largest 
{
    public static void getlargest(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
            if(smallest>arr[i])
            {
                smallest=arr[i];
            }
        }
        if(largest==smallest){
            System.out.println("marks are same");
        }
        else{
            System.out.println("largest marks is :"+largest);
            System.out.println("smallest marks is :"+smallest);
        }

    }

    public static void main(String args[])
    {
        int marks[]={30,30,40,10};
        getlargest(marks);
    }
}
