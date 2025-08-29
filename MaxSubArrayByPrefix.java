// Maximun no of sum  of sub Array via prefix  
public class MaxSubArrayByPrefix {

    public static void MaxSubArrayByPrefix(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        //calculate prefix array 
        for (int i = 1; i < number.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];

        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : " + " " + maxSum);
    }

    //For Kadane's Algorithum


    public static void Kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < number.length ; i++) {
            cs = cs + number[i]; 

            if (cs < 0) {  // Set all the negative no to 0.
                cs = 0;
            }

            ms = Math.max(cs , ms); // Max function used in which jo bhi beda hoga cs , ms vo ms ho jayega
        }
        System.out.println("our Max subarray sum is :" + ms);
    }

    public static void main(String args[]) {
        int number[] = {-2 , -3 , 4 , -1 , -2 , 1, 5 , -3};
       Kadanes(number);

    }
}
