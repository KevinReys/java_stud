import java.util.Scanner;

public class IfExerc2 {
    public static void main(String[] args) {
        Scanner objNumber = new Scanner(System.in);
        int number;

        System.out.println("Enter an integer");
        number = objNumber.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + ", PAIR");

        } else {
            System.out.println("Number " + number + ", ODD");
        }
    }
}
