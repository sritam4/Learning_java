import org.w3c.dom.TypeInfo;

public class wrapper_class{
    public static void main(String args[]){
        int i=10;

        Integer obj1= new Integer(i);  //convertig Premetive no. to Object no.
        System.out.println("obj1=" +obj1);

        int a=obj1.intValue();  // converting Object no. to premetive no. type
        System.out.println("a ="+a);

        String str=Integer.toString(a);  //converting integer no. to string no.
        System.out.println("Integer a in string ="+str);
        
        int b=Integer.parseInt(str);  //converting String into number 
        System.out.println("b= "+b);

        Integer obj2=Integer.valueOf(obj1); //convrting string object to Numeric object
        System.out.println("obj2 ="+obj2);
    }
    
}