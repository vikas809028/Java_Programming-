import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        int n1 = list.size()-1;
        int n2 = list1.size()-1;
        
            for(int i=n1,j=n2;j>=0; i--,j--){
                list2.add(list.get(i)+list.get(j));
            }
            System.out.print(list2);
        

            
        
        
    }
}
