import java.util.Scanner;

package SCANNER;

public class scn2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0, res = 0;
        String nome = " ";

        System.out.print("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.print("Digite um numeral: ");
        n1 = scan.nextInt();

        System.out.print("Digite outro numeral: ");
        n2 = scan.nextInt();

        res = n1 + n2;
        System.out.printf("%s a Soma de %d com %d é igual a %d", nome, n1, n2, res);

    }

}
