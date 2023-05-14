import java.util.*;
public class Anagram {
    public static void main(String args[])
    {
        String str1="Earth";
        String str2="Heart";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length())
        {
            //converting String to char arrray to sort
            char[] charstr1=str1.toCharArray();
            char[] charstr2=str2.toCharArray();

            //sorting the char array
            Arrays.sort(charstr1);
            Arrays.sort(charstr2);

            //chech wheather both the char array are identical or not
            boolean result = Arrays.equals(charstr1,charstr2);

            if(result){
                System.out.println(str1+" and "+str2+" are anagram to each other");
            }
            else{
                System.out.println(str1+" and "+str2+" are NOT anagram to each other");
            }
        }
        else{
            System.out.println(str1+"and"+str2+" are NOT anagram to each other");
        }
    }
}
