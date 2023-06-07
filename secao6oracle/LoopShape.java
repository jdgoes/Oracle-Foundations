/* Complete os dois métodos a seguir em LoopShape.java:
•	createRectangle(): este método aceita dois argumentos para largura e altura que devem ser usados para imprimir um retângulo.
•	createTriangle(): este método aceita um argumento para o tamanho de uma perna, que deve ser usado para imprimir um triângulo isósceles direito.

Tente mudar o valor dos argumentos de que você está fornecendo esses dois métodos do método principal. Certifique-se de que seu programa seja capaz de desenhar cada forma com um tamanho personalizado. 
Além disso, seu programa deve fazer o seguinte:
•	Recusar-se a desenhar formas com qualquer dimensão inferior a 1
•	Ser capaz de desenhar formas com qualquer dimensão igual a 1 (uma forma 1x1 deve imprimir 
um único caractere)

Se o problema parecer difícil, lembre-se de dividi-lo em desafios menores, como:
•	Como eu imprimo uma linha individual que seja um número variável com "#" caracteres de comprimento?
•	Como eu crio uma String que comece e termine com "#", mas tenha um número variável de espaços intermediários?
A conclusão de cada desafio menor é uma etapa vencida. Este problema abrange entender o funcionamento dos loops, bem como compreender como dividir um problema maior em tarefas menores.

O conhecimento adquirido nesta seção sobre loops será muito útil para completar este programa. Sinta-se livre para usar o tipo de instruções de loop que considerar mais apropriado. Você também precisará lembrar alguns conceitos sobre seções anteriores. 
 */

public class LoopShape {
    public static void main(String[] args) {

        int larguraRetangulo = 5;
        int alturaRetangulo = 4;

        System.out.println("Retângulo:");
        createRectangle(larguraRetangulo, alturaRetangulo);

        int tamanhoTriangulo = 5;

        System.out.println("\nTriângulo:");
        createTriangle(tamanhoTriangulo);

    }

    public static void createRectangle(int largura, int altura) {
        if (largura < 1 || altura < 1) {
            System.out.println("As dimensões devem ser maiores ou iguais a 1.");
            return;
        }

        for (int loop = 0; loop < altura; loop++) {
            for (int loop2 = 0; loop2 < largura; loop2++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int tamanho) {
        if (tamanho < 1) {
            System.out.println("A dimensão do triângulo deve ser maior ou igual a 1.");
            return;
        }

        for (int loop = 0; loop < tamanho; loop++) {
            for (int loop2 = 0; loop2 <= loop; loop2++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
