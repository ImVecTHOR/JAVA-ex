/**
 * 32.	Receba um número inteiro. Calcule e mostre o seu fatorial.  
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex32 {
    public static void main(String[] args) {
        int numero, i;
        long fatorial = 1;    
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        for (i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é " + fatorial);
    }
}

