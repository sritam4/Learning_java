// write aprogram to input radious of a circle and find out its area

import java.util.*;
class circle{
    void area(float r)
    {
        float area=3.14f*(r*r);
        System.out.println("area of circle :"+area+" Sq");
    }
}

class AreaofCircle{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radious of a circle :");
        float rad=sc.nextFloat();
        circle C1=new circle();
        C1.area(rad);

    }
}