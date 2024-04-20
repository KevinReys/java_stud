package SWITCH;

import javax.swing.JOptionPane;

public class SwCas {
    public static void main(String[] args) {

        String fruit;
        fruit = JOptionPane.showInputDialog("Enter the name of a fruit");

        switch (fruit) {
            case "Banana":
                System.out.println("You typed Banana");
                break;

            case "Orange":
                System.out.println("You typed Orange");
                break;

            case "Grape":
                System.out.println("You typed Grape");
                break;

            default:
                System.out.println("You did not enter a valid fruit!");
                break;
        }

    }
}
