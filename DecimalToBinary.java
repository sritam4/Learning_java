import java.util.*;
public class DecimalToBinary {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a decimal no.");
        int n=sc.nextInt();
        convert(n);
    }

    public static void convert(int n)
    {
        int r,bin=0,pow=0;
        while(n!=0)
        {
            r=n%2;
            bin=bin+r*((int)Math.pow(10,pow));
            n=n/2;
            pow++;
        }

        System.out.println("Binary no is  :"+bin);
    }
}
