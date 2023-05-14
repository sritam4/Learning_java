import java.util.*;
public class Uppercase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // String name="hii' my name is sritam behera";
        System.out.println("Enter a String to capilatise");
        String name=sc.nextLine();
        System.out.println();
        System.out.println(touppercase(name));
    }
    public static String touppercase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                sb.append(str.charAt(i));
                i++;
                ch=Character.toUpperCase(str.charAt(i));
            }
            else{
                ch=str.charAt(i);
            }

            sb.append(ch);
        }
        return sb.toString();
    }
}
//Time complexity :O(n);