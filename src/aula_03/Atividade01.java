package aula_03;

import java.util.Scanner;

public class Atividade01 {
    //algumas variaveis aqui!
    public static void main(String[] args) {
      ///codigo e variaveis///codigo e variaveis

        //Usando a classe Scanner para entrada de dados, crie uma classe que receba o valor de um produto e a porcentagem de desconto, calcule e mostre o valor do desconto e o valor do produto com o desconto. Observação: o valor do desconto é calculado por meio da fórmula: valor do desconto = valor do produto * percentual de desconto / 100.
        Scanner teclado = new Scanner(System.in);
        double preco;
        double teste;

        double porcentagem;
        double desconto;
        double precoComDesconto;
        System.out.println("Digite o valor do produto");
        preco = teclado.nextFloat();
        System.out.println("Digite a porcentagem do desconto");
        porcentagem = teclado.nextFloat();
        desconto = preco*porcentagem/100;
        precoComDesconto =preco-desconto;
        System.out.println("Valor do Produto: "+ preco);
        System.out.println("Valor do desconto: "+ desconto);
        System.out.println("Valor do Produto com desconto: "+ precoComDesconto);
    }
}
