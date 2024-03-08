package OOPS.Encapsulation;

public class DeepConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
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

        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
        System.out.println(s2.marks[2]);
    }   
}
class Student{
    String name;
    int rollno;
    int marks[] = new int[3];

    Student(){
        System.out.println("Constructor is Called");
    }
    
    Student(Student s1){
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }
    }
    
     
}