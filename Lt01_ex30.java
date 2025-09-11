/**
 * 30.	Receba a data de nascimento e atual em ano, mês e dia. 
 * Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 * @author sylve
 */

import javax.swing.JOptionPane;
public class Lt01_ex30 {
    public static void main(String[] args) {
        int dianasc, mesnasc, anonasc;
        int diaatual, mesatual, anoatual;
        int anos = 0, meses = 0, dias = 0;
        
        dianasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento:"));
        mesnasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento:"));
        anonasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        
        diaatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual:"));
        mesatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual:"));
        anoatual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
        
        int tempdianasc = dianasc;
        int tempmesnasc = mesnasc;
        int tempanonasc = anonasc;
        dias = 0;
        
        while (tempdianasc != diaatual || tempmesnasc != mesatual || tempanonasc != anoatual) {
            dias++;
            tempdianasc++;
            int diasnomes = diasnomes(tempanonasc, tempmesnasc);
            if (tempdianasc > diasnomes) {
                tempdianasc = 1;
                tempmesnasc++;
            }
            if (tempmesnasc > 12) {
                tempmesnasc = 1;
                tempanonasc++;
            }
        }
        
        anos = anoatual - anonasc;
        meses = mesatual - mesnasc;
        dias = diaatual - dianasc;
        
        if (dias < 0) {
            meses--;
            dias += diasnomes(anoatual, (mesatual == 1 ? 12 : mesatual - 1));
        }
        if (meses < 0) {
            anos--;
            meses += 12;
        }
        
        JOptionPane.showMessageDialog(null, "Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
    
    public static int diasnomes(int ano, int mes) {
        switch (mes) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}


