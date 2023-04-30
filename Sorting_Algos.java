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
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubblesort(arr); 
        selectionsort(arr);
        insertionsort(arr);
        Arrays.sort(arr);
        display(arr);
        countingsort(arr);
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
                if(arr[j]>arr[j+1])  //arr[j]<arr[j+1]  for descending order
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

//code for selection sort algorithm ...........................................
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int turn=0;turn<n-1;turn++)
        {
            int minpos=turn;
            for(int i=turn+1;i<n;i++)
            {
                //finding the smallest element
                if(arr[minpos]>arr[i])   //arr[minpos]<arr[i] for descending order
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

// code for insertion sort algorithm ---------------------------------------------
    public static void insertionsort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            //finding correct pos to insert the element
            while(prev>=0 && arr[prev]>curr)  //arr[prev]<curr for descending order
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
        display(arr);
    }

//code for counting sort-----------------------------------------------------
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];

        //caclculating frequencies of each elaments
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++)  //for(int i=count.length-1;i>=0;i--)  for descending order
        {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        display(arr);
    }

}
