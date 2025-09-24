
public class DecOrder {

    public static void PrintDec(int n) {   //For Base Class 
        if(n == 1) {
            System.out.println(n);
            return; 
        }
        System.out.print(n + " ");
        PrintDec(n - 1);  //Inner Call
    }

    public static void main(String args[]) {
        int n = 10;
        PrintDec(n);
    }
}
