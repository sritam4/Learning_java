// import java.util.*;
public class char_pattern {
    public static void main( String args[]){

        int n=4,i,j;
        char ch= 'A';

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }


    }
    
}
