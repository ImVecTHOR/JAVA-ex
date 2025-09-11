/**
 * 16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes. 
 * Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 
 * A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex16 {
    public static void main(String[] args) {
        double horas, valorhora, percentual, salario, salarioliquido;
        int dependentes;
        
        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
        valorhora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora:"));
        percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto (ex: 10 para 10%):"));
        dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes:"));
        
        salario = horas * valorhora;
        salarioliquido = salario - (salario * percentual / 100);
        salarioliquido += dependentes * 100;
        
        JOptionPane.showMessageDialog(null, "O salário a receber é: R$ " + salarioliquido);
    }
}

