package OOPS.Inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.legs();
        dog.creed();
        Mammals mammals = new Mammals();
        mammals.eat();
        mammals.legs();
        //mammals.creed();  it is not possible becuase inheritance menas top to down

    }
}
class Mammals extends Animal{
    void legs(){
        System.out.println("Mammals Ahve four legs");
    }
}
class Dog extends Mammals{
    void creed(){
        System.out.println("Pit Bull");
    }
}