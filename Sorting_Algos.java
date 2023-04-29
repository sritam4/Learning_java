import java.util.*;
public class Sorting_Algos {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter 10 no.s in the array");
        // int arr[]=new int[10];
        // for(int i=0;i<10;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        int arr[]={1,15,18,777};
        bubblesort(arr);
        insertionsort(arr);
    }

// display Function-----------------------------
    public static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

//code for bobble sort algorithm................................
    public static int bubblesort(int arr[])
    {
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++)
        {
            boolean swap=false;

            for(int j=0;j<n-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap the values
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];

                    swap=true;
                }
            }
            if(swap==false)
            {
                display(arr);
                return 0;
            }
        }
        display(arr);
        return 0;
    }

//code for Insertion sort algorithm ...........................................
    public static void insertionsort(int arr[]){
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++)
        {
            int minpos=turn;
            for(int i=turn+1;i<n;i++)
            {
                //finding the smallest element
                if(arr[minpos]>arr[i])
                {
                    minpos=i;
                }
            }
            //swapping smallest element and arr[turn]
            int temp=arr[turn];
            arr[turn]=arr[minpos];
            arr[minpos]=temp;
        }
        display(arr);
    }

}
