/**
 * 17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
 * Receber o tempo de percurso e a velocidade média.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex17 {
    public static void main (String arg []){
        int D, L, V, T;
        T = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Tempo: "));
        V = Integer.parseInt(JOptionPane.showInputDialog("Digite a Velocidade: "));
        D = T*V;
        L = D/12;
        JOptionPane.showMessageDialog(null,"Você vai gastar aproximadamente "+L+" litros, num percurso de "+D+" quilometros.");
    }
}
