import java.util.ArrayList;
public class BasicArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // adding element in arraylist at end
        // time complexity o(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // adding element in Arrayllist at particular index
        // time complexity o(n)

        list.add(1,45);
        System.out.println(list);


        // getting elament from particular index from arraylist


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println("size is " + list.size());

        
        System.out.println(list.contains(5));
        System.out.println(list.contains(67));

        for(int i=0;i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        list.remove(1);
        for(int i=0;i < list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}