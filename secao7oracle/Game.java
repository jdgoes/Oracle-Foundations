import java.util.Random;

public class Game {

    private String nomeDoJogo;
    private int creditosNecessarios;
    private boolean chanceDeNaoGanharTickets;

    public Game(String nomeDoJogo, int creditosNecessarios, boolean chanceDeNaoGanharTickets){
        this.nomeDoJogo = nomeDoJogo;
        this.creditosNecessarios = creditosNecessarios;
        this.chanceDeNaoGanharTickets = chanceDeNaoGanharTickets;
    }

    private int gerarNumeroAleatorioDeTickets() {
        Random ticketsAleatorios = new Random();

        if (chanceDeNaoGanharTickets) {

            int chanceDeGanharTickets = ticketsAleatorios.nextInt(20); 

            if (chanceDeGanharTickets < 10) {
                return ticketsAleatorios.nextInt(20) + 1; 
            } else { return 0; }
            
        } else { return ticketsAleatorios.nextInt(20) + 1; }

    }

    public void jogar(Card cartao){

        if(cartao.getSaldoDeCredito() >= creditosNecessarios){
            
            cartao.reduzirSaldoDeCredito(creditosNecessarios);

            int ticketsGanhos = gerarNumeroAleatorioDeTickets();
            cartao.adicionarSaldoDeTickets(ticketsGanhos);

            System.out.printf("\nJogo: %s\n", nomeDoJogo);
            System.out.printf("Número do Cartão: %d\n", cartao.getNumeroDoCartao());
            System.out.printf("Tickets Ganhos: %d\n", ticketsGanhos);
            System.out.printf("Novo Saldo de Tickets: %d\n", cartao.getSaldoDeTickets());
        } else{
            System.out.println("Erro: Créditos insuficientes para jogar o jogo.");
        }

    }

    public String getNomeDoJogo() {return nomeDoJogo;}
}


