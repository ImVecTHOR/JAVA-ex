/**
 * 24. Receba um valor e verifique se ele é divisivel por 2 e 3.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex24 {
    public static void main (String arg []){
        Double V1, D;
            V1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor qualquer: "));
        if (V1 % 2.0 == 0 && V1 % 3.0 == 0){
            JOptionPane.showMessageDialog(null,"O valor é divisivel por 2 e 3!");
        }else{
            JOptionPane.showMessageDialog(null,"O valor não é divisel por 2 e 3!");
        }
    }
}
