public class Multiple_inheritance {
    public static void main(String args[])
    {
        beer B=new beer();
        B.vegiterien();
        B.non_vegiterien();
    }
}

interface hervivore{
    void vegiterien();
}

interface carnivore{
    void non_vegiterien();
}

class beer implements hervivore,carnivore{
    public void vegiterien(){
        System.out.println("eats grass");
    }

    public void non_vegiterien(){
        System.out.println("eats meat");
    }
}