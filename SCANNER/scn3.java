import java.util.Scanner;

package SCANNER;

public class scn3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0 , soma = 0;
        Final int MEDIA = 60;
        String nome = " ", res = " ";

        System.out.print("Digite o nome do aluno: ");
        nome = scan.nextLine();

        System.out.print("Digite a primeira nota: ");
        n1 = scan.nextInt();

        System.out.print("Digite a segunda nota: ");
        n2 = scan.nextInt();

        System.out.print("Digite a terceira nota: ");
        n3 = scan.nextInt();




        soma = n1 + n2 + n3;
        if (soma >= MEDIA){
            res = "Aprovado";
        }else if(soma>=40){  
            res = "Recuperação";
        }else{  
            res="Reprovado";
       }

System.out.printf("Aluno %s foi %d, com nota %d",nome,res,soma);

}

}
