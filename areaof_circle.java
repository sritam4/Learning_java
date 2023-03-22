import java.util.*;
public class areaof_circle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radious of circle  :");
        float r=sc.nextFloat();
        float area=3.14f*r*r;
        System.out.print("area of the circle is :");
        System.out.println(area);
    }

}