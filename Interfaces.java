/*Interface is the blue print of a class.
 Uses of Interface :
1> Implementation of multiple inheritance
2> Total abstraction

 Properties of Interface :
 1> defined by Interface Keyword.
 2> use implements keyword instead of extends.
 3> all methods are public, abstract and without implementation.
 4> variable in the interfaces are final public and static.


*/
public class Interfaces {
    public static void main(String args[])
    {
        Queen Q=new Queen();
        Q.moves();
        king K=new king();
        K.moves();
    }
}

interface chessplayer{
    void moves();
}

class Queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left right,diagonal -(Multiple steps)");
    }
}

class rook implements chessplayer{
    public void moves (){
        System.out.println("up,down, left,right ");
    }
}

class king implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal  -(only one step)");
    }
}

