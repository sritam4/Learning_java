import java.util.*;
public class Shortest_path {
    public static void shortpath(String str)
    {
        int x=0;
        int y=0;
        int n=str.length();
        //Finding cordinate of destination----
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else{
                System.out.println("Invalid Input at "+i+1+"position of your string");
            }
        }

        // Finding the shortest path from Origin
        //formula for shortest path in cordinate geometry is  d = ( x2 − x1 )^2 + ( y2 − y1 )^2 
        float d;
        d=(float)Math.sqrt((x*x)+(y*y));  //here X1 and Y1 are 0 as we calculating from origin(0,0)
        System.out.println("Shortest distance from the initial position is "+d);
    }

    public static void main(String args[]){
        String path;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path string (IN BLOCK LETTER)");
        path=sc.next();
        shortpath(path);
    }
}
