/**
 * 7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class Lt01_ex07 {
    public static void main (String args [])
    {
        int v, a, l, c;
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento: "));
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: "));
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o altura: "));
        v = (a*l*c);
        JOptionPane.showMessageDialog(null,"O volume do paralelepipedo é "+v);
    }
}
