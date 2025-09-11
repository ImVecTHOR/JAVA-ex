/**
 * 45.	Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex45 {
    public static void main(String[] args) {
        int i;
        double serie = 0;
        
        for (i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                serie -= (double) i / (i * i);
            } else {
                serie += (double) i / (i * i);
            }
        }
        
        JOptionPane.showMessageDialog(null, "O valor da série 1 - 2/4 + 3/9 - 4/16 + ... + 15/225 é " + serie);
    }
}

