 import java.util.*;
 public class BinaryToDecimal {
    public static int convert(int x)
    {
        int ld,i=0,numb=0;

        while(x!=0)
        {
            ld=x%10;
            numb=numb+(ld* (int)Math.pow(2,i)); 
            i++;
            x=x/10;
           
        }
        return (int)numb;
       
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Binary no.");
        int bin=sc.nextInt();
        System.out.println("Decimal="+convert(bin));

    }
 }