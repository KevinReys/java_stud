package SPEC;

public class spec1 {
    public static void main(String[] args) {
        System.out.printf("%s\n\n", toString("Kevin Reys", 'M', 34, 5460.50));
        System.out.printf("%s\n", toString("Rosane Reys", 'F', 59, 8460.50));
        System.out.printf("%s\n", toString("Rafaela Andreazza", 'F', 28, 8460.50));
        System.out.printf("%s\n", toString("Mariana Reys", 'F', 18, 8860.50));
    }

    public static String toString(String nome, char sexo, int idade, double salario) {
        String result;

        result = String.format("Nome: %s\n", nome) +
                String.format("Sexo: %c\n", sexo) +
                String.format("Idade: %d\n", idade) +
                String.format("Salario: %.2f\n", salario);
        return result;
    }
}
