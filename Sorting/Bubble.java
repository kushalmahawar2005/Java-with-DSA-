
import java.util.*;

public class Bubble {

    public static void Bubble(int arr[]) {
        for (int turn = 0; turn <= arr.length - 1; turn++) {  //Irtation
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap the largest no 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void Descending(int arr[]) {
        int n = arr.length;
        for(int i = 0 ; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[ j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        int arr[] = {3 , 6 ,2 ,1 , 8 , 7 ,4 , 5 ,3 ,1};
         Descending(arr);
         printArr(arr);
    }
}
