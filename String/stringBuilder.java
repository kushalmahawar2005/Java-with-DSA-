public class stringBuilder {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]) {
    //   StringBuilder sb = new StringBuilder("");
    //   for(char ch = 'a'; ch <='z'; ch++) {
    //     sb.append(ch);    //Pichee Data Push Karwane ke liyeee
    //     //O(26) Time complaxity in this case of StringBuilder
    //     //And With String The Tiem Complaxity is  O(26 * n^2)
    //   }
    //    System.out.println(sb.length());   


       String str = "hi i am kushal";
       System.out.println(toUpperCase(str));
    }
   
}