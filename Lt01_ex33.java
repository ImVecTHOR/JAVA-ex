/**
 * 33.	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex33 {
    public static void main(String[] args) {
        int n, i;
        double serie = 0;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));
        
        for (i = 1; i <= n; i++) {
            serie += 1.0 / i;
        }
        
        JOptionPane.showMessageDialog(null, "O valor da série de " + n + " é " + serie);
    }
}

