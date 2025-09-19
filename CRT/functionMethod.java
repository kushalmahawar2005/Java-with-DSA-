
public class functionMethod {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void factorail(int n) {
        int digit = 1;
        for (int i = 1; i <= n; i++) {
            digit = digit * i;
        }
        System.out.print(digit);
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int digit = 0;
        while (n > 0) {
            int no = n % 10;
            digit += (int)Math.pow(no, 3);
            n /= 10;
            System.out.print(digit + " " + "+");
        }
        return original == digit;

    }

    public static void isPrime(int n) {
        if(n == 2) {
            for(int i = 0 ; i <= n / 2; i++) {
                if(n % i == 0) {
                    System.out.print("Not Prime");
                }
            }
        }
    }

    public static void main(String args[]) {
        //    int num = 121;
        //    if(isPalindrome(num)) {
        //     System.out.print("No is Palindrom No.");
        //    } else {
        //     System.out.print("No is Not an Palindrom No :");
        //    }

        // factorail(5);
     
        if (isArmstrong(172)) {
            System.out.print("No is Armstrong No.");
        } else {
            System.out.print("No is Not an Armstrong No :");
        }
    }
}
