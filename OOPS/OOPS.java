public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();   
        p1.setColor("Blue");
        p1.setTip(5);

        Pen p2 = new Pen();
        p2.setColor("Red");
        p2.setTip(10);

        System.out.println("Pen 1: " + p1.color + ", Tip: " + p1.tip);
        System.out.println("Pen 2: " + p2.color + ", Tip: " + p2.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Kushal";
        myAcc.setPass("ABCD");
    }
}

public class BankAccount {
    public String username;
    private String password;
    public void setPass(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
