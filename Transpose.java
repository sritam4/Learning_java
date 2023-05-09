import java.util.*;
public class Transpose {
    public static void transpose(int arr[][])
    {
        int n=arr.length;
        int m=arr[0].length;
        int transpose_arr[][]=new int[m][n];

        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++)
            {
                transpose_arr[row][col] = arr[col][row];
            }
        }
        System.out.println("Transpose of the array is  :");
        display(transpose_arr);
    }

    public static void display(int arr[][]){
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=4;
        int m=6;
        int arr[][]=new int[n][m];

        System.out.println("Enter "+m*n+" elements in the array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array before transpose is   :");
        display(arr);
        transpose(arr);
            
    }
}
