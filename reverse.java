import java.util.*;
public class reverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no. to reverse");
        int n=sc.nextInt();
        int reverse=0,ld,i;

        for(i=n;i!=0;i/=10)
        {
            ld=i%10;
            reverse=(reverse*10)+ld;
        }
        System.out.println("reverse no. is :"+reverse);

    }
}
