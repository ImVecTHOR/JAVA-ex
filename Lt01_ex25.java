/**
 * 25.	Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo do jogo em horas e minutos, 
 * sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex25 {
    public static void main(String[] args) {
        int HI, MI, HF, MF, TI, TF, DM, DH, DMin;

        HI = Integer.parseInt(JOptionPane.showInputDialog("Hora de início (0-23):"));
        MI = Integer.parseInt(JOptionPane.showInputDialog("Minuto de início (0-59):"));
        HF = Integer.parseInt(JOptionPane.showInputDialog("Hora de fim (0-23):"));
        MF = Integer.parseInt(JOptionPane.showInputDialog("Minuto de fim (0-59):"));
        TI = HI * 60 + MI;
        TF = HF * 60 + MF;
        
        if (TF >= TI) {
            DM = TF - TI;
        } else {
            DM = (24 * 60 - TI) + TF;
        }
        
        DH = DM / 60;
        DMin = DM % 60;
        JOptionPane.showMessageDialog(null,"O jogo durou " + DH + " hora(s) e " + DMin + " minuto(s).");
    }
}
