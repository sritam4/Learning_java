import java.util.*;
public class patterns {
    public static void hollow_rectangle (int r,int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1||i==r||j==1||j==c)
                    System.out.print(" "+"*");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }

    static void flipped_halfPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    static void inverted_halfpyramid(int n)
    {
        for(int i=n;i>=0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyds_traingle(int n)
    {
        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+x);
                x++;
            }
            System.out.println();
        }
    }

    public static void triangleOf0_1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                    System.out.print("1"+" ");
                else
                    System.out.print("0"+" ");
            }
            System.out.println();
        }
    }


    public static void butterfly(int n)
    {
        //FIRST HALF
        for(int i=1;i<=n;i++) 
        {
            for(int j=i;j>=1;j--) //initial stars
            {
                System.out.print("*"+" ");   
            }
            for(int j=1;j<=2*(n-i);j++) //middle spaces
            {
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--) //ending stars
            {
                System.out.print("*"+" ");   
            }

            System.out.println();
        }
        //2nd HALF
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j>=1;j--) //initial stars
            {
                System.out.print("*"+" ");   
            }
            for(int j=1;j<=2*(n-i);j++) //middle spaces
            {
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--) //ending stars
            {
                System.out.print("*"+" ");   
            }

            System.out.println();
        }
    }

    public static void rhombus(int h,int w)
    {
        for(int i=1;i<=h;i++)
        {
            for(int j=h-i;j>0;j--) //prints spaces
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=w;j++) //prints stars
            {
                System.out.print("*"+" ");
            }
            System.out.println(); 
       }
    }

    public static void hollow_rhombus(int h,int w)
    {
        for(int i=1;i<=h;i++)
        {
            for(int j=h-i;j>0;j--)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=w;j++)
            {
                if(i==1||i==h||j==1||j==w)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }

    public static void diamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //SECOND HALF
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" "+" ");
            }
            
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
// --------------------------------driver code
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int x;

       do
       {
            System.out.println("----------------------------PRINT THE PATTERNS--------------------------\n");
            System.out.println("Choose your option from below. ");
            System.out.print(" 1)Hollow rectangle\n 2)Flipped half pyramid \n 3)Inverted half pyramid \n 4)Floyds triangle\n 5)pyramid of 0 & 1\n"); 
            System.out.println(" 6)Butterfly Pattern \n 7)Solid rhombus \n 8)Hollow rhombus\n 9)Diamond \n 10)To exit");
            System.out.println("Enter your choice  :");
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:{
                    System.out.println("Enter height and width of rectangle");
                    int row=sc.nextInt();
                    int column=sc.nextInt();
                    hollow_rectangle(row,column);
                    break;
                }
                case 2:{
                    System.out.println("Enter the height of Pyramid");
                    int n=sc.nextInt();
                    flipped_halfPyramid(n);
                    break;
                }
                 case 3:{
                    System.out.println("Enter the height of Pyramid");
                    int n=sc.nextInt();
                    inverted_halfpyramid(n);
                    break;
                }
                case 4:{
                    System.out.println("Enter the height of traingle");
                    int n=sc.nextInt();
                    floyds_traingle(n);
                    break;
                }
                case 5:{
                    System.out.println("Enter the height of Pyramid");
                    int n=sc.nextInt();
                    triangleOf0_1(n);
                    break;
                }
                case 6:{
                    System.out.println("Enter the height of butterfly");
                    int h=sc.nextInt();
                    int n=h/2;
                    butterfly(n);
                    break;
                }
                case 7:{
                    System.out.println("Enter the height and width of rhombus");
                    int h=sc.nextInt();
                    int w=sc.nextInt();
                    rhombus(h,w);
                    break;
                }
                case 8:{
                    System.out.println("Enter the height and width of rhombus");
                    int h=sc.nextInt();
                    int w=sc.nextInt();
                    hollow_rhombus(h, w);
                    break;
                }
                case 9:{
                    System.out.println("Enter the height of diamond");
                    int n=sc.nextInt();
                    diamond(n);
                    break; 
                }
                case 10:{
                    break;
                }
                default :{
                    System.out.println("Enter correct option");
                }
                
            }
            System.out.println("Do you want to continue ? Press 1 to continue");
            x=sc.nextInt();
       }while(x==1);

        
    }
}
