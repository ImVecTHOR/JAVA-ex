/*
6.Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
  Receber o tempo de percurso e a velocidade média.
 */

/**
 *
 * @author Ryan
 */
import javax.swing.JOptionPane;
public class Lt01_ex06 {
    public static void main(String args[]) {
        double dist, t, vm, l;
        t = Double.parseDouble(JOptionPane.showInputDialog("Tempo de percurso: "));
        vm = Double.parseDouble(JOptionPane.showInputDialog("Velocidade média: "));
        //distancia
        dist = t*vm;
        //litros gastos
        l = dist/12;
        
        JOptionPane.showMessageDialog(null,"A quantidade de litros gastos na viagem é de "+l+" litros");
    }
}