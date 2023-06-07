/*Sua meta é criar um programa semelhante ao JavaLibs.  
Escreva uma história em que determinadas partes do texto da história resultante sejam modificadas pela entrada do usuário.  
Solicite que o usuário insira várias entradas.

Você pode aceitar que o usuário forneça entradas de várias maneiras, inclusive uma entrada JOptionPane ou Scanner do console. 
Mas escolha um único método. Não use vários métodos de aceitação de entrada. 
Da mesma forma, se você usar JOptionPane para obter a entrada, use JOptionPane para mostrar a história resultante. 

Ao exibir a saída da sua história, certifique-se de que todo o texto esteja visível ao mesmo tempo. 
O texto não deve ultrapassar a área de exibição da tela do computador nem a janela de saída. 
Sua história precisará ser dividida em várias linhas, em vez de ser impressa em uma linha de saída gigante. 
Isso fará com que a saída seja mais clara e o programa pareça mais amigável ao usuário.

Considere a possibilidade de o programa travar se o usuário inserir dados inapropriados. 
Ou seja, não há problema em fazer com que o programa trave porque você esperava que o 
usuário digitasse um número e, em vez disso, ele digitou uma String. Abordaremos o tratamento de exceções mais adiante no curso.

Seu programa também deve fazer o seguinte:
•	Aceitar pelo menos uma entrada, que deverá ser analisada como String
•	Aceitar pelo menos uma entrada, que deverá ser analisada como int
•	Aceitar pelo menos uma entrada, que deverá ser analisada como double
•	Usar pelo menos uma entrada em uma pergunta para o usuário
•	Fazer cálculos com pelo menos uma entrada int
•	Fazer cálculos com pelo menos uma entrada double
•	Aceitar pelo menos um total de dez entradas 

Esse conjunto de problemas pode criar todo o programa dentro do método principal. */


import javax.swing.JOptionPane;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        
        String[] informacoes = {"nome", "idade", "altura em metros", "peso em kg", "floresta", 
        "livro", "primeiro desejo", "segundo desejo", "lugar", "animal"};
        String[] messages = new String[informacoes.length];

        messages[0] = JOptionPane.showInputDialog("Digite o seu "       + informacoes[0] + ":");
        messages[1] = JOptionPane.showInputDialog("Digite a sua "       + informacoes[1] + ":");
        messages[2] = JOptionPane.showInputDialog("Digite uma "         + informacoes[2] + ":");
        messages[3] = JOptionPane.showInputDialog("Digite o seu "       + informacoes[3] + ":");
        messages[4] = JOptionPane.showInputDialog("Digite o nome da "   + informacoes[4] + ":");
        messages[5] = JOptionPane.showInputDialog("Digite o nome do "   + informacoes[5] + ":");
        messages[6] = JOptionPane.showInputDialog("Digite o seu "       + informacoes[6] + ":");
        messages[7] = JOptionPane.showInputDialog("Digite o seu "       + informacoes[7] + ":");
        messages[8] = JOptionPane.showInputDialog("Digite um "          + informacoes[8] + ":");
        messages[9] = JOptionPane.showInputDialog("Digite um "          + informacoes[9] + ":");
        
        CalcularAnoNascimento calculoAno = new CalcularAnoNascimento();
        CalcularPesoNaLua calculoLua = new CalcularPesoNaLua();

        int anoNascimento = calculoAno.calcularAnoNascimento(Integer.parseInt(messages[1]));
        double pesoNaLua = calculoLua.calcularPesoNaLua(Double.parseDouble(messages[3]));

        String story = String.format("Olá, %s!\n\n" +
        "Em um belo dia, quando você tinha %s anos,\n" +
        "você decidiu explorar uma misteriosa floresta chamada %s.\n" +
        "A altura imponente das árvores, que tinham em média %s metros de altura,\n" +
        "deixou você maravilhado(a).\n\n" +
        "Curiosamente, ao chegar ao coração da floresta %s,\n" +
        "você encontrou um antigo livro de magia chamado %s.\n" +
        "Intrigado(a), você começou a ler e descobriu que o livro\n" +
        "tinha o poder de realizar desejos!\n\n" +
        "Para realizar os seus desejos, você tinha que inserir o seu ano de nascimento\n" +
        "e o seu peso na lua. \n"+
        "Após fazer alguns cálculos você descobriu que nasceu no ano %d \n" +
        "e o seu peso na lua é de %.2f kg. \n" +
        "Ansioso, você parte para a realização dos desejos. \n" +
        "O primeiro desejo que você pensou foi %s,\n" +
        "e o segundo desejo foi %s.\n\n" +
        "Mas o livro ainda não tinha revelado todos os seus segredos.\n" +
        "Enquanto você continuava explorando as páginas,\n" +
        "encontrou um feitiço para viajar para o lugar %s,\n" +
        "onde você encontrou um incrível %s.\n\n" +
        "Após essa emocionante aventura, você guardou o livro de magia\n" +
        "e decidiu voltar para casa, sabendo que tinha vivido uma grande história.\n\n" +
        "Fim da história!",
        messages[0], messages[1], messages[4], messages[2], messages[4], messages[5],
        anoNascimento, pesoNaLua, messages[6], messages[7], messages[8], messages[9]);



        JOptionPane.showMessageDialog(null, story);
    }
}


