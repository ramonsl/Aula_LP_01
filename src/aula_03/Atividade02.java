package aula_03;

import javax.swing.*;

public class Atividade02 {

    public static void main(String[] args) {
        double percentualItbi;
        double valVenal;
        double valTrasancao;
        double impostoPago;
        String dado;
        dado= JOptionPane.showInputDialog("Digite o valor da transação");
        valTrasancao = Double.parseDouble(dado);
        dado= JOptionPane.showInputDialog("Digite o valor da venal");
        valVenal = Double.parseDouble(dado);
        dado= JOptionPane.showInputDialog("Digite a porcentagem do imposto");
        percentualItbi = Double.parseDouble(dado);
        if (valTrasancao > valVenal){
            impostoPago = valTrasancao*percentualItbi/100;
        }else{
            impostoPago = valVenal*percentualItbi/100;
        }
        JOptionPane.showMessageDialog( null,"Imposto a ser pago é: "+impostoPago);




    }
}
