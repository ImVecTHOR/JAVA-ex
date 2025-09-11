/**
 * 40.	Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex40 {
    public static void main(String[] args) {
        int num1, num2, i, j;
        boolean primo;
        String primos = "";
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        
        int menor = num1 < num2 ? num1 : num2;
        int maior = num1 > num2 ? num1 : num2;
        
        for (i = menor; i <= maior; i++) {
            if (i < 2) continue;
            primo = true;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                primos += i + (i < maior ? ", " : "");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Números primos entre " + menor + " e " + maior + ":\n" + primos);
    }
}

