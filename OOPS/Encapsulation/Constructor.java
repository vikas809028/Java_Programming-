package OOPS.Encapsulation;

public class Constructor {
    public static void main(String[] args) {
        //   Non Parameterarized constructor
        Pen p1 = new Pen();
        p1.tip=5;
        System.out.println(p1.tip);

        //   Parameterized Constructor

        Pen p2 = new Pen(5);
        System.out.println(p2.tip);
    }
}
class Pen{
    String color;
    int tip;
    Pen(){
        System.out.println("Constructor is Called");
    }
    Pen(int tip){
        this.tip =tip;
        System.out.println("Parameterized Contructor is called");
    }

}
