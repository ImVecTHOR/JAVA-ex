/*
 3.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 */

/**
 *
 * @author Ryan
 */
import javax.swing.JOptionPane;
public class Lt01_ex03 {
    public static void main(String args[]) {
        double x, y, z;
        x = Double.parseDouble(JOptionPane.showInputDialog("Valor de X: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Valor de y: "));
        
        System.out.println("Valor de X: "+x+"\nValor de Y: "+y); //print no console para verificação
        JOptionPane.showMessageDialog(null,"Valor de X: "+x+"\nValor de Y: "+y);
        
        JOptionPane.showMessageDialog(null,"Efetuando troca... ");
        z = y;
        y = x;
        x = z;
        
        System.out.println("Valor de X: "+x+"\nValor de Y: "+y); //print no console para verificação
        JOptionPane.showMessageDialog(null,"\nNovos valores:\nValor de X: "+x+"\nValor de Y: "+y);
        
        System.exit(0);// encerra o programa, só pro caso dele continuar rodando (aconteceu não sei como)

    }
}
