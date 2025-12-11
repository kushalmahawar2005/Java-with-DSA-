import java.io.*;
import java.util.Scanner;

public class Auth {

    static final String FILE_NAME = "user.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose Option: ");

            int option = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (option == 1) {
                register(sc);
            }
            else if (option == 2) {
                login(sc);
            }
            else if (option == 3) {
                System.out.println("Exiting...");
                break;   
            }
            else {
                System.out.println("Invalid Choice!");
            }
        }

        sc.close();  
    }

    // ---------------- Register Function ----------------
    public static void register(Scanner sc) {
        System.out.println("\n--- Register ---");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(name + "," + email + "," + pass);
            bw.newLine();
            System.out.println("User Registered Successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ---------------- Login Function ----------------
    public static void login(Scanner sc) {
        System.out.println("\n--- Login ---");

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 3) {
                    String fileName = data[0];
                    String fileEmail = data[1];
                    String filePass = data[2];

                    if (fileEmail.equals(email) && filePass.equals(pass)) {
                        System.out.println("Login Successful! Welcome " + fileName);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Invalid Email or Password!");
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 