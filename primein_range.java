import java.util.*;
public class primein_range{
    public static boolean isprime(int i)
    {
        int x=2;
        while(x<i)
        {
           if(i%x==0)
           {
                return false;
                
           }
           x++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range"); 
        int n= sc.nextInt();
        for (int i=2;i<=n;i++)
        {
           if(isprime(i))
           {
            System.out.print(i+" ");
           }

        }

    }
}