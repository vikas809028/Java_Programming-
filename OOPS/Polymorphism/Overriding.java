// package OOPS.Polymorphism;

// public class Overriding {
//     public static void main(String[] args) {
//         // Dear d1 = new Dear();
//         // d1.eat();  // Eat grass

//         Animal a1 = new Dear();
//         a1.eat(); // Eat grass

//         // Bear b1 =new Bear();
//         // b1.eat(); // Eats green grass

//     }
// }
// class Animal{
//     void eat(){
//         System.out.println("Eats");
//     }
// }
// class Dear extends Animal{
//     void eat(){
//         System.out.println("Eat grass");
//     }
// }

// // class Bear extends Dear{
// //     void eat(){
// //         System.out.println("Eats green grass");
// //     }
// // }

// ********************** 

package OOPS.Polymorphism;

public class Overriding {
    public static void main(String[] args) {
        // Dear d1 = new Dear();
        // d1.eat();  // Eat grass

        Animal a1 = new Dear();
        a1.eat(); // Eat grass

        // Bear b1 =new Bear();
        // b1.eat(); // Eats green grass

    }
}
class Animal{
    void eat(){
        System.out.println("Eats");
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("Eat grass");
    }
}

class Bear extends Dear{
    void eat(){
        System.out.println("Eats green grass");
    }
}