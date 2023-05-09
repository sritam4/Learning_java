import java.util.*;

public class Matrices{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int n=arr.length;
        int m=arr[0].length;
        System.out.println("enter "+m*n +" elements into array");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        display(arr);
        System.out.println("enter key to search   :");
        int key=sc.nextInt();
        search(arr, key);
    }

    public static void display(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j <arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j <arr[0].length;j++)
            {
                if(arr[i][j]==key)
                    System.out.println(key+" found at index "+"["+i+","+j+"]");
            }
            System.out.println();
        }
        System.out.println(key+"Not found in the array"); 
    }
}