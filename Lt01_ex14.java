/**
 * 14.	Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex14 {
    public static void main (String arg []){
        int A1, A2, A3;
        A1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ângulo: "));
        A2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro ãngulo: "));
        A3 = 180-(A1+A2);
        JOptionPane.showMessageDialog(null,"O terceiro angulo é "+A3);
    }
}
