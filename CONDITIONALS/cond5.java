package CONDITIONALS;

public class cond5 {
    public static void main(String[] args) {

        int nota = 85;
        int faltas = 10;
        int maxFaltas = 5;
        int media = 60;
        String res;

        res = (nota >= media ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);
    }
}