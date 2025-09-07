
import java.util.*;

public class Selection {

    public static void Selection(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void Descreasing(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int MaxPos = i;
            for(int j = i + 1 ; j < arr.length ; j++) {
                if(arr[MaxPos] < arr[j]) {
                    MaxPos = j;
                }
            }
            //swap
            int temp = arr[MaxPos];
            arr[MaxPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Descreasing(arr);
        printArr(arr);
    }
}
