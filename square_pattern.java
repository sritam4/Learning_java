import java.util.*;

public class square_pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and column  :");
        int r,c,a=sc.nextInt();
        
        for(r=1;r<=a;r++)
        {
            for(c=1;c<=a;c++)
            {
                System.out.print("*");

            }

            System.out.print("\n");
        }
    }
}