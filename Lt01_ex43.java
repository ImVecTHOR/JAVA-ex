/**
 * 43.	Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria
 * sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex43 {
    public static void main(String[] args) {
        double alturaana = 1.10, alturamaria = 1.50, crescimentoana = 0.03, crescementomaria = 0.02;
        int anos = 0;
        
        while (alturaana <= alturamaria) {
            alturaana += crescimentoana;
            alturamaria += crescementomaria;
            anos++;
        }
        
        JOptionPane.showMessageDialog(null, "Serão necessários " + anos + " anos para que Ana seja mais alta que Maria.");
    }
}

