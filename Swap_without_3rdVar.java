import java.util.*;
public class Swap_without_3rdVar {
    //Here we are using XOR to swap two values  :
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping  \nA = "+a+"\nB = "+b);

        //another approach to Swap without using 3rd variable
        // a=a+b;
        // b=a-b;
        // a=a-b;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A :");
        int a=sc.nextInt();
        System.out.println("Enter B :");
        int b=sc.nextInt();
        swap(a, b);
    }
}
