import java.util.*;

public class Starecase_search {
    public static void starecase(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        boolean found=false;

        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("found at index "+row+","+col);
                found=true;
                break;
            }
            else if(key>arr[row][col]){
                row++;
            }
            else{
                col--;
            }
        }
        if(!found)
            System.out.println(key+" not found in the array ");
    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        int n=4;
        int m=4;
        int arr[][]=new int[n][m];
        System.out.println("Enter "+m*n+" elements in the array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element to search in the array");
        int key=sc.nextInt();

        starecase(arr, key);
        
    }
}
