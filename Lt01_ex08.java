/**
 * 8.Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class Lt01_ex08 {
    public static void main (String args [])
    {
        Double D, R;
        D = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do deposito?"));
        R = (D*1.03);
        JOptionPane.showMessageDialog(null,"No próximo mês você render esse deposito para: "+R);
    }
    
}
