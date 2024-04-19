import javax.swing.JOptionPane;

public class FuncaoIfAnd {
    public static void main(String[] args) {

        String fruit_1, fruit_2;
        fruit_1 = JOptionPane.showInputDialog("Enter the name of the first fruit");
        fruit_2 = JOptionPane.showInputDialog("Enter the name of the second fruit");

        if (fruit_1.equals("Apple") && fruit_2.equals("Banana")) {
            JOptionPane.showMessageDialog(null, "Fruit 1: " + fruit_1);
            JOptionPane.showMessageDialog(null, "Fruit 2: " + fruit_2);
        } else {
            JOptionPane.showMessageDialog(null, "Fruit 1 or fruit 2 invalid");
        }

    }
}
