import java.util.ArrayList;

public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list4 = new ArrayList<>();

        //Operation on ArrayList
        //Add Operation
        list.add(1); //o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9);  //o(n)
        // System.out.println(list);

        //To Get Particular Value From The ArrayList we Use get function 
        int elememnt = list.get(2);
        System.out.println(elememnt);

        //Delete
        // list.remove(2);
        // System.out.println(list);

        //Update Value At Any Index (Set Element at Index)
        list.set(2, 10);
        System.out.println(list);

        // Contain Element 
        System.out.println(list.contains(1));
    }
}