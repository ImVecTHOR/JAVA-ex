/**
 * 35.	Receba 2 números inteiros, verifique qual o maior entre eles. 
 * Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex35 {
    public static void main(String[] args) {
        int num1, num2, maior, menor, i, soma = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));
        
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }
        
        for (i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nA soma dos números ímpares entre eles é: " + soma);
    }
}

