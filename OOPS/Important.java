package OOPS;

class Important {
    static class P {
        void display() {
            System.out.println("d");
        }
    }

    static class Q extends P {
        void display() {
            System.out.println("Q");
        }
    }

    public static void main(String[] args) {
        P a = new Q();// child method
        Q b = new Q();
        P c = new P();
        // Q d = new P(); // not posiible
        a.display();
        b.display();
        c.display();

    }
}
