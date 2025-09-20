public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Kushal");
        Student s3 = new Student(1);
        System.out.println(s2.name);
        System.out.print(s3.roll);
        // Student s4 = new Student("Vinay", 121); This line give us error because we don't have Any construtor with two Parmeters 
       
    }
} 


class Student {
    String name;
    int roll;

    Student()  {
        System.out.println("Construtor is called");
    }

    Student(String name) {
        this.name = name;
        //  System.out.print("Constuctor is calleddddd ....");
    }

    Student(int roll) {
        this.roll = roll;
    }
}