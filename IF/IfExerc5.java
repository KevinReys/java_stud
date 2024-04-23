import java.util.Scanner;

public class IfExerc5 {
    public static void main(String[] args) {
        Scanner objLogin = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = objLogin.nextLine();

        System.out.println("Enter your password");
        String password = objLogin.nextLine();

        if (name.equals("Kevin") && password.equals("130290")) {
            System.out.printf("User %s successfully logged in!\n", name);
        } else {
            System.out.println("Invalid user or password!");
        }
    }
}
