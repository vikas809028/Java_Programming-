package OOPS.Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        Century century = new Century();
        century.year();
        //century.week();
        
        Week week = new Week();
        week.year();
        week.week();

        Day day =  new Day();
        day.year();
        //day.week();  because it is heirarchical Inheritance
        day.day();
        

    }
}
class Century{
    void year(){
        System.out.println("It is parent class");
    }
}
class Week extends Century{
    void week(){
        System.out.println("It is first Week");
    }
}

class Day extends Century{
    void day(){
        System.out.println("Today is Monday");
    }
}

