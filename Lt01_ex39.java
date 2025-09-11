/**
 * 39.	Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 *  Casa: 	1	2	3	4	...	64
 *  Qdte:	1	2	4	8	...	N
 *
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex39 {
    public static void main(String[] args) {
        int i, casa = 64;
        long grãos = 1;
        String resultado = "Casa 1: 1 grão\n";
        
        for (i = 2; i <= casa; i++) {
            grãos *= 2;
            resultado += "Casa " + i + ": " + grãos + " grãos\n";
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}

