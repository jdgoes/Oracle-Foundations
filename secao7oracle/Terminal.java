public class Terminal {
    
    private double taxaDeConversao;
    
    
    public Terminal() {
        this.taxaDeConversao = 1.0;
    }
    
        public PrizeCategory[] criarCategoriasDePremios() {

        PrizeCategory ursoDePelucia = new PrizeCategory("Urso de Pelúcia", 100, 1);
        PrizeCategory tigreDePelucia = new PrizeCategory("Tigre de Pelúcia", 100, 1);
        PrizeCategory vacaDePelucia = new PrizeCategory("Vaca de Pelúcia", 100, 1);
        
        PrizeCategory[] categoriasDePremios = {ursoDePelucia, tigreDePelucia, vacaDePelucia};
        
        return categoriasDePremios;
    }


    public void aceitarDinheiro(Card cartao, int valorDinheiro) {
        if (valorDinheiro >= 1) {
            double creditosConcedidos = valorDinheiro * taxaDeConversao;
            cartao.adicionarSaldoDeCredito(creditosConcedidos);
            System.out.printf("\nCréditos adicionados ao cartão %d: %.2f \n\n", cartao.getNumeroDoCartao(), creditosConcedidos);
            imprimirSaldoDoCartao(cartao);

        } else {
            System.out.println("Erro: Valor do dinheiro inválido.");
        }
    }
    
    
    public void transferirCreditos(Card cartaoOrigem, Card cartaoDestino, double quantidadeCreditos) {
        if (cartaoOrigem.getSaldoDeCredito() >= quantidadeCreditos) {

            cartaoOrigem.reduzirSaldoDeCredito(quantidadeCreditos);
            cartaoDestino.adicionarSaldoDeCredito(quantidadeCreditos);

            System.out.printf("Transferência de créditos realizada do cartão %d para o cartão %d, quantidade de crédito transferida: %.2f \n\n", 
            cartaoOrigem.getNumeroDoCartao(), cartaoDestino.getNumeroDoCartao() , quantidadeCreditos);

            imprimirSaldoDoCartao(cartaoOrigem);
            imprimirSaldoDoCartao(cartaoDestino);

        } else {
            System.out.println("Erro: Créditos insuficientes para a transferência.");
        }
    }

    public void transferirTickets(Card cartaoOrigem, Card cartaoDestino, int quantidadeTickets) {
        if (cartaoOrigem.getSaldoDeTickets() >= quantidadeTickets) {
            cartaoOrigem.reduzirSaldoDeTickets(quantidadeTickets);
            cartaoDestino.adicionarSaldoDeTickets(quantidadeTickets);
    
            System.out.printf("Transferência de tickets realizada do cartão %d para o cartão %d, quantidade de tickets transferida: %d\n\n",
            cartaoOrigem.getNumeroDoCartao(), cartaoDestino.getNumeroDoCartao(), quantidadeTickets);
    
            imprimirSaldoDoCartao(cartaoOrigem);
            imprimirSaldoDoCartao(cartaoDestino);
        } else {
            System.out.println("Erro: Tickets insuficientes para a transferência.");
        }
    }
    
    public void verificarSaldoDoCartao(Card cartao) {
        imprimirSaldoDoCartao(cartao);
    }
    
    public void trocarTicketsPorPremio(Card cartao, PrizeCategory categoriaPremio) {

        if (cartao.getSaldoDeTickets() >= categoriaPremio.getTicketsObrigatorios()) {

            if (categoriaPremio.getQuantidadePremiosDisponiveis() > 0) {
                cartao.reduzirSaldoDeTickets(categoriaPremio.getTicketsObrigatorios());
                categoriaPremio.reduzirQuantidadePremiosDisponiveis();

                System.out.printf("Prêmio concedido para o cartão %d: %s \n", 
                cartao.getNumeroDoCartao(), categoriaPremio.getNomeDaCategoria());

                System.out.printf("Número restante de prêmios da categoria %s: %d \n", 
                categoriaPremio.getNomeDaCategoria(), categoriaPremio.getQuantidadePremiosDisponiveis());

                imprimirSaldoDoCartao(cartao);
            } else {
                System.out.println("Erro: Não há prêmios disponíveis nesta categoria.");
            }


        } else {
            System.out.println("Erro: Tickets insuficientes para trocar por prêmio.");
        }
    }
    
    
    private void imprimirSaldoDoCartao(Card cartao) {
        System.out.printf("Saldo do cartão %d: \n", cartao.getNumeroDoCartao());
        System.out.printf("Créditos: %.2f\n", cartao.getSaldoDeCredito());
        System.out.printf("Tickets: %d\n", cartao.getSaldoDeTickets());
    }
    
}

