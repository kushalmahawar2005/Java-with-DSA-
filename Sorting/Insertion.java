
import java.util.*;

public class Insertion {

    public static void Insertion(int num[]) {
        int n = num.length;

        for (int i = 1; i < n; i++) {
            int curr = num[i];
            int prev = i - 1;
            //Finding the correct position to insert 
            //for acending we write  (>) in condition and for Descending we Write (<)
            while(prev >= 0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                prev--;
            }
            //Insertion
            num[prev + 1] = curr;
        }
    }

    public static void main(String args[]) {
        int num[] = {5, 4, 1, 3, 2};
        Insertion(num);
        // Arrays.sort(num); //Inbuild function
        System.out.print("Sorted array :" +Arrays.toString(num) );
    }
}
