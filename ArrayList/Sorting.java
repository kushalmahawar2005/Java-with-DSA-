import java.util.*;
public class Sorting {
    public static void main(String args[]) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(0);

        System.out.println(list);
        // Collections.sort(list); //Ascending order
        // System.out.println(list);
        
        //For Descending 
        Collections.sort(list, Collections.revrseOrder());
        // These 2nd Value in func is Compartor -fnx logic 
        System.out.println(list);

    }   
 }