![Java](https://cloudblogs.microsoft.com/wp-content/uploads/sites/37/2021/04/Duke_OpenJDK_animation_Final.gif)

<h1>Oracle - Java Foundations</h1>
<p>Repositório para as atividades propostas no curso de Java Foundations da Oracle.</p>

<h3>SEÇÃO 02 - JAVA FOUNDATIONS</h3>


<p>Problema 1: Arte ASCII Simples

Explicação: Recriar uma carinha feliz usando arte ASCII com um único caractere, além do espaço.  
Instruções: Usar oito instruções de impressão para criar a imagem.

Problema 2: Arte ASCII Original

Explicação: Criar uma arte ASCII original usando instruções de impressão.  
Instruções: Criar uma imagem com pelo menos oito instruções de impressão, ter pelo menos oito caracteres de largura e usar pelo menos 20 caracteres que não sejam espaço. Comentar o que a arte retrata.</p>

<h3>SEÇÃO 03 - JAVA FOUNDATIONS</h3>
<p>Problema 1: Criar um Jogo do JavaLibs<br>
  
Explicação:  Criar um programa semelhante ao JavaLibs, onde o usuário fornece entradas para modificar uma história pré-determinada.  
  O programa deve aceitar diferentes tipos de entrada (String, int, double), realizar cálculos e exibir a história resultante.   
  A saída deve ser formatada em várias linhas para facilitar a leitura. O programa deve aceitar pelo menos dez entradas e pode ser desenvolvido no método principal.</p>

<h3>SEÇÃO 04 - JAVA FOUNDATIONS</h3>
<p>Problema 1: Métodos de Cálculo

Explicação: Implementar métodos em Java para converter temperatura de Fahrenheit para Celsius, calcular a hipotenusa de um triângulo e simular o lançamento de dois dados de seis lados.  
Os métodos estão definidos no arquivo ComputeMethods.java.  
Utilizar o arquivo TestClass.java para criar uma instância da classe ComputeMethods e chamar os métodos, exibindo os resultados.

Problema 2: Processamento de Nome

Explicação: Desenvolver um programa em Java que processa um nome inserido pelo usuário.  
Extrair o primeiro e último nomes do nome completo fornecido.  
Utilizar métodos da classe String para manipular o nome e exibir o sobrenome seguido da primeira inicial.  
O programa está implementado no arquivo ProcessName.java.</p>

<h3>SEÇÃO 05 - JAVA FOUNDATIONS</h3>
<p>Problema 1: Determinando a cor no espectro visível

Explicação: Criar um programa Java chamado ColorRange.java.  
Solicitar que o usuário insira um comprimento de onda em nanômetros.  
Determinar a cor correspondente no espectro visível com base no intervalo de comprimento de onda.  
Exibir a cor correspondente ou informar se o comprimento de onda está fora do espectro visível.

Problema 2: Determinando a próxima cor de um sinal de trânsito

Explicação: Criar um programa Java chamado TrafficLightChecker.java.  
Solicitar que o usuário insira a cor atual de um sinal de trânsito.  
Calcular a próxima cor do sinal de trânsito com base na cor atual.  
Exibir a próxima cor do sinal de trânsito ou informar se a cor inserida é inválida.

Problema 3: Determinando a próxima cor de um sinal de trânsito usando switch

Explicação: Repetir o Problema 5-2 utilizando a instrução switch em vez de if.  
Implementar o programa em Java chamado TrafficLightSwitch.java.  
Alertar o usuário caso uma cor inválida seja inserida.</p>

<h3>SEÇÃO 06 - JAVA FOUNDATIONS</h3>
<p>Problema 1: Validando um PIN Bancário

Explicação: Desenvolver um programa Java que valide um PIN bancário inserido pelo cliente.  
Usar um loop while para repetir o código até que um PIN válido seja inserido.  
Comparar o PIN inserido pelo usuário com um PIN válido declarado.  
Solicitar que o usuário insira o PIN novamente caso ele não seja correto.  
Exibir uma mensagem confirmando que o PIN correto foi inserido e que o usuário tem acesso à conta.

Problema 2: Exibindo Múltiplos de um Número

Explicação: Desenvolver um programa Java que exiba os múltiplos de um número inserido pelo usuário.  
Usar um loop for para calcular e exibir os múltiplos desse número de 1 a 12.  
Solicitar que o usuário insira um número.  
Exibir os múltiplos do número inserido multiplicados por cada número de 1 a 12.

Problema 3: Arte ASCII Programática

Explicação: Desenvolver um programa Java que desenhe formas básicas de maneira programática.  
Implementar os métodos createRectangle() e createTriangle() em LoopShape.java.  
O método createRectangle() deve imprimir um retângulo com largura e altura personalizáveis.  
O método createTriangle() deve imprimir um triângulo isósceles direito com tamanho personalizável.  
Recusar-se a desenhar formas com dimensões inferiores a 1.  
Permitir que o programa desenhe formas 1x1.  
Experimentar diferentes valores de largura, altura e tamanho do triângulo ao chamar os métodos.</p>

<h3>SEÇÃO 07 - JAVA FOUNDATIONS</h3>
<p>Problema 1: Um Encontro Noturno no Fliperama

Explicação: Criar um programa Java que modele as propriedades, comportamentos e interações de objetos no fliperama.  
Modelar os cartões utilizados no fliperama, que armazenam informações como saldo de créditos e saldo de tíquetes.  
Implementar jogos que consomem créditos dos cartões e geram tíquetes como prêmios.  
Criar categorias de prêmios que possuem um nome, número de tíquetes necessários e quantidade disponível.  
Implementar terminais que possuem um leitor de cartão magnético e permitem converter dinheiro em créditos, transferir saldos entre cartões e trocar tíquetes por prêmios.  
Utilizar um método principal para testar o programa, instanciando cartões e outros objetos, carregando créditos nos cartões, jogando jogos, transferindo saldos entre cartões e solicitando prêmios.  
Resumindo, o programa simula interações e funcionalidades de um fliperama, permitindo a manipulação de cartões, jogos, prêmios e terminais.</p>

<h3>SEÇÃO 08 - JAVA FOUNDATIONS</h3>
<p>Problema 1: A Liga de Futebol

Explicação: Criar um programa Java que modele uma liga de futebol e controle as estatísticas da temporada.  
A liga é composta por quatro equipes e os jogos são determinados aleatoriamente.  
Cada semana, há dois jogos, permitindo que todas as equipes joguem semanalmente.  
A temporada continua até a chegada do inverno, sendo interrompida se houver três semanas consecutivas de temperaturas muito baixas.  
As equipes possuem nomes e o programa deve registrar o total de vitórias, derrotas, empates, gols marcados e gols sofridos para cada equipe.  
Os jogos possuem um número de identificação, nome e pontuação das equipes, além da temperatura do dia.  
As pontuações são determinadas aleatoriamente, sendo influenciadas pela temperatura.  
Ao final da temporada, o programa deve imprimir as estatísticas de cada equipe, a temperatura mais quente e a temperatura média da temporada.  
O programa deve aceitar a entrada do usuário para informar a temperatura e programar os jogos de acordo.  
O usuário pode fornecer a temperatura enquanto o programa está sendo executado, sem travamentos.  
Os jogos devem ser agendados caso a temperatura permita, com oponentes escolhidos aleatoriamente, evitando jogos entre a mesma equipe.  
Se ocorrerem três semanas consecutivas de temperaturas congelantes, a temporada é encerrada.  
Resumindo, o programa simula uma liga de futebol, permitindo o controle das estatísticas da temporada, agendamento de jogos de acordo com a temperatura e exibição das informações relevantes ao final da temporada.</p>
