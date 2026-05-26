import java.util.ArrayList;

public class Practice {

    public static void max(ArrayList<Integer> list){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Maximum No is " + max);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(20);
        list.add(99);
        list.add(32);

        max(list);
    }
}