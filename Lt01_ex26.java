/**
 * 26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex26 {
    public static void main (String arg []){
        int V1, V2;
        V1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro valor: "));
        V2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro valor: "));
        if (V2>=V1){
            if (V2 % V1 == 0){
                JOptionPane.showMessageDialog(null,V2+" é multiplo de "+V1);
                }else{
                JOptionPane.showMessageDialog(null,V2+" não é multiplo de "+V1);
            }
            }else if(V2<=V1){
                if(V1 % V2 == 0){
                    JOptionPane.showMessageDialog(null, V1+" é multiplo de "+V2);
                }else{
                    JOptionPane.showMessageDialog(null,V1+" não é multiplo de "+V2);
                }
            }
            
    }
    
}
