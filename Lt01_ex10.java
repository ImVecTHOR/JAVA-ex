/**
 * 10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.	
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;;
public class Lt01_ex10 {
    public static void main (String args []){
    Double D, A, B;
    A = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    B = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
    D = Math.abs(A - B);
    JOptionPane.showMessageDialog(null,"A Diferença entre os valores A e B é "+D);
    }
    
}
