public class AbstractClass {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.walk();
        Chicken c1 = new Chicken();
        c1.walk();
        Horse h1 = new Horse();
        h1.walk();

        System.out.println(h1.color);

        h1.changeColor();
        System.out.println(h1.color);

    }
}

abstract class Animal {
    // non abstract method
    String color;

    Animal() {
        System.out.println("Parent contructor is called");
        color = "black";
    }

    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Dog extends Animal {
    void walk() {
        System.out.println("walk on four legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on two leg");
    }
}

// ---------------------------------------overriding in Abstract
// Class----------------------------

class Horse extends Animal {
    // ---String color;--- if we declare color here again then it will overwrite the
    // declared varible
    // and h1.color before the change color will be null
    void changeColor() {
        color = "dark black";
    }

    void walk() {
        System.out.println("walk on four legs");
    }
}
