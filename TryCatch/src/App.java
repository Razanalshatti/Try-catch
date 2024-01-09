import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

    // Credentials
    String validUSername = "Coded";
    String validPassword = "Coded123";

    //login attempets how many attempts the user have to try 
    int attempets = 3;

    // retry attempts 
    while (attempets>0){
        System.out.println("Enter username: ");
        String username = scanner.next();
    
        System.out.println("Enter password: ");
        String password = scanner.next();
        try {

            //invalid credentials check if its not equal then throw exception
            if (!username.equals(validUSername) || !password.equals(validPassword)){
                throw new Exception("Invalid credentials!!");
            } else {
                System.out.println("Login succesful!");
                break; // to exit the loop
            }

        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
            attempets--; // to decrement number of attempts after first try for example 3 attempts then 2 then the last attempts
            System.out.println("Attempts left: " + attempets);
            }

        }
        scanner.close();
    }
    }

