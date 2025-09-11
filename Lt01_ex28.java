/**
 * 28.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
 *  Venda Mensal Preço Atual Preço Novo
 *  < 500	< 30	+ 10%
 *  >= 500 e < 1000	>= 30 e < 80	+15%
 *  >= 1000	>= 80	- 5%
 *  Obs.: para outras condições, preço novo será igual ao preço atual.
 *
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex28 {
    public static void main(String[] args) {
        double precoatual, mediamensal, precoNovo;
        
        precoatual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto:"));
        mediamensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal de vendas do produto:"));

        if (mediamensal < 500 && precoatual < 30) {
            precoNovo = precoatual * 1.10; // +10%
        } else if (mediamensal >= 500 && mediamensal < 1000 && precoatual >= 30 && precoatual < 80) {
            precoNovo = precoatual * 1.15; // +15%
        } else if (mediamensal >= 1000 && precoatual >= 80) {
            precoNovo = precoatual * 0.95; // -5%
        } else {
            precoNovo = precoatual; // permanece o mesmo
        }

        // Saída
        JOptionPane.showMessageDialog(null, 
            String.format("Preço Atual: R$ %.2f\nMédia Mensal: %.0f\nNovo Preço: R$ %.2f", precoatual, mediamensal, precoNovo));
    }
}

