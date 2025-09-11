/**
 * 23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
 * Mostre os 4 números em ordem crescente.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex23 {
    public static void main (String arg []){
        int V1, V2, V3, V4;
        V1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        V2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor (maior que o anterior): "));
        V3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor (maior que o anterior): "));
        V4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto valor: "));
        if(V1>V2 || V2>V3){
            JOptionPane.showMessageDialog(null,"Os valores precisam ser maiores que o anerior, exceto o QUARTO VALOR");
        }else if (V4<V1){
             JOptionPane.showMessageDialog(null,"Os valores em ordem crescente é: "+V4+", "+V1+", "+V2+", "+V3);
        }else if (V4<V2){
             JOptionPane.showMessageDialog(null,"Os valores em ordem crescente é: "+V1+", "+V4+", "+V2+", "+V3);
        }else if (V4<V3){
             JOptionPane.showMessageDialog(null,"Os valores em ordem crescente é: "+V1+", "+V2+", "+V4+", "+V3);
        }else{
             JOptionPane.showMessageDialog(null,"Os valores em ordem crescente é: "+V1+", "+V2+", "+V3+", "+V4);
        }
        
    }
}
