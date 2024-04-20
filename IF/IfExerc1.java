import java.util.Scanner;

public class IfExerc1 {
    public static void main(String[] args) {

        Scanner objetoNumero = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero inteiro");
        numero = objetoNumero.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero " + numero + ", PAR");

        } else {
            System.out.println("Numero " + numero + ", IMPAR");

        }
    }
}
