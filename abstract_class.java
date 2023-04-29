public class abstract_class {
    public static void main(String args[])
    {
        Horse h=new Horse();
        h.walk();
    }
}

abstract class animal{
    void eat(){
        System.out.println("animals eat");
    }
    abstract void walk();
}

class Horse extends animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}


// when we create an object of a class it 1st invoke the constrctor of the base class then the constructor of that class is invoked.
// if both the class animal and horse has constructors, then when object h is created the constructor of animal is 1st invoked and 
//then the constructor of horse will invoked.