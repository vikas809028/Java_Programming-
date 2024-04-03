package PriorityQueue;
import java.util.PriorityQueue;

public class Priority_Queue_OfClass {

    public static class Student implements Comparable<Student> {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        //priority based on marks

        // @Override
        // public int compareTo(Student s) {
        // return this.marks-s.marks;
        // }

        // priority based on name
        @Override
        public int compareTo(Student s) {
            // return value 0 if the argument string is equal to this string; 
            // a value less than 0 if this string is lexicographically less than the string argument; 
            // and a value greater than 0 if this string is lexicographically greater than the string argument.
            return this.name.compareTo(s.name);
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Vikas", 90));
        pq.add(new Student("Vivek", 50));
        pq.add(new Student("Vinay", 60));
        pq.add(new Student("Vaibhav", 70));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "-->" + pq.peek().marks);
            pq.remove();
        }

    }
}
