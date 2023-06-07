public class PrizeCategory {
    private String nomeDaCategoria;
    private int ticketsObrigatorios;
    private int quantidadePremiosDisponiveis;

    public PrizeCategory(String nomeDaCategoria, int ticketsObrigatorios, int quantidadePremiosDisponiveis) {
        this.nomeDaCategoria = nomeDaCategoria;
        this.ticketsObrigatorios = ticketsObrigatorios;
        this.quantidadePremiosDisponiveis = quantidadePremiosDisponiveis;
    }

    public String getNomeDaCategoria() {return nomeDaCategoria;}

    public int getTicketsObrigatorios() {return ticketsObrigatorios;}

    public int getQuantidadePremiosDisponiveis() {return quantidadePremiosDisponiveis;}

    public void reduzirQuantidadePremiosDisponiveis() {
        if (quantidadePremiosDisponiveis > 0) {
            quantidadePremiosDisponiveis--;
        } else {
            System.out.println("Não há prêmios disponíveis nesta categoria.");
        }
    }
}

