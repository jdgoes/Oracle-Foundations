/* Desenvolva um programa Java para validar um PIN bancário de um cliente. Use um loop while para repetir o código até que um PIN válido seja inserido. 
 
 1. Declare um PIN inteiro válido.
 2. Solicite que o usuário insira o PIN.
 3. Em um loop while, execute as seguintes etapas:
	Compare o PIN inserido pelo usuário com o PIN já declarado. 
	Se o PIN inserido não for o mesmo, solicite que o usuário insira o PIN novamente.
	Repita o loop até que o PIN correto seja inserido.

4. Imprima uma mensagem confirmando que o PIN correto foi inserido e que agora o usuário tem 
acesso à conta.*/

import java.util.Scanner;

public class ValidatePin{

    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);

            System.out.println("Insira o PIN cadastrado: ");
            int senhaPin = input.nextInt();
    
            while( senhaPin != 2023){
                System.out.println("PIN inválido. Tente novamente");
                senhaPin = input.nextInt();
            }
            System.out.println("PIN Válido, acesso permitido.");
    
            input.close();
        
    }

}