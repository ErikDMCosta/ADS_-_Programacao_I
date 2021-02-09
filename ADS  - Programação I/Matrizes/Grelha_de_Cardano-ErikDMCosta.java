package Grelha_de_Cardano;

import java.io.IOException;
/**
 *
 * @author erikdmcosta
 */
public class New_Grelha_de_Cardano_Neon {

         public static void main(String[] args) throws IOException {
                  System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ATIVIDADE SEMI-FINAL =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                  
                  System.out.println((char)27 + "[37m            A Grelha de Cardano consiste numa folha de material rígido na qual\n"
                          + (char)27 + "[37m            existem aberturas retangulares de comprimento variável, colocadas\n"
                          + (char)27 + "[37m            em intervalos irregulares. O remetente coloca esta matriz sobre a\n"
                          + (char)27 + "[37m            folha de papel e escreve a mensagem secreta nas aberturas. Depois\n"
                          + (char)27 + "[37m            retira a grelha e preenche os espaços vazios com letras quaisquer.\n"
                          + (char)27 + "[37m            O destinatário simplesmente coloca uma grelha igual sobre o texto\n"
                          + (char)27 + "[37m            recebido para fazer aparecer a mensagem recebida. \n");
                  
                   System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
                   System.out.println("\n" + (char)27 + "[31m                                     ATIVIDADE ABAIXO!");
                   // matriz [linha] [coluna]
                   String mensagem[][] = new String[15][15];
                   
                   mensagem[0][5] = (char)27 + "[34mS" + (char)27 + "[36m";
                   mensagem[0][9] = (char)27 + "[34mE" + (char)27 + "[36m";
                   mensagem[0][14] = (char)27 + "[34mI" + (char)27 + "[36m";
                   
                   mensagem[1][3] = (char)27 + "[34mQ" + (char)27 + "[36m";
                   mensagem[2][9] = (char)27 + "[34mU" + (char)27 + "[36m";
                   mensagem[3][7] = (char)27 + "[34mE" + (char)27 + "[36m";
                   
                   mensagem[3][9] = (char)27 + "[34mN" + (char)27 + "[36m";
                   mensagem[4][5] = (char)27 + "[34mA" + (char)27 + "[36m";
                   mensagem[5][7] = (char)27 + "[34mD" + (char)27 + "[36m";
                   mensagem[5][13] = (char)27 + "[34mA" + (char)27 + "[36m";
                   
                   mensagem[6][8] = (char)27 + "[34mS" + (char)27 + "[36m";
                   mensagem[7][11] = (char)27 + "[34mE" + (char)27 + "[36m";
                   mensagem[8][3] = (char)27 + "[34mI" + (char)27 + "[36m";               
                  
                  boolean grelha[][] = new boolean[mensagem.length][mensagem[0].length];

                  String alfabeto[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
                  
//--------==ORGANIZA==--------
                  

                  for (int linha = 0; linha < mensagem.length; linha++) {
                            for (int coluna = 0; coluna < mensagem[0].length; coluna++) {
                                     if(!(mensagem[linha][coluna] == null)) {
                                              grelha[linha][coluna] = true;
                                     } else {
                                              grelha[linha][coluna] = false;
                                     }
                                     
                            }
                            
                  }
//--------=========--------
                   
//--------==ORGANIZA==--------
                  
                  for (int line = 0; line < mensagem.length; line++) {
                            for (int column = 0; column < mensagem[0].length; column++) {
                                     int aleatorio =(int) (Math.random() * 4) +1;
                                     int randomico = 1 * aleatorio;
                                     if (randomico <= 26) {
                                                if (grelha [line][column] == false) {
                                                         mensagem[line][column] = (char)27 + "[36m"+ alfabeto[randomico];
                                               }
                                     } else {
                                              randomico = 1;
                                     }
                                     randomico = 1;
                           }
                  }
//--------=========--------
                  
//--------==MOSTRA==--------
                  
                   System.out.println("\n"+(char)27 + "[33mMostrando a mensagem enviada:\n" + (char)27 + "[36m");
                   for (int line = 0; line < 15; line++) {
                            for (int column = 0; column < 15; column++) {
                            System.out.print(mensagem[line][column] + " ");
                            }
                            System.out.print("\n");
                   }
                   System.out.print("\n");
//--------=========--------  
                   
//--------==MOSTRA==--------                  
                   
                   System.out.println("\n"+(char)27 + "[33mMostrando a grelha:\n");
                   for (int line = 0; line < 15; line++) {
                            for (int column = 0; column < 15; column++) {
                                     if (grelha [line][column] == true) {
                                              System.out.print((char)27 + "[34m"+ grelha[line][column] + "  ");
                                     } else {
                                              System.out.print((char)27 + "[36m"+ grelha[line][column] + " ");
                                     }
                            }
                            System.out.print("\n\n");
                   }
//--------=========--------
                   
//--------==MOSTRA==--------

                   System.out.println("\n"+(char)27 + "[33mMostrando a palavra/frase:\n");
                   for (int line = 0; line < 15; line++) {
                            for (int column = 0; column < 15; column++) {
                                     if (grelha [line][column] == true) {
                                               System.out.print(mensagem[line][column]);
                                     }
                            }
                   }
                   System.out.print("\n\n");

         }   
}
