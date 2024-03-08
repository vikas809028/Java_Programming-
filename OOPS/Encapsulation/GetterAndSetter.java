package OOPS.Encapsulation;

public class GetterAndSetter {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        
    }
}
class Pens{
    private String color;
    private int tip;

    void setColor(String color){
        this.color = color;
    }
    String getColor() {
        return color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    int getTip(){
        return tip;
    }


}
