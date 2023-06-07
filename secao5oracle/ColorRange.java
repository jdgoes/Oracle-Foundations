/*Você deve implementar o seguinte usando uma instrução de decisão if adequada:
1. Solicite que o usuário insira o comprimento de onda; ele deve ser do tipo double.
2. Para cada intervalo (por exemplo, 380 - 450) o número à esquerda é incluído no intervalo, mas o número à direita não é.
3. Se o valor da entrada não for encontrado no espectro visível, informe que o comprimento de onda não está dentro do espectro visível. 
4. Saída Esperada:
a.	Enter a color code
630
The color is Red
b.	Enter a color code
25.0
The entered wavelength is not a part of the visible spectrum
c.	Enter a color code
750.5
The entered wavelength is not a part of the visible spectrum  */
import java.util.Scanner;

public class ColorRange{
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite o valor de comprimento da onda: ");
            int comprimentoDaOnda = input.nextInt();
            
            if(comprimentoDaOnda >= 380 && comprimentoDaOnda <= 450){
                System.out.println("A cor é Violeta");
            }
            else if(comprimentoDaOnda > 450 && comprimentoDaOnda <= 495){
                System.out.println("A cor é Azul");
            }
            else if(comprimentoDaOnda > 495 && comprimentoDaOnda <= 570){
                System.out.println("A cor é Verde");
            }
            else if(comprimentoDaOnda > 570 && comprimentoDaOnda <= 590){
                System.out.println("A cor é Amarela");
            }
            else if(comprimentoDaOnda > 590 && comprimentoDaOnda <= 620){
                System.out.println("A cor é Laranja");
            }
            else if(comprimentoDaOnda > 620 && comprimentoDaOnda <= 750){
                System.out.println("A cor é Vermelha");
            }
            else{
                System.out.println("Entrada de valor incorreta. Tente novamente");
            }

        }  catch (Exception e) {
            System.out.println("O comprimento de onda não está dentro do espectro visível. ");
        }

    }
}