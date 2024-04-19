import javax.swing.JOptionPane;

public class FuncaoIfOr {
    public static void main(String[] args) {

        String fruit;
        fruit = JOptionPane.showInputDialog("Enter the name of the fruit:");

        if (fruit.equals("Apple") || fruit.equals("Banana")) {
            JOptionPane.showMessageDialog(null, "The fruit is " + fruit);

        } else {
            JOptionPane.showMessageDialog(null, "Invalid fruit");
        }

    }
}
