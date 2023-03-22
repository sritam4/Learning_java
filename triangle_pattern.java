import java.util.*;

public class triangle_pattern {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter height of tringle :");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
