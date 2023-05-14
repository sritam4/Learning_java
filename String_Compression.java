import java.util.*;
public class String_Compression {
    public static String compression(String str) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++)
        {
            int count=1;
            sb.append(str.charAt(i));
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            if(count>1)
                sb.append(count);
        }
        return sb.toString();
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to Compress  :");
        String str=sc.nextLine();
        System.out.println("\nThe compressed String is :"+compression(str));
    }
}
