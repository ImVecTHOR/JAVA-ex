/**
 * 12.	Receba o ano de nascimento e o ano atual.
 * Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex12 {
    public static void main(String args[]){
        int  AN, AA,AF,IA, IF;
        AN = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu: "));
        AA = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que estamos atualmente: "));
        IA = Math.abs(AN-AA);
        IF = IA + 17;
        AF = AA + 17;
        JOptionPane.showMessageDialog(null,"Daqui 17 anos (em "+AF+") você terá "+IF);
        
    }
    
}
