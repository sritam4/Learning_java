import java.util.*;
public class price_calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pen,pencil,book;
        System.out.println("Enter price of pen,pencil and book");
        pen=sc.nextFloat();
        pencil=sc.nextFloat();
        book=sc.nextFloat();
        float net=pen+pencil+book;
        System.out.println("total ="+ net);
        float gst=(0.18f)*net;
        System.out.println("gst   ="+ gst+"\n");
        System.out.print("Total after adding GST  :");
        System.out.println(net+gst);

    }
}
