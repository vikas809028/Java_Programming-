package OOPS.Polymorphism;


public class overlaoding {
    public static void main(String[] args) {
        Calculator SUM = new Calculator();
        System.out.println(SUM.sum(2,3));;
        System.out.println(SUM.sum((float)2.5,(float)3.7));;
        System.out.println(SUM.sum(2,3,6));;
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}
