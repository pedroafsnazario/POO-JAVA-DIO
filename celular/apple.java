package celular;

import java.util.Scanner;

public class apple {
public static void main(String[] args) {
    
aparelhoTelefonico telefone = new aparelhoTelefonico();
navegadorInternet internet = new navegadorInternet();
reprodutorMusical musica = new reprodutorMusical();

System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = =");
System.out.println("Bem-Vindo, este é seu telefone. O que deseja fazer?");
System.out.println("Digite telefone, para realizar ligacoes e atendimentos");
System.out.println("Digite internet para acessar a internet");
System.out.println("Digite musica para acessar seu Reprodutor Musical");
System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = =");

Scanner sc = new Scanner(System.in);

String opcao = sc.nextLine();

switch (opcao) {

case "telefone":
telefone.atender();

telefone.ligar();

telefone.iniciarCorreioVoz();
break;

case "internet":
internet.exibirPagina();

internet.atualizarPagina();

internet.addNovaAba();
break;

case "musica":
musica.tocar();

musica.pausar();

musica.selecionar();
break;

default:
System.out.println("Valor inserido inválido");
System.exit(0);
}

System.exit(0);
    
}

}