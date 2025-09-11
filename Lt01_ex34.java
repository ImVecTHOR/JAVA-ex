/**
 * 34.	Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex34 {
    public static void main(String[] args) {
        int numero, i, resultado;
        String tabuada = "";
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        
        for (i = 1; i <= 10; i++) {
            resultado = numero * i;
            tabuada += numero + " x " + i + " = " + resultado + "\n";
        }
        
        JOptionPane.showMessageDialog(null, tabuada);
    }
}

