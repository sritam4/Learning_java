import java.util.*;
public class EvenOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check Even or Odd  :");
        int a=sc.nextInt();

        check(a);
    }

    public static void check(int x){
        int bitmask=1;
        if((x & bitmask)==0){
            System.out.println(x +" is a Even number.");
        }
        else{
            System.out.println(x +" is a Odd number.");
        }
    }
}
