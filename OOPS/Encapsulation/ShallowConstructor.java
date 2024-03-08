package OOPS.Encapsulation;

public class ShallowConstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Saurabh Tiwari";
        s1.rollno  = 192;
        s1.marks[0] = 70;
        s1.marks[1] = 80;
        s1.marks[2] = 90;
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.marks[0]);
        System.out.println(s1.marks[1]);
        System.out.println(s1.marks[2]);
        //copy
        Students s2 = new Students(s1);
        s1.marks[2] = 100;
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
        System.out.println(s2.marks[2]);

    }
}
class Students{
    String name;
    int rollno;
    int marks[] = new int[3];



    Students(){
        System.out.println("Constructor is Called");
    }
    Students(Students s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;

    }

     
}
