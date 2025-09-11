/**
 * 42.	Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex42 {
    public static void main(String[] args) {
        int i, numerador = 1, denominador = 1;
        double serie = 0;
        
        for (i = 1; i <= 50; i++) {
            serie += (double) numerador / denominador;
            numerador++;
            denominador += 2;
        }
        
        JOptionPane.showMessageDialog(null, "O valor da série 1 + 2/3 + 3/5 + ... + 50/99 é " + serie);
    }
}

