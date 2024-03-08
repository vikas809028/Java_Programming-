public class Interfaces {
    public static void main(String[] args) {
        
    }
}
interface ChessPlayer{
    // this will be abstract by default because all methods in interfaces are abstract
    // it will public means accessible everywhere inside and outside of package
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("hii I am queen");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Hello I am King");
    }
}

