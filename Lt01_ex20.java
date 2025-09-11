/**
 * 20.	Receba 3 coeficientes A, B e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 * Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex20 {
    public static void main (String arg []){
        int CA, CB, CC, UR, DRN, DRP, D;
            CA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente A: "));
            CB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente B: "));
            CC = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente C: "));
            D = (int) Math.pow(CB, 2) - 4 * CA * CC;
        if (D<0){
            JOptionPane.showMessageDialog(null,"Não existe raizes reais, pois o resultado é "+D);
        }else if(D>0){
            DRP = (-CB + (int)Math.sqrt(D))/(2*CA);
            DRN = (-CB - (int)Math.sqrt(D))/(2*CA);
            JOptionPane.showMessageDialog(null,"Existe duas raizes reais "+DRP+" e "+DRN);
        }
        else{
            UR = -CB/(2*CA);
            JOptionPane.showMessageDialog(null,"Só existe uma raiz real que é "+UR);
        }
    }
}
