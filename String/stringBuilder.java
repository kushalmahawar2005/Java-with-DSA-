public class stringBuilder {
    public static void main(String args[]) {
      StringBuilder sb = new StringBuilder("");
      for(char ch = 'a'; ch <='z'; ch++) {
        sb.append(ch);    //Pichee Data Push Karwane ke liyeee
        //O(26) Time complaxity in this case of StringBuilder
        //And With String The Tiem Complaxity is  O(26 * n^2)
      }
       System.out.println(sb.length());   
    }
   
}