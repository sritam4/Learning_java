import java.util.*;

public class Bit_Operations {
    //Getting the ith bit of a Number
    public static void get_ith_bit(int num){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter bit position to get  :");
        int i=sc.nextInt();
        int Bitmask=1<<i;
        if((num & Bitmask)==0){ 
            System.out.println(i+"th Bit is '0'");
        }
        else{
            System.out.println(i+"th Bit is '1'");
        }
    }
    
    //Setting the ith bit of a Number
    public static int set_ith_bit(int num){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter position to set  :");
        int i=sc.nextInt();
        int Bitmask=1<<i;
        int newno=(num | Bitmask);
        System.out.print("After setting the "+i+"th bit  :");
        bit_display(newno);
        System.out.println(" = "+newno);
        return newno;
    }

    //Clearing the ith bit of a Number
    public static int clear_ith_bit(int n){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter position to clear  :");
        int i=sc.nextInt();
        int Bitmask=~(1<<i);
        int newno=n & Bitmask;
        System.out.print("After clearing the "+i+"th bit  :");
        bit_display(newno);
        System.out.println(" = "+newno);
        return newno;
    }

    //Update the bit at a given position
    public static int update_ith_bit(int n){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the new Bit to Update ('0' or '1') : ");
        int newBit=sc.nextInt();
        if(newBit==1){
            return set_ith_bit(n);
        }
        else if(newBit==0){
            return clear_ith_bit(n);
        }
        else{
            System.out.println("Enter Valid bit '0' or '1' ");
            update_ith_bit(n);
        }
        return 0;

        //Second Approach
        // n=clear_ith_bit(n);
        // int Bitmask=newBit<<i;
        // return n | Bitmask;
    }

    //Clearing the last ith bits 
    public static int clear_last_ith_bit(int n){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many bits to clear from last :");
        int i=sc.nextInt();
        int Bitmask=(~0)<<i;
        int newno=n & Bitmask;
        System.out.print("After clearing last "+i+"th bit  :");
        bit_display(newno);
        System.out.println(" ="+newno);
        return newno;
    }

    //clearing the bits in given range
    public static int clear_in_range(int n){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting and ending index (from right) to clear :");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int a=(~0)<<j+1;   //111100000000
        int b=(1<<i)-1;    //000000001111
        int Bitmask=a | b; //111100001111
        int newno=n & Bitmask;
        System.out.print("After clearing the bits in given range  :");
        bit_display(newno);
        System.out.println(" ="+newno);
        return newno;
    }

    //Check if the number is power of 2
    public static void isPowerOf2(int n){
        if((n & (n-1)) ==0){
            System.out.println("Yes, The no. is power of 2");
        }
        else{
            System.out.println("No, The no. is NOT power of 2");
        }
    }

    //Count the the number of Set bits
    public static void count_Set_Bits(int n){
        int count=0;
        while(n!=0){
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println("Total set bit are :"+count);
    }      //  O(log n)

    //add 1 to an integer using Bit manipulation (using Bitwise NOT)
    public static void add_1(int n){
        // we know that -n=~n+1;
        // -~n=n+1;  or n+1=-~n;
        System.out.println(-~n); 
    }

    //Display the number in its Binary form 
    public static void bit_display(int n){
        int bin[]=new int[11];
        int i=0;
        if(n==0){
            System.out.print("0000");
        }
        while(n!=0){
            bin[i]=n%2;
            n/=2;
            i++;
        }
        //printing the array in reverse order
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the No. for Bit manipulation  :");
        int num=sc.nextInt();
        bit_display(num);
        System.out.println();
        // get_ith_bit(num);
        // num=set_ith_bit(num);
        // num=clear_ith_bit(num);
        // num=update_ith_bit(num);
        // num=clear_last_ith_bit(num);
        // num=clear_in_range(num);
        isPowerOf2(num);
        count_Set_Bits(num);
        add_1(num);
    }
}
