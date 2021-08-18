package aula_03;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        /*
        Faça uma classe que solicite login e senha, simulando o acesso a um sistema. Considere que os conteúdos de login e senha originais são iguais a “java8”. O usuário deverá fornecer login e senha e você irá compará-los com os conteúdos originais. O usuário tem três chances para digitar corretamente os dados de login e senha. Para cada tentativa incorreta deve aparecer uma mensagem alertando o erro e apresentando a quantidade de tentativas que ainda restam
         */
        int usuarioAutorizado=1234;
        int senhaAutorizada=1234;
        int senhaInformada;
        int usuarioInformado;
        int cont=0;
        boolean logado=false;
        Scanner tc= new Scanner(System.in);
        do {
            System.out.println("Digite o Usuario");
            usuarioInformado=tc.nextInt();
            System.out.println("Digite a senha");
            senhaInformada=tc.nextInt();
            cont++;
            if((usuarioInformado==usuarioAutorizado)&&(senhaAutorizada==senhaInformada)){
                System.out.println("Login efetuado com sucesso! Numero de tentativas "+cont);
                logado=true;
            }else{
                System.out.println("Login não efetuado! Numero de tentativas "+cont);
            }
        }while ((cont<3) || (logado));

    }
}
