/*
2.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
        Calcule e mostre as raízes reais (considerar que a equação possui 2 raízes).
 */
import javax.swing.JOptionPane;
public class Lt01_ex02 {
    public static void main (String args[]){
        double A, B, C, r1, r2, d, rd;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de C: "));
        /* delta = B**−4AC */
        d = (B*B)- 4*A*C;
    if (d < 0){
        JOptionPane.showMessageDialog(null,"não possui duas raízes.");
    }else{
        rd = Math.sqrt(d);
        r1 = ((-B+rd)/(2*A));
        r2 = ((-B-rd)/(2*A));

        JOptionPane.showMessageDialog(null,"As raízes são "+r1+" e "+r2);
    }
}
}
