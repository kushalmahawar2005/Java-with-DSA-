
import java.util.*;

// public class ArraysCC {
//     public static void main(String args[]) {
//        int marks[] = new int[100];
//        Scanner sc = new Scanner(System.in);
//         System.out.println("Enters The No");
//         int c = sc.nextInt();
//         for(int i = 0; i<= c ; i++) {
//             marks[i] = sc.nextInt();
//         }
//         System.out.println("The index values is:");
//         for(int i = 0; i<= c; i++) {
//             System.out.println("X is Founded" + marks[i]);
//             }
//         }
// }



// --------------------------Code For Linear Search------------------------
// public class ArraysCC {
//     public static void update(int marks[]) {
//         for (int i = 0 ; i < marks.length ; i++ ) {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String[] args) {
//         int marks[] = {97 , 98 , 99};
//         update(marks);
//         for (int i = 0 ; i < marks.length ; i++ ) {
//             System.out.println(marks[i] + " ");
//         }
//         System.out.println();
//     }  
// }

public class ArraysCC {
    public static int getLargest(int number[]){
          int largest = Integer.MIN_VALUE; // IT signify -infinity

          for(int i = 0 ; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
          }
          return largest;
    }
    public static void main(String[] args) {
        int number[] = {1, 2 , 302 , 4 , 5, 6, 112 ,32, 213 , 213,21, 24,32,442 , 443 ,4 ,342,345 ,24,234,324 ,23 ,4302, 423,4 ,2,334,32, 324,324,23,54,324,325,43, 54,6,477,6,745,6,547, 67,637 ,54};
        System.out.println("Largest value is :" + getLargest(number));
    }
}
