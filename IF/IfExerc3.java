import javax.swing.JOptionPane;

public class IfExerc3 {
    public static void main(String[] args) {

        int numero1, numero2, diferenca;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));

        if (numero1 >= numero2) {
            diferenca = numero1 - numero2;

        } else {
            diferenca = numero2 - numero1;
        }

        System.out.println("A diferença entre: ");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Diferenca: " + diferenca);
    }
}
