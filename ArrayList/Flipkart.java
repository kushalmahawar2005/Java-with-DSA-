
import java.util.*;

public class Flipkart {

    // public static int storeWater(ArrayList<Integer> height) {
    //     int maxWater = 0;

    //     //Bruite force --- Sara Pair Nikalo and Jo Max ayee useko Print kar do 
    //     for (int i = 0; i < height.size(); i++) {
    //         for (int j = i + 1; j < height.size(); j++) {
    //             int h1 = Math.min(height.get(i), height.get(j));
    //             int width = j - i;
    //             int currWater = h1 * width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }


    //Two Pointer Approach


    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;


        while(lp < rp) {
            //Calculate Water Area
            int h1 = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int curWater = h1 * width;
            maxWater = Math.max(maxWater, curWater);
            //update pointer
            if(height.get(lp) < height.get(rp)) {
                lp++;

            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);


        System.out.println(storeWater(height));
    }
}
