
import java.util.*;

public class SubArray {

    public static void SubArry(int number[]) {
        int total = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    sum += number[k];
                }

                if (sum < minSum) {
                    minSum = sum;
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }

                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array is :" + total);
        System.out.println("Minimum Subarray :" + minSum);
        System.out.println("Maximum Subarray : " + maxSum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of array");
        int n = sc.nextInt();

        int number[] = new int[n];
        System.out.print("Enter the Element in the array :");
        for (int i = 0; i < n; i++) {
            number[i] =  sc.nextInt();
        }
        SubArry(number);
    }
}
