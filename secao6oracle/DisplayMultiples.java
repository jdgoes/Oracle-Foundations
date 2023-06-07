/* Desenvolva um programa java para calcular os múltiplos de determinado número usando um loop for. 
 Faça com que o usuário insira um número e use um loop for para exibir todos os múltiplos desse número 
de 1 a 12.*/

import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

        System.out.print("Digite um número positivo: ");
        int numeroDigitado = input.nextInt();

        int tabuada = 0;
        
        System.out.printf("%nTabuada do %d: ", numeroDigitado);
        
        for(tabuada = 1; tabuada <= 12; tabuada++){
            System.out.printf("%n%d x %d = %d", numeroDigitado, tabuada, (numeroDigitado * tabuada));
        }

        System.out.println();

        }
    }
}
