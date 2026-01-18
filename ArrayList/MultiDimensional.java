import java.util.*;
public class MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList <>();
        list.add(1);
        list.add(2);
        list.add(3);
        main.add(list);
        
        System.out.println(main);
        ArrayList<Integer> list2 = new ArrayList <>();
        list2.add(1);
        list2.add(3);

        main.add(list2);
        System.out.print(main);
        
    }
}