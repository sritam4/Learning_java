import java.util.*;
public class upperTolower {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a UPPER CASE character to convert it into LOWER CASE :");
        char ch= sc.next().charAt(0);
        tolower(ch);
    }

    public static void tolower(char ch){
        // System.out.println((int)ch);
        // System.out.println(ch | 32);
        System.out.println((char)( ch | ' '));  //32 is ASCII value of ' '.
    }
}

//We can get the ASCII value of a lower case character by performig 'OR' operations with the ASCII values of the upper case character and space (' ').
//ASCII value of ' ' is 32.
