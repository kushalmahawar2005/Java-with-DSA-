
import java.util.*;

public class compareConcept{
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Toney");

        if(s1 == s2) {
            System.out.println("They Are Equal");
        } 
        else {
            System.out.println("Not Eqaul");
        }

         if(s1 == s3) { //Here S1 and s3 are not equal because they do not have same object
            System.out.println("They Are Equal");
        } 
        else {
            System.out.println("Not Eqaul");
        }
 
        //So to check onlyy the value we use equals function
        if(s1.equals(s3)) {
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not Equal");
        }
    }
}