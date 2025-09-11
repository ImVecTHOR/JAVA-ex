/**
 * 13.Receba a quantidade de alimento em quilos.
 * Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex13 {
    public static void main(String arg[]){
        Double K, DS;
        K= Double.parseDouble(JOptionPane.showInputDialog("Digite a quantide de comida em quilos: "));
        DS = Math.abs(K/0.050);
        JOptionPane.showMessageDialog(null,"Com "+K+" quilos de comida, a pessoa irá sobreviver por "+DS);
    }
    
}
