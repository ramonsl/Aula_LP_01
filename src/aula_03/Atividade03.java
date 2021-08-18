package aula_03;

import javax.swing.*;
import java.text.DecimalFormat;

public class Atividade03 {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        double np1,np2,nt3;
        double media;
        String dado;
        dado = JOptionPane.showInputDialog("Informe nota da prova 1");
        np1 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe nota da prova 2");
        np2 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe nota do trabalho 1");
        nt3 = Double.parseDouble(dado);

        media=(np1+np2+nt3)/3;
        if(media> 6){
            JOptionPane.showMessageDialog(null,"Aprovado! média: "+df2.format(media));
        }else{
            JOptionPane.showMessageDialog(null,"Reprovado! média: "+df2.format(media));

        }
    }
}
/*


Usando a classe JOptionPane para entrada de dados,
elabore uma classe que receba a nota de duas provas
e de um trabalho.
Calcule e mostre a média e o resultado final (aprovado ou reprovado).
Para calcular a média utilize a fórmula seguinte: média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3. Considere que a média mínima para aprovação é 6.

 */