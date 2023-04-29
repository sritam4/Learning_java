import java.util.*;
public class ComplexNo {
    public static void main(String args[])
    {
        Complex num1=new Complex();
        num1.getnum();
        Complex num2= new Complex();
        num2.getnum();

        Complex.sum(num1, num2);
        Complex.sub(num1, num2);
        Complex.mul(num1, num2);

    }
}

class Complex{
    int real;
    int img;

    void getnum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary part of number");
        this.real=sc.nextInt();
        this.img=sc.nextInt();
    }
    static void sum(Complex a,Complex b){
        int realsum=a.real+b.real;
        int imgsum=a.img+b.img;
        System.out.println("Sum :   "+realsum+" + "+imgsum+"i");
    }

    static void sub(Complex a,Complex b){
        int realsub=a.real-b.real;
        int imgsub=a.img-b.img;
        if(imgsub>=0)
            System.out.println("Sub :   "+realsub+" + "+imgsub+"i");
        else
            System.out.println("Sub :   "+realsub +""+imgsub+"i");

    }

    static void mul(Complex a,Complex b){
        int realmul=a.real * b.real-a.img * b.img;
        int imgmul=a.real * b.img+a.img * b.real;
        System.out.println("Mul :   "+realmul+" + "+imgmul+"i");
    }
}
