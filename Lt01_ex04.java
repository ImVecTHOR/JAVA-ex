/*
4.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 */

/**
 *
 * @author Ryan
 */
import javax.swing.JOptionPane;
public class Lt01_ex04 {
    public static void main(String args[]) {
        int an, aa, ac;
        an = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento: "));
        aa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
        ac = (aa-an)+17;
        
        JOptionPane.showMessageDialog(null,"Idade atual: "+(aa-an)+"\nEm 17 anos, você terá "+ac+" anos.");
    }
}
