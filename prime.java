import java.util.*;
public class prime {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        boolean isprime=true;
        int i=2;
        while(i<n)
        {
           if(n%i==0)
           {
                isprime=false;
                break;
           }
           i++;
        }
        if(isprime==true)
        {
            System.out.println("Prime No.");
        }
        else{
            System.out.println("Composite no.");
        }
    }
    
}
