import java.util.*;

public class factorial {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. :");
        int n=sc.nextInt();
        int fact=factorial_calculator(n);
        System.out.println("factorial ="+fact);
    }

    public static int factorial_calculator(int n){ 
        int x=1;
        for(int i=n;i>=1;i--)
        {
            x=x*i;
        }
        return x;
    }
    
}
