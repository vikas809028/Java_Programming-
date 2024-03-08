import java.util.ArrayList;

public class MultiArrayList{
    public static void main(String[] args) {
        ArrayList<ArrayList <Integer>> mainlist = new ArrayList<>();
        for(int i = 1; i <= 3;i++){
            ArrayList<Integer> newlist = new ArrayList<>();
            // newlist = mainlist.get(i); here it is not necessary to get mainlist
            for(int j = 1; j <= 5;j++){
                newlist.add(j*i);
            }
            mainlist.add(newlist);
          }
        System.out.println(mainlist);
    }
}
