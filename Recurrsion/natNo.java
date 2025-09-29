
public class natNo {

    public static int Natural(int n) {
        if (n == 1) {
            return 1;
        }
        int fn1 = Natural(n - 1);
        int fn = n + fn1;
        return fn;

    }

    public static void main(String args[]) {
        System.out.print(Natural(5));
    }
}
