package celular;

import java.util.Scanner;

public class navegadorInternet {
    public void exibirPagina(){
        System.out.println("Exibindo página.");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada.");
    }

    public void addNovaAba(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Qual aba deseja abrir?");
            String aba = sc.nextLine();
            System.out.println("Nova Aba " + aba + " adicionada.");
        }
    }
}
