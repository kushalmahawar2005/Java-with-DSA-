
public class Hybrid {

    public static void main(String args[]) {
        Birds peackock = new Birds();
        peackock.peackock();
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

class Tuna extends Fish {
    void Tuna () {
        System.out.println("Tuna");
    }
}

class Shark extends Fish {
     void Shark () {
        System.out.println("Shark");
    }
}

class Birds {
     void peackock () {
        System.out.print("It is an a National Birds ");
     }
}
