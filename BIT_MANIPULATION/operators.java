

public class operators{
    public static int getIntBit(int n, int i ) {
        int bitMask = (1 << i);
        if((n & bitMask) == 0 ) {
            return 0;
        } else {
            return 1;       
         }
    }
    public static int setIntBit(int n, int i ) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

     public static int clearIntBit(int n, int i ) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }



    public static void main(String args[]) {
    System.out.println(clearIntBit(10 , 3));
    }
}
