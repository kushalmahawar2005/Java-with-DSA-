public class GetSet {
    public static void main(String args[]) {
        Pen p1 = new Pen();   
        p1.setColor("Blue");
        p1.setTip(5);

        Pen p2 = new Pen();
        p2.setColor("Red");
        p2.setTip(10);
  
        System.out.println("Pen 1: " + p1.getColor() + ", Tip: " + p1.getTip());
        System.out.println("Pen 2: " + p2.getColor() + ", Tip: " + p2.getTip());

    
    }
}


class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}
