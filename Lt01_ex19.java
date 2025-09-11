/**
 * 19.	Receba 2 valores reais. Calcule e mostre o maior deles.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex19 {
    public static void main(String arg[]){
        Double V1, V2;
            V1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            V2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor; "));
        if(V1>V2){
            JOptionPane.showMessageDialog(null,"O maior valor é "+V1);
        }else if(V2>V1){
            JOptionPane.showMessageDialog(null,"O maior valor é "+V2);
        }else{
            JOptionPane.showMessageDialog(null,"Os valores são iguais");
        }
    }
}
