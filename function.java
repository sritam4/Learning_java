import java.util.*;
public class function{

    public static int add(int x,int y)   //formal parameters
    {
        int s=x+y;
        return s;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no. :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=add(a,b);       //actual parameters or arguments 
        System.out.println("sum of two no. is"+sum);

    }
}

