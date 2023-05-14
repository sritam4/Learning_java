import java.util.*;
public class Palindrom_String {
    public static boolean palindrom(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String   :");
        String name=sc.next();
        String result=palindrom(name)?"palindrom":"not palindrom";
        System.out.println("the String is "+ result);
    }
}
