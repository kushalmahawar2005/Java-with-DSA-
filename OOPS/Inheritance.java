
public class Inheritance {

    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();
    }
}

//Base Class
class Animal {

    String color;

    void eat() {
        System.out.println("Animal is eating food like a Human With there hands");

    }

    void breath() {
        System.out.println("Animal Take Breaths");
    }

}

//Derived Class

class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims in water");
    }
}