package celular;

import java.util.Scanner;

public class reprodutorMusical {

    public void  pausar() {
        System.out.println("Música pausada");
    }

    public void tocar() {
        System.out.println("Tocando Música");
    }

    public void selecionar(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite a música desejada:");
            String musica = sc.nextLine();
            System.out.println("A música: " + musica + "foi selecionada para tocar");
        }
    }
    
}
