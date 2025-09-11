/**
 * 29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
 * Demais tipos não serão considerados.
 * 
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex29 {
    public static void main(String[] args) {
        double tipo, valor, valorcorrigido;
        tipo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tipo de investimento:\n1 - Poupança (3%)\n2 - Renda Fixa (5%)"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
        
        if (tipo == 1) {
            valorcorrigido = valor * 1.03;
        } else if (tipo == 2) {
            valorcorrigido = valor * 1.05;
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de investimento inválido! Somente 1 ou 2.");
            return;
        }

        JOptionPane.showMessageDialog(null, String.format("Tipo de Investimento: %s\nValor Inicial: R$ %.2f\nValor Corrigido em 30 dias: R$ %.2f",
            (tipo == 1 ? "Poupança" : "Renda Fixa"), valor, valorcorrigido));
    }
}

