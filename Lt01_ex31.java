/**
 * 31.	Calcule e mostre o quadrado dos números entre 10 e 150.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex31 {
    public static void main(String[] args) {
        int i, inicio, fim, quadrado;
        inicio = 10;
        fim = 150;
        String resultado = "";
        
        for (i = inicio; i <= fim; i++) {
            quadrado = i * i;
            resultado += i + "² = " + quadrado + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
