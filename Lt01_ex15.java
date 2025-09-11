/**
 * 15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex15 {
    public static void main (String arg[]){
        int V1, V2, C1, C2, SC, H;
        V1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro cateto: "));
        V2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo cateto: "));
        C1 = (int) Math.pow(V1, 2);
        C2 = (int) Math.pow(V2, 2);
        SC = C1+C2;
        H = (int) Math.sqrt(SC);
        JOptionPane.showMessageDialog(null,"O valor da hipotenusa é: "+H);
    }
    
}
