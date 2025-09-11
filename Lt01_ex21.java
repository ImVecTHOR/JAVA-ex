/**
 * 21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
    a.	Se a média for >= 6,0 exibir “APROVADO”;
    b.	Se a média for >= 3,0 E < 6,0 exibir “EXAME”;
    c.	Se a média for < 3,0 exibir “RETIDO”.

 * @author sylve
 */
import javax.swing.JOptionPane;
public class Lt01_ex21 {
    public static void main (String arg []){
    Double N1, N2, N3, N4, M;
        N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua primeira nota: "));    
        N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua segunda nota: "));
        N3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua terceira nota: "));    
        N4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua quarta nota: "));
        M = (N1 + N2 + N3+ N4)/4;
        if(M>=6.0){
            JOptionPane.showMessageDialog(null,"Sua média foi "+M+", você foi aprovado");
        }else if(3.0<=M && M<6.0){
            JOptionPane.showMessageDialog(null,"Sua média foi "+M+", você está de recuperação");
        }else{
            JOptionPane.showMessageDialog(null,"Sua média foi "+M+", você repetiu de ano");
        }
    }
}
