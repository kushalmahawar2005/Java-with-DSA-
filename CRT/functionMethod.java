public class functionMethod{

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
    
    public static void main(String args[]) {
       int num = 121;
       if(isPalindrome(num)) {
        System.out.print("No is Palindrom No.");
       } else {
        System.out.print("No is Not an Palindrom No :");
       }
    }
}