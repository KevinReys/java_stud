package CONDITIONALS;

public class cond2 {
    public static void main(String[] args) {

        int nota = 30;
        int media = 60;

        if (nota >= media) {
            System.out.println("Aprovado");
        } else if (nota >= 40) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println("Fim");
    }
}