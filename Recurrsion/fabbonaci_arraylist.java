import java.util.ArrayList;
import java.util.Collections;

public class fabbonaci_arraylist {

    static ArrayList<Integer> memo;
 
    public static int fib(int n) {   //Base Case in which we Check if no is == 0 or 1 
        if (n == 0 || n == 1)
            return n;

        // Correct memo check
        if (memo.get(n) != -1)
            return memo.get(n);

        int ans = fib(n - 1) + fib(n - 2);
        System.out.print("Fibbonaci Series id " + ans + " ");
        memo.set(n, ans);

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;

        memo = new ArrayList<>(Collections.nCopies(n + 1, -1));

        System.out.println(fib(n)); 
    }
}
