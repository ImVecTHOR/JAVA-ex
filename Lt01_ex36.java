/**
 * 36.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex36 {
    public static void main(String[] args) {
        int n, i, j;
        double serie = 1, fatorial;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));
        
        for (i = 1; i <= n; i++) {
            fatorial = 1;
            for (j = 1; j <= i; j++) {
                fatorial *= j;
            }
            serie += 1.0 / fatorial;
        }
        
        JOptionPane.showMessageDialog(null, "O valor da série de " + n + "! é " + serie);
    }
}

