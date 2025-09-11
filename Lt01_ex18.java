/**
 * 18.	Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex18 {
    public static void main (String arg []){
        Double V1, V2, D;
        V1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        V2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        if (V1>V2){
            D = V1 - V2;
            JOptionPane.showMessageDialog(null,"A diferença entre os valores é de "+D);        
        }else if (V1<V2){
            D = V2 - V1;
            JOptionPane.showMessageDialog(null,"A diferença entre os valores é de "+D);
        }else{
            JOptionPane.showMessageDialog(null,"ERRO, NÃO FAÇA VALORES IGUAIS");
        }
    }
            
}
