package array_exercicio_1;

import java.util.Scanner;

/**
 *
 * @author erikdmcosta
 */
public class array_exercicio_1 {
    
        public static void main(String[] args) {
                System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ATIVIDADE 1 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                /*
                Escreva uma classe Java  para ler um conjunto de 10 valores inteiros, armazená-los 
                em um vetor e em seguida exibi-los na ordem inversa da que foram digitados.
                */
                System.out.println("\n" + (char)27 + "[31m                                 ATIVIDADE ABAIXO!");
                int vetor[] = new int[10];
                Scanner teclado = new Scanner(System.in);
                for (int count = 0; count <=9; count++) {
                        System.out.print((char)27 + "[36mEscreva "+ (count+1) +"º número: ");
                        int number = teclado.nextInt();
                        vetor[count] = number;
                } int count = 9;
                while (count >=0) {         // Usei while só pra ficar diferente!
                         System.out.print(((char)27+ "[33m < ") + (char)27 + "[35m" + vetor[count] + (char)27+ "[33m > ");
                         count--;
                } System.out.println("\n"+(char)27 + "[31m<| " +(char)27 + "[32mFIM DO PROGRAMA" + (char)27 + "[31m |>");
        }
}
