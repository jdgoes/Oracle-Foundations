import java.util.Scanner;
import javax.swing.JOptionPane;
public class ArcadeTeste {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            Terminal terminal = new Terminal();
            PrizeCategory[] categoriasDePremios = terminal.criarCategoriasDePremios();

            Card cartao1 = Card.criarCartao();
            Card cartao2 = Card.criarCartao();

            terminal.aceitarDinheiro(cartao1, 100);
            terminal.aceitarDinheiro(cartao2, 100);

            Game jogo1 = new Game("Roleta dos Tickets", 10, false);
            Game jogo2 = new Game("Tickets da Sorte", 5, true);

            boolean executar = true;

            while (executar) {
                System.out.println("\n==== Menu ====");
                System.out.println("1 - Jogar");
                System.out.println("2 - Adicionar Créditos");
                System.out.println("3 - Transferir Créditos");
                System.out.println("4 - Transferir Tickets");
                System.out.println("5 - Resgatar Prêmios");
                System.out.println("6 - Consultar Saldo do Cartão 1");
                System.out.println("7 - Consultar Saldo do Cartão 2");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");


                    int opcaoMenu = input.nextInt();
                    input.nextLine();

                    switch (opcaoMenu) {
                        case 1:
                            System.out.println("\n==== Jogar ====");
                            System.out.println("Escolha o jogo:");
                            System.out.printf("1 - %s\n", jogo1.getNomeDoJogo());
                            System.out.printf("2 - %s\n", jogo2.getNomeDoJogo());

                            System.out.print("Opção: ");
                            int opcaoJogo = input.nextInt();
                            input.nextLine();

                            System.out.println("Escolha o cartão:");
                            System.out.printf("1 - Cartão %d\n", cartao1.getNumeroDoCartao());
                            System.out.printf("2 - Cartão %d\n", cartao2.getNumeroDoCartao());
                            System.out.print("Opção: ");
                            int opcaoCartao = input.nextInt();
                            input.nextLine();

                            Game jogoSelecionado = null;
                            Card cartaoSelecionado = null;

                            if (opcaoJogo == 1) {
                                jogoSelecionado = jogo1;
                            } else if (opcaoJogo == 2) {
                                jogoSelecionado = jogo2;
                            }
                            if (opcaoCartao == 1) {
                                cartaoSelecionado = cartao1;
                            } else if (opcaoCartao == 2) {
                                cartaoSelecionado = cartao2;
                            }
                            if (jogoSelecionado != null && cartaoSelecionado != null) {
                                jogoSelecionado.jogar(cartaoSelecionado);
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;

                        case 2:
                            System.out.println("\n==== Adicionar Créditos ====");
                            System.out.println("Escolha o cartão para adicionar créditos:");
                            System.out.printf("1 - Cartão %d\n", cartao1.getNumeroDoCartao());
                            System.out.printf("2 - Cartão %d\n", cartao2.getNumeroDoCartao());
                            System.out.print("Opção: ");
                            int opcaoCartaoAdicionarCreditos = input.nextInt();
                            input.nextLine();

                            System.out.print("Digite o valor em dinheiro: ");
                            int valorDinheiro = input.nextInt();
                            input.nextLine();

                            Card cartaoAdicionarCreditos = null;
                            if (opcaoCartaoAdicionarCreditos == 1) {
                                cartaoAdicionarCreditos = cartao1;
                            } else if (opcaoCartaoAdicionarCreditos == 2) {
                                cartaoAdicionarCreditos = cartao2;
                            }
                            if (cartaoAdicionarCreditos != null) {
                                terminal.aceitarDinheiro(cartaoAdicionarCreditos, valorDinheiro);
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;

                        case 3:
                            System.out.println("\n==== Transferir Créditos ====");
                            System.out.println("Escolha o cartão de origem:");
                            System.out.printf("1 - Cartão %d\n", cartao1.getNumeroDoCartao());
                            System.out.printf("2 - Cartão %d\n", cartao2.getNumeroDoCartao());
                            System.out.print("Opção: ");

                            int opcaoCartaoOrigem = input.nextInt();
                            input.nextLine();

                            System.out.println("Escolha o cartão de destino:");
                            System.out.printf("1 - Cartão %d\n", cartao1.getNumeroDoCartao());
                            System.out.printf("2 - Cartão %d\n", cartao2.getNumeroDoCartao());
                            System.out.print("Opção: ");
                            int opcaoCartaoDestino = input.nextInt();
                            input.nextLine();

                            Card cartaoOrigem = null;
                            Card cartaoDestino = null;

                            if (opcaoCartaoOrigem == 1) {
                                cartaoOrigem = cartao1;
                            } else if (opcaoCartaoOrigem == 2) {
                                cartaoOrigem = cartao2;
                            }
                            if (opcaoCartaoDestino == 1) {
                                cartaoDestino = cartao1;
                            } else if (opcaoCartaoDestino == 2) {
                                cartaoDestino = cartao2;
                            }
                            if (cartaoOrigem != null && cartaoDestino != null) {
                                System.out.println("Digite a quantidade de créditos a transferir: ");
                                double quantidadeCreditos = input.nextDouble();
                                input.nextLine();
                                terminal.transferirCreditos(cartaoOrigem, cartaoDestino, quantidadeCreditos);
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            break;

                        case 4:
                                System.out.println("\n==== Transferir Tickets ====");
                                System.out.println("Escolha o cartão de origem:");
                                System.out.printf("1 - Cartão %d\n", cartao1.getNumeroDoCartao());
                                System.out.printf("2 - Cartão %d\n", cartao2.getNumeroDoCartao());
                                System.out.print("Opção: ");

                                int opcaoCartaoOrigem2 = input.nextInt();
                                input.nextLine();

                                System.out.println("Escolha o cartão de destino:");
                                System.out.printf("1 - Cartão %d\n", cartao1.getNumeroDoCartao());
                                System.out.printf("2 - Cartão %d\n", cartao2.getNumeroDoCartao());
                                System.out.print("Opção: ");
                                int opcaoCartaoDestino2 = input.nextInt();
                                input.nextLine();

                                Card cartaoOrigem2 = null;
                                Card cartaoDestino2 = null;

                                if (opcaoCartaoOrigem2 == 1) {
                                    cartaoOrigem2 = cartao1;
                                } else if (opcaoCartaoOrigem2 == 2) {
                                    cartaoOrigem2 = cartao2;
                                }
                                if (opcaoCartaoDestino2 == 1) {
                                    cartaoDestino2 = cartao1;
                                } else if (opcaoCartaoDestino2 == 2) {
                                    cartaoDestino2 = cartao2;
                                }
                                if (cartaoOrigem2 != null && cartaoDestino2 != null) {
                                    System.out.println("Digite a quantidade de tickets a transferir: ");
                                    int quantidadeTickets = input.nextInt();
                                    input.nextLine();
                                    terminal.transferirTickets(cartaoOrigem2, cartaoDestino2, quantidadeTickets);
                                } else {
                                    System.out.println("Opção inválida.");
                                }
                            break;

                        case 5:
                        System.out.println("\n==== Resgatar Prêmios ====");
                        System.out.println("Escolha o cartão:");
                        System.out.printf("1 - Cartão %d\n", cartao1.getNumeroDoCartao());
                        System.out.printf("2 - Cartão %d\n", cartao2.getNumeroDoCartao());
                        System.out.print("Opção: ");
                        int opcaoCartaoResgate = input.nextInt();
                        input.nextLine();

                        Card cartaoResgate = null;
                        if (opcaoCartaoResgate == 1) {
                            cartaoResgate = cartao1;
                        } else if (opcaoCartaoResgate == 2) {
                            cartaoResgate = cartao2;
                        }

                        if (cartaoResgate != null) {

                            System.out.println("\nCategorias de Prêmios Disponíveis:");

                            for (int count = 0; count < categoriasDePremios.length; count++) {
                                PrizeCategory categoria = categoriasDePremios[count];
                                System.out.printf("%d - %s (Tickets: %d)\n", 
                                count + 1, categoria.getNomeDaCategoria(), categoria.getTicketsObrigatorios());
                            }

                            System.out.print("\nEscolha uma categoria de prêmio: ");
                            int opcaoCategoria = input.nextInt();
                            input.nextLine();

                            if (opcaoCategoria > 0 && opcaoCategoria <= categoriasDePremios.length) {
                                PrizeCategory categoriaPremio = categoriasDePremios[opcaoCategoria - 1];
                                terminal.trocarTicketsPorPremio(cartaoResgate, categoriaPremio);
                            } else {
                                System.out.println("Opção inválida.");
                            }
                            
                        } else {
                            System.out.println("Opção inválida.");
                        }
                            break;

                        case 6:
                            System.out.println("\n==== Consultar Saldo do Cartão 1 ====");
                            System.out.printf("Saldo do Cartão %d: %.2f Créditos\n", cartao1.getNumeroDoCartao(), cartao1.getSaldoDeCredito());
                            System.out.printf("Saldo do Cartão %d: %d Tickets \n\n", cartao1.getNumeroDoCartao(), cartao1.getSaldoDeTickets());
                            break;

                        case 7:
                            System.out.println("\n==== Consultar Saldo do Cartão 2 ====");
                            System.out.printf("Saldo do Cartão %d: %.2f\n", cartao2.getNumeroDoCartao(), cartao2.getSaldoDeCredito());
                            System.out.printf("Saldo do Cartão %d: %d tickets \n\n", cartao2.getNumeroDoCartao(), cartao2.getSaldoDeTickets());
                            break;

                        case 0:
                            executar = false;
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                
            }
        } catch (IllegalArgumentException e) {
            String IllegalArgument = "Valor dos menus inválidos.";
            JOptionPane.showMessageDialog(null, IllegalArgument);
        }
        
        System.out.println("Encerrando o programa.");
    }
}








