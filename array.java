import java.util.*;
class array{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [10];
        System.out.println("Enter 10 number into array :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nlength of the array arr is"+arr.length);
        
    }
}