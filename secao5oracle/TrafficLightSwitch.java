/* Implemente o exercício 5-2 usando a instrução switch e 
certifique-se de que o programa alerte os usuários caso eles insiram um valor inválido. */

import java.util.Scanner;

public class TrafficLightSwitch {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite o código da cor");
            int corAtual = input.nextInt();

            String proximaCor;
            switch (corAtual) {
                case 1:
                    proximaCor = "Próximo sinal de trânsito é verde";
                    break;
                case 2:
                    proximaCor = "Próximo sinal de trânsito é amarelo";
                    break;
                case 3:
                    proximaCor = "Próximo sinal de trânsito é vermelho";
                    break;
                default:
                    proximaCor = "Cor inválida";
                    break;
            }

            System.out.println(proximaCor);

        }
    }
}

