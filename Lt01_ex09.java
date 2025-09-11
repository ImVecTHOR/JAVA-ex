/**
 * 9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class Lt01_ex09 {
    public static void main (String args []){
        int SQ, QA, QB, A, B;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        QA = (int) Math.pow(A, 2);
        QB = (int )Math.pow(B, 2);
        SQ = (QA + QB);
        JOptionPane.showMessageDialog(null,"A soma dos quadrados é "+SQ);
        
    }
}
