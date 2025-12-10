import java.io.*;
import java.util.Scanner;

public class Auth {

    static final String FILE_NAME = "user.txt";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome to our Page , Choose Any One of the method that you Want to Perform");
            System.out.println("1 Register Now");
            System.out.println("2 Login Now");
            System.out.println("3. Exit");

            System.out.println("Choose Any Method");
            int option = sc.nextInt();
            sc.nextLine();

            if(option == 1) {
                register(sc);

            }
            else if(option == 2) {
                login(sc);
            }
            else if(option == 3) {
                System.out.print("Exit");
            } 
            else {
                System.out.print("Invalid Operation Selected");
            }

        }
        sc.close();
}
        //Register

        public static void register(Scanner sc) {
            System.out.print("Register");

            System.out.println("Enter Your Name");
            String name = sc.nextLine();

            System.out.println("Enter Your Email");
            String email = sc.nextLine();

            System.out.println("Enter the Password");
            String password = sc.nextLine();

            boolean found = false;

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(name + "," + email + "," + password);
            bw.newLine();
            System.out.println("User Registered Successfully!");
        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }

  
    public static void login(Scanner sc) {
        System.out.println("\n=== Login ===");

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 3) {
                    String fileName = data[0];
                    String fileEmail = data[1];
                    String filePass = data[2];

                    if (fileEmail.equals(email) && filePass.equals(password)) {
                        System.out.println("Login Successful! Welcome " + fileName);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Invalid Email or Password!");
            }

        } catch (IOException e) {
            System.out.println("Error reading user file: " + e.getMessage());
        }
    }
}
