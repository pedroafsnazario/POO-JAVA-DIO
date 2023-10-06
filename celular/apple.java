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



telefone.atender();

telefone.ligar();

telefone.iniciarCorreioVoz();



    
}

}