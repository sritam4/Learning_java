import java.util.*;
public class array_reversal {
    public static void reverse(int arr[])
    {
        int first=0,last=arr.length-1;

        while(first<last)
        {
            arr[first]= arr[first]+arr[last];
            arr[last]= arr[first]-arr[last];
            arr[first]= arr[first]-arr[last];

            first ++;
            last--;
        }
    }

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter 10 numbers into the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        reverse(arr);
        print(arr);
    }
}
