package trabalho.vetores.palindromo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erikdmcosta
 */
public class TrabalhoVetoresPalindromo {

    public static void main(String[] args) throws IOException {
            System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- Trabalho - Vetores =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                /*
                Um palíndromo é uma palavra, frase ou qualquer outra sequência de caracteres que tenha a propriedade de poder
                ser lida tanto da direita para a esquerda como da esquerda para a direita. Por exemplo:

                                                                                            ANILINA

                                                                                            ARARA

                                                                                            SOPAPOS
            
                Num palíndromo, normalmente são desconsiderados os sinais ortográficos, assim como o espaços entre palavras.
                Atividade: Escreva uma classe em java que leia uma palavra ou frase (sem acentos ou outros símbolos gráficos) 
                e armazene em uma variável do tipo String. A seguir, deve-se elimiar os espaços contidos na String (se houver) 
                e criar um vetor de mesmo tamanho da String resultante. É necessário armazenar cada caracter da String em 
                uma posição do vetor. Por fim, deve-se verificar se a palavra armazenada no vetor corresponde a um palíndromo.
                */
                                  
                System.out.println("\n" + (char)27 + "[31m                                  ATIVIDADE ABAIXO!");
                BufferedReader teclado =new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\n" + (char)27 + "[33mDESCUBRA SE SUA FRASE É PALÍNDROMO");
                System.out.print((char)27 + "[36mEscreva uma frase ou palavra: "); 
                String frase = teclado.readLine();
                frase = frase.replaceAll(" ","");
                frase = frase.toUpperCase();
                System.out.println((char)27 + "[36mSua palavra/frase maiúsculas e sem espaços ficou: " + (char)27 + "[33m" + frase);
                String palindromo = "";
                String vetor[] = new String[frase.length()];
                int count = frase.length() -1;
                while (count >= 0){
                        String letra = String.valueOf(frase.charAt(count));
                        vetor[count] = letra;
                        palindromo += frase.charAt(count);
                        count--;
                } System.out.println((char)27 + "[36mA palavra ao contrário ficou " + (char)27 + "[33m" +  palindromo);
                System.out.println("\n"+(char)27 + "[34mNo vetor ficou: ");
                for (count = 0; count < vetor.length; count++){
                        System.out.println((char)27 + "[35m"+ count+"º " + (char)27 + "[36mposição guardou " + (char)27 + "[35m" + vetor[count]);
                }
                if(frase.equals(palindromo)) {
                        System.out.println((char)27 + "[32mA frase ou palavra é um palíndromo!");
                } else {
                        System.out.println((char)27 + "[31mA frase ou palavra não é um palíndromo!");
                }System.out.println("\n"+(char)27 + "[31m<| " +(char)27 + "[32mFIM DO PROGRAMA" + (char)27 + "[31m |>");
        }
}
