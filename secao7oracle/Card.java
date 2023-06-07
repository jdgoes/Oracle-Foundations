import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Card {

    private int numeroDoCartao;
    private double saldoDeCredito;
    private int saldoDeTickets;
    
    private static Set<Integer> numerosDeCartaoUtilizados = new HashSet<>();

    public Card(){
        this.saldoDeCredito = 0.0;
        this.saldoDeTickets = 0;
        gerarNumeroDoCartaoUnico();
    }

    private void gerarNumeroDoCartaoUnico(){

        Random numeroGerado = new Random();
        int numero;
        do{
            numero = numeroGerado.nextInt(900) + 100;
        } while (numerosDeCartaoUtilizados.contains(numero));

        numerosDeCartaoUtilizados.add(numero);
        numeroDoCartao = numero;
    }


    public static Card criarCartao(){
        Card cartao = new Card();
        return cartao;
    }

    
    public double getSaldoDeCredito() {return saldoDeCredito;}
    public int getSaldoDeTickets() {return saldoDeTickets;}
    public int getNumeroDoCartao() {return numeroDoCartao;}


    public void adicionarSaldoDeCredito(double valor) {
        saldoDeCredito += valor;
    }
    
    public void adicionarSaldoDeTickets(int quantidade) {
        saldoDeTickets += quantidade;
    }
    
    public void reduzirSaldoDeCredito(double valor) {
        if (saldoDeCredito >= valor) {
            saldoDeCredito -= valor;
        } else {
            System.out.println("Erro: Crédito insuficiente para redução.");
        }
    }
    
    
    public void reduzirSaldoDeTickets(int quantidade) {

        if (saldoDeTickets >= quantidade)  {
        saldoDeTickets -= quantidade;
        } else {
            System.out.println("Erro: Tickets insuficientes para redução.");
        }
    }

}
