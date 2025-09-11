/*
1.	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5. */
import javax.swing.JOptionPane;
public class Lt01_Ex01 {
    public static void main (String args [])
    {
    Double c,f;
    c = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius:"));
    f = (9*c+160)/5;
    JOptionPane.showMessageDialog(null,"A temperatura em fahrenheit é: " +f);
    }
}