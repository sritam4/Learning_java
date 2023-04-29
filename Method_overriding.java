class Method_overriding{
    public static void main(String args[])
    {
        Deer dr=new Deer();
        dr.eats();
    } 
}
class animal{
    String Color;

    void eats(){
        System.out.println("eats anything");
    }
}
class Deer extends animal{
    void eats(){
        System.out.println("eats grass");
    }
}