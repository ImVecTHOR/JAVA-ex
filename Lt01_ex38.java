/**
 * 38.	Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex38 {
    public static void main(String[] args) {
        int i;
        double numero, maior = 0, menor = Double.MAX_VALUE;
        
        for (i = 1; i <= 100; i++) {
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + i + "º número positivo:"));
            
            if (numero <= 0) {
                JOptionPane.showMessageDialog(null, "Apenas números positivos são permitidos.");
                i--;
                continue;
            }
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O maior número digitado é: " + maior + "\nO menor número digitado é: " + menor);
    }
}

