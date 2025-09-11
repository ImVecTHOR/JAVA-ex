/**
 * 22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex22 {
    public static void main (String arg []){
    int V1, V2;
    V1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    V2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
    if (V1>V2){
        JOptionPane.showMessageDialog(null,"A sequencia crescente fica da seguinte forma "+V2+", "+V1);
    }else if (V2>V1){
        JOptionPane.showMessageDialog(null,"A seguencia crescente fica da seguitne forma "+V1+", "+V2);
    }else{
        JOptionPane.showMessageDialog(null,"OS VALORES SÃO IGUAIS");
    }
    }
}
