package SWITCH;

import javax.swing.JOptionPane;

public class calculator {
    public static void main(String[] args) {

        double number1, number2, result;
        int option;

        option = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite uma das opções a seguir: \n 1 - Adicao \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao\n",
                "Leia com atencao!", JOptionPane.QUESTION_MESSAGE));

        number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter te first number", "Exercicio Java",
                JOptionPane.QUESTION_MESSAGE));
        number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter te second number", "Exercicio Java",
                JOptionPane.QUESTION_MESSAGE));

        switch (option) {
            case 1: {
                result = number1 + number2;
                System.out.printf("%f + %f = %f", number1, number2, result);
            }
                break;

            case 2: {
                result = number1 - number2;
                System.out.printf("%f - %f = %f", number1, number2, result);
            }
                break;

            case 3: {
                result = number1 * number2;
                System.out.printf("%f * %f = %f", number1, number2, result);
            }
                break;

            case 4: {
                result = number1 / number2;
                System.out.printf("%f + %f = %f", number1, number2, result);
            }
                break;

            default: {
                System.out.println("Ivalid Option");
            }
                break;
        }
    }
}
