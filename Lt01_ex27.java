/**
 * 27.	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
 * Calcule e mostre a velocidade média em km/h.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex27 {
    public static void main (String args []){
        Double V, EC, TM, VM;
        V = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas: "));
        EC = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito (em metros): "));
        TM = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração da pista (em minutos): "));
        VM = (V * EC) / TM;
        JOptionPane.showMessageDialog(null,"A velocidade média na corrida será "+VM+" km/h");
    }
    
}
