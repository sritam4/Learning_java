import java.io.*;
import java.util.*;

class sum
{
    int x,y,add;
    sum(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void addition(){
        add=x+y;
        System.out.println("Addition of two Number = "+add);
    }
}
class product extends sum
{
  int mul;
  product(int c,int d)
  {
    super(c,d);
    mul=c*d;
    System.out.println("Multiplication of two Number = "+mul);
  }  
}

class divide extends sum
{
    float div;
    divide(int e,int f)
    {
        super(e,f);
        div=e/f;
        System.out.println("Division Of Two Number = "+div);
    }
}

class hierarchical
{
    public static void main(String args[])
    {
        int i,j;
        System.out.println("Enter two number for addition,multiplication and division");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        divide obj = new divide(i,j);
        product obj1 = new product(i,j);
        obj.addition();
    }

}