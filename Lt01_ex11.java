/**
 * 11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex11 {
    public static void main (String args[]){
        Double R, C;
        R = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio: "));
        C = (2*3.14*R);
        JOptionPane.showMessageDialog(null,"O valor da Circunferencia é de "+C);
    }
     
}
