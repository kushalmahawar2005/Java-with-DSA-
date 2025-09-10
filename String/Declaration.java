import java.util.*;

public class Declaration{

     public static void printLetters(String str) { //Function To Print Each Letter of Name
            for(int i = 0 ; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
        }
    public static void main(String args[]) {

       
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //Strings are IMMUTABLE  Means Kabhi Change nahi Hoti 

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name); 


        //For Find Full Length 
        // String fullName = "Kushal Mahawar";
        // System.out.println(fullName.length());

        //Concatination
        // String firstName = "Kushal";
        // String secondName = "Mahawar";
        // String fullName = firstName + " " +  secondName;
        // System.out.println(fullName);

        //ChatAt Method (Used to Find Out The Position of Any Element In an list or Array)
         String firstName = "Kushal";
        String secondName = "Mahawar";
        String fullName = firstName + " " +  secondName;
        // System.out.println(fullName.charAt(7));
        printLetters(fullName);
       

    }
}