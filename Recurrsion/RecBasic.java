
public class RecBasic {

    public static void PrintDec(int n ) {   //For Base Class 
        if(n == 1) {
            System.out.println(n);
            return; 
        }
        System.out.print(n + " ");
        PrintDec(n - 1);  //Inner Call
    }

    
    public static void IncOrder(int n) {   //For Base Class 
        if(n == 1) {
            System.out.println(n);
            return;     
        }
       
        IncOrder(n - 1);  //Inner Call
         System.out.println(n + " ");
    }

    public static int factorial(int n) {
        if ( n == 0 ) {
            return 1;
        }
        int fn1 = factorial(n - 1);
        int fn = n * factorial(n - 1);
        return fn ;
    }
   
    public static void main(String args[]) {
        int n = 5;
        PrintDec(n);
        IncOrder(n);
        System.out.println(factorial(n));
    }
}
