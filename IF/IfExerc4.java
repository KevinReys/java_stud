import javax.swing.JOptionPane;

public class IfExerc4 {
    public static void main(String[] args) {

        int number1, number2;

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));

        if (number1 > number2) {
            System.out.println(number1 + "\n" + number2);

        } else {
            System.out.println(number2 + "\n" + number1);

        }

    }
}
