public class Largest_string {
    public static String getlargest(String arr[]){
        String largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        String fruits[]={"apple","mango","banana","graps","water mellon"};

        System.out.println("the largest string is "+getlargest(fruits));
    }
}
