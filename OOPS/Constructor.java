
public class Constructor {

    public static void main(String args[]) {
        // Student s1 = new Student();
        // Student s2 = new Student("Kushal");
        // Student s3 = new Student(1);
        // System.out.println(s2.name);
        // System.out.print(s3.roll);
        // // Student s4 = new Student("Vinay", 121); This line give us error because we don't have Any construtor with two Parmeters 

        //For Copy Constructor (Shallow copy Contructor)
        Student s1 = new Student();
        s1.name = "Shradha";
        s1.roll = 457;
        s1.password = "KUSHAL@112";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "KUSHAL@2005";

        s1.marks[2] = 120;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {

    String name;
    int roll;
    String password;
    int marks[];

    //Shallow Copy Constructor
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    //Deep Copy Constructor
    Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i = 0 ; i < marks.length; i++) {
                this.marks[i] = s1.marks[i];
            }
        }

        Student()  {
            marks = new int[3];
            System.out.println("Construtor is called");
        }

        Student(String name
            
        ) {
        marks = new int[3];
            this.name = name;
            //  System.out.print("Constuctor is calleddddd ....");
        }

        Student(int roll
            
        ) {
        marks = new int[3];
            this.roll = roll;
        }

    }
