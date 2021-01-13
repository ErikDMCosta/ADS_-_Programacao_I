package array_exercicio_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erikdmcosta
 */
public class array_exercicio_4 {
    
        public static void main(String[] args) throws IOException {
                System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ATIVIDADE 4 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                /*
                Escreva classe Java que leia o nome de uma pessoa. A seguir, deve-se criar um vetor com o mesmo
                tamanho da palavra digitada e armazenar cada caractere em uma posição do vetor. Por exemplo, se
                eu digitar o meu nome (“ERIK”), deve-se criar um vetor com seis posições.\n"
                */
                System.out.println("\n" + (char)27 + "[31m                                 ATIVIDADE ABAIXO!");
                BufferedReader teclado =new BufferedReader(new InputStreamReader(System.in));
                System.out.print((char)27 + "[36mEscreva seu nome: "); 
                String name = teclado.readLine();
                name = name.toUpperCase();
                String[] vetor = new String[name.length()];
                int count = 0;
                while (count < name.length()) {    // while só pra deixar diferente usando o método length em condição
                        String letra = String.valueOf(name.charAt(count));
                        vetor[count] = letra;
                        System.out.print((char)27 + "[37m<= " + (char)27 + "[33m" + vetor[count]  + (char)27 + "[37m => ");
                        count++;
                } System.out.println("\n"+(char)27 + "[31m<| " +(char)27 + "[32mFIM DO PROGRAMA" + (char)27 + "[31m |>");
        }
}
