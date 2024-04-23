import java.util.Scanner;
import javax.swing.JOptionPane;

public class IfLog1 {
    public static void main(String[] args) {
        Scanner objLogin = new Scanner(System.in);

        // Solicita e armazena o nome e a senha como String usando JOptionPane
        String name = JOptionPane.showInputDialog("Enter your name");
        String password = JOptionPane.showInputDialog("Enter your password");

        // Solicita e armazena o nome e a senha como String usando Scanner
        System.out.println("Enter your name");
        String nameInput = objLogin.nextLine();
        System.out.println("Enter your password");
        String passwordInput = objLogin.nextLine();

        // Verifica se o nome e a senha fornecidos pelo usuário correspondem aos valores
        // esperados
        if (name.equals("Kevin") && password.equals("130290")) {
            System.out.printf("User %s successfully logged in!\n", name);
        } else {
            System.out.println("Invalid user or password!");
        }
    }
}
