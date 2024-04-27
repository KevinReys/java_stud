package EstruturasdeRepeticao;

import javax.swing.JOptionPane;

public class For3 {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número positivo maior que 1",
                "Leia com atenção!", JOptionPane.QUESTION_MESSAGE));

        // for - para
        for (int contador = 1; contador <= numero; contador++) {

            // if - se
            // % - Resto
            if (contador % 2 == 1) {

                System.out.println("Impar: " + contador);

            }

        }
    }

}
