import java.util.*;

public class Couting {  
    public static void Counting(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        // Find largest element safely
        for(int i = 0; i < n ; i++) {
            if(arr[i] < 0) {
                System.out.println("Counting sort cannot handle negative numbers!");
                return;
            }
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for(int i = 0; i < n ; i++) {
            count[arr[i]]++;
        }

        // Descending
        int j = 0;
        // for(int i = 0; i < count.length; i++ ) { //For Ascending
        for(int i = count.length - 1; i >= 0; i--) { //For descending
            while(count[i] > 0) {
                if(j >= arr.length) break;  // safety check
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1 , 3 ,2 , 4 , 3 ,7};
        Counting(arr);
        System.out.print("Sorted Array is :" + Arrays.toString(arr));
    }
}
