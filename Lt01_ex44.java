/**
 * 44.	Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex44 {
    public static void main(String[] args) {
        int base, expoente, i;
        double potencia = 1;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));
        
        for (i = 1; i <= expoente; i++) {
            potencia *= base;
        }
        
        JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é " + potencia);
    }
}

