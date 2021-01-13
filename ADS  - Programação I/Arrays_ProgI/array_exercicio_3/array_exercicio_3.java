package array_exercicio_3;

import java.util.Scanner;

/**
 *
 * @author erikdmcosta
 */
public class array_exercicio_3 {
    
        public static void main(String[] args) {
                System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ATIVIDADE 3 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                /*
                Escreva classe Java que leia e mostre um vetor de 10 elementos inteiros. A seguir, conte quantos valores pares existem no vetor.
                */
                System.out.println("\n" + (char)27 + "[31m                                 ATIVIDADE ABAIXO!");
                int vetor[] = new int[10];
                Scanner teclado = new Scanner(System.in);
                int pares = 0;
                int count = 0;
                while (count <=9) {
                        System.out.print((char)27 + "[36mEscreva "+ (count+1) +"º número: ");
                        int number = teclado.nextInt();
                        vetor[count] = number;
                        if (number % 2 == 0) {
                                pares++;
                        }
                        count++;
                } System.out.print(("\n"+(char)27+ "[35m<= ") + (char)27 + "[33mO NÚMERO FOI DE " + pares + (char)27 + "[33m PAR/PARES." + (char)27+ "[35m =>");
                System.out.println("\n"+(char)27 + "[31m<| " +(char)27 + "[32mFIM DO PROGRAMA" + (char)27 + "[31m |>");
        }
}
