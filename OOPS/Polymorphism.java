
public class Polymorphism {

    public static void main(String args[]) {
        // Calculator calc = new Calculator();
        // System.out.print(calc.sum(2.3f, 3.2f));

        Deer d = new Deer();
        d.eat();
    }

}

//Method Overriding
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.print("Eat Grass");
    }
} 
 
class Bhalu extends Animal {
    void eat() {
        System.out.println("Win");
    }
}





//Method Overloading

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a , float b) {
        return a + b;
    }

    int sum(int a ,int b ,  int c ) {
        return a + b + c;

    }

}
