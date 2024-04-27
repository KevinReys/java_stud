package EstruturasdeRepeticao;

import javax.swing.JOptionPane;

public class For4 {
    public static void main(String[] args) {

        String nome;
        int nomesComVogal = 0;
        int nomesComConsoante = 0;

        for (int contador = 1; contador <= 3; contador++) {

            nome = JOptionPane.showInputDialog(null, "Digite o nome " + contador + " :", "Leia com atenção!",
                    JOptionPane.QUESTION_MESSAGE);

            System.out.println("nome.trim: " + nome.trim());
            System.out.println("nome.toLowerCase: " + nome.toLowerCase());
            System.out.println("nome.charAt: " + nome.charAt(0));

            // trim - remove os espaços em branco do inicio do nome
            // toLowerCase - deixa todas as letras em minúsculas
            // charAt(0) - Primeira letra da variavel nome
            // || - Ou
            if (nome.trim().toLowerCase().charAt(0) == 'a' ||
                    nome.trim().toLowerCase().charAt(0) == 'e' ||
                    nome.trim().toLowerCase().charAt(0) == 'i' ||
                    nome.trim().toLowerCase().charAt(0) == 'o' ||
                    nome.trim().toLowerCase().charAt(0) == 'u') {

                nomesComVogal++;
            }
        }

        nomesComConsoante = 3 - nomesComVogal;
        System.out.println("Total com vogal: " + nomesComVogal);
        System.out.println("Total com consonte: " + nomesComConsoante);
    }
}
