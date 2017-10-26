import javax.swing.*;

public class SwingExemplo {
    public static void main(String[] args) {
        String age = "";
    age = JOptionPane.showInputDialog("Qual sua Idade ");

        Integer ageInt = Integer.parseInt(age);

        JOptionPane.showConfirmDialog(null, "Sua Idade é " + ageInt);
    }
}
