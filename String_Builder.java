public class String_Builder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        //adding one by one character
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }//Time complixity is O(26  )
        System.out.println("The new string is :\n"+sb);
    }
}
