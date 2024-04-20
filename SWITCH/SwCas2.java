package SWITCH;

import javax.swing.JOptionPane;

public class SwCas2 {
    public static void main(String[] args) {

        // Recebe a entrada do usuário para o número do mês
        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of the month"));

        // Estrutura de controle switch para determinar em qual intervalo o mês está
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("The month is between 1 and 5");
                break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("The month is between 6 and 10");
                break;

            case 11:
            case 12:
                System.out.println("The month is between 11 and 12");
                break;

            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
