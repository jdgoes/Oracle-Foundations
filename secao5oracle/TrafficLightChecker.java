/*
O comportamento normal de um sinal de trânsito é alternar sucessivamente de Vermelho para Verde para Amarelo para Vermelho (e continuar nesse padrão). Crie o programa java TrafficLightChecker.java que determinará a próxima cor de um sinal de trânsito neste padrão: de Vermelho para Verde para Amarelo para Vermelho, com base no sinal de trânsito atual fornecido pelo usuário.


Você deve implementar o seguinte usando uma instrução de decisão if adequada:
1. Faça com que o usuário digite o valor de currentColor. 
2. Calcule a próxima cor do sinal de trânsito com base em currentColor.
3. Avise o usuário sobre qualquer valor de cor inválido. */

import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o código da cor");
            int corAtual = input.nextInt();

            String proximaCor;
            if (corAtual == 0) {
                proximaCor = "Cor inválida";
            } else if (corAtual == 1) {
                proximaCor = "Próximo sinal de trânsito é verde";
            } else if (corAtual == 2) {
                proximaCor = "Próximo sinal de trânsito é amarelo";
            } else if (corAtual == 3) {
                proximaCor = "Próximo sinal de trânsito é vermelho";
            } else {
                proximaCor = "Cor inválida";
            }

            System.out.println(proximaCor);
        }
    }
}
