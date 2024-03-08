package OOPS.Inheritance;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.fly();
        Animal dog = new Animal();
        //dog.fly();   it can not be possile
        dog.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eat");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("bird fly");
    }
}

