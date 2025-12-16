public class SubSet {

    public static void findSubString(String str, String ans , int i) {
        //Base Case 
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }


        //Recursion case
        //Yes Choice 
        findSubString(str, ans+str.charAt(i), i + 1);
        //No Choice
        findSubString(str, ans, i + 1);


    }
    public static void main(String args[]) {
        String str = "abc";
        findSubString(str, " ", 0);
    }
}