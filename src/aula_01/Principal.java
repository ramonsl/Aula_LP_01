package aula_01;

import javax.swing.*;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    int x=10;
    System.out.println(x++);
    System.out.println("Escreva um inteiro");
    Scanner leia = new Scanner(System.in);
    x=Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
    System.out.println(x);
    leia.next();

   x= leia.nextInt();
    System.out.println(x);
     x=(int)leia.nextFloat();
    System.out.println(x);

  }

}
