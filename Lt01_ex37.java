/**
 * 37.	Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex37 {
    public static void main(String[] args) {
        int n, i;
        int termo1 = 0, termo2 = 1, proximo;
        String serie = "";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo:"));
        
        for (i = 1; i <= n; i++) {
            serie += termo1 + (i < n ? ", " : "");
            proximo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximo;
        }
        
        JOptionPane.showMessageDialog(null, "Série de Fibonacci até o " + n + "º termo:\n" + serie);
    }
}

