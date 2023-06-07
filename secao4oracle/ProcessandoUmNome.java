import java.util.Scanner;

public class ProcessandoUmNome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCompleto = input.nextLine();
        input.close();

        String[] nomes = nomeCompleto.split(" ");
        String primeiroNome = nomes[0];
        String ultimoNome = nomes[nomes.length - 1];

        String nomeFormatado = String.format("%s, %s.", ultimoNome, primeiroNome.charAt(0));

        System.out.printf("Seu nome é: %s \n", nomeFormatado);
        
    }
}

