/**
 * 41.	Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex41 {
    public static void main(String[] args) {
        int dado1, dado2;
        String resultados = "";
        
        for (dado1 = 1; dado1 <= 6; dado1++) {
            for (dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == 7) {
                    resultados += "(" + dado1 + ", " + dado2 + ")\n";
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Todas as combinações de dois dados que somam 7:\n" + resultados);
    }
}

