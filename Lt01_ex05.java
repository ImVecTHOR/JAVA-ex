/*
5.Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
  Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto).
  A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 */

/**
 *
 * @author Ryan
 */
import javax.swing.JOptionPane;
public class Lt01_ex05 {
    public static void main(String args[]) {
        double ht, vh, p, d, sb, sl, sf;
        //recebendo os valores
        ht = Double.parseDouble(JOptionPane.showInputDialog("Informe as horas trabalhas: "));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora: "));
        p = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto: "));
        d = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de descendentes (se não houver, coloque 0)"));
        
        //salario bruto
        sb = ht*vh;
        //salario liquido
        sl = sb-p;
        //salario final
        sf = sl+(d*100);
        
        JOptionPane.showMessageDialog(null,"O salário final a receber é: R$"+sf);
    }
}
