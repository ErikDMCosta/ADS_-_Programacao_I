package array_exercicio_2;

import java.util.Scanner;

/**
 *
 * @author erikdmcosta
 */
public class array_exercicio_2 {
    
        public static void main(String[] args) {
                System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ATIVIDADE 2 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                /*
                Escreva uma classe Java para receber 10 números inteiros e armazená-los,
                em um vetor. Ao final, deve-se mostrar a soma dos números digitados.
                */
                System.out.println("\n" + (char)27 + "[31m                                 ATIVIDADE ABAIXO!");
                int vetor[] = new int[10];
                Scanner teclado = new Scanner(System.in);
                int soma = 0;
                for (int count = 0; count <=9; count++) {
                        System.out.print((char)27 + "[36mEscreva "+ (count+1) +"º número: ");
                        int number = teclado.nextInt();
                        vetor[count] = number;
                        soma += number;
                } System.out.print(("\n"+(char)27+ "[33m<= ") + (char)27 + "[37mA SOMA É IGUAL A " + soma  + (char)27 + "[37m NO TOTAL." + (char)27+ "[33m =>");
                System.out.println("\n"+(char)27 + "[31m<| " +(char)27 + "[32mFIM DO PROGRAMA" + (char)27 + "[31m |>");
        }
    
}
