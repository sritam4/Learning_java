import java.util.*;
public class SpiralMatrix {
    public static void spiral(int arr[][],int n, int m){
        int startrow=0;
        int endrow=n-1;
        int startcolumn=0;
        int endcolumn=m-1;

        while(startrow<=endrow && startcolumn<=endcolumn)
        {
            //printing upper row
            for(int i=startcolumn;i<=endcolumn;i++){
                System.out.print(arr[startrow][i] +" ");
            }
            //printing right column
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcolumn] +" ");
            }
            //printing bottom row
            for(int i=endcolumn-1;i>=startcolumn;i--){
                if(startrow==endrow){  //special condition to prevent double printing of a row
                    break;
                }
                System.out.print(arr[endrow][i] +" ");
            }
            //printing left column
            for(int i=endrow-1;i>startrow;i--){
                if(startcolumn==endcolumn){  //special condition to prevent double printing of a column
                    break;
                }
                System.out.print(arr[i][startcolumn] +" ");
            }

            //incrementing and decrementing the values of startrow, endrow, startcolumn and end column
            startrow ++;
            startcolumn ++;
            endrow --;
            endcolumn--;
        }   
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int m=5;
        int arr[][]=new int[n][m];
        System.out.println("enter "+m*n+" elements in the array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //printing array elements
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();

        spiral(arr, n, m);
    }
}
