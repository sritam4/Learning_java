import java.util.Scanner;

public class input_control {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. :");

        do{
            int a=sc.nextInt();

            if(a%10==0)
            {
                break;
            }
        }while(true);

        System.out.println("you had entered a multiple of 10");
    }
}
