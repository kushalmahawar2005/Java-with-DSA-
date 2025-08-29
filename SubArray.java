public class SubArray {
    public static void SubArry(int number[]) {
        int total = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0 ; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length ; j++) {
                int end = j;
                int sum = 0;
                for (int k = start ; k <= end; k++) {
                    System.out.print(number[k] + " " );
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
        System.out.print("Total Sub Array is :" + total);
        System.out.println("Minimum Subarray :" + minSum);
        System.out.println("Maximum Subarray : " +  maxSum);
        
    }
    public static void main (String[] args) {
        int number[] = {2 , 4 , 6 , 8 , 10};
        SubArry(number);
    }
}