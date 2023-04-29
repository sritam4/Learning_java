public class inheritance {
    public static void main(String args[])
    {
        Fish shark=new Fish();
        shark.eats();
        shark.swim();
    }
    
}
class Animal{
    String color;

    void eats(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
    
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}
