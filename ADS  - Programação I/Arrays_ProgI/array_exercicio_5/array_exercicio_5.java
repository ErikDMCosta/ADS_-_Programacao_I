package array_exercicio_5;

/**
 *
 * @author erikdmcosta
 */
public class array_exercicio_5 {
    
        @SuppressWarnings("empty-statement")
        public static void main(String[] args) {
                System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ATIVIDADE 5 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                /*
                Escreva uma classe Java que declare o vetor a seguir: String[] vetor = {“C”, “O”, “M”, “P”, “U”, “T”, “A”, “D”, “O”, “R”};
                A classe deve percorrer todas as posições do vetor de forma a armazenar a palavra formada pela união de todas as letras 
                armazenadas no vetor em uma única String."
                */
                System.out.println("\n" + (char)27 + "[31m                                 ATIVIDADE ABAIXO!");
            
                String[] vetor = {"C", "O", "M", "P", "U", "T", "A", "D", "O", "R"};
                int count = 0;
                System.out.print("\n" + (char)27 + "[31m                                 <= ");
                while (count < vetor.length) {
                        System.out.print((char)27 + "[32m" + vetor[count].concat(vetor[count+1]));
                        count++; count++;      
                }      System.out.print((char)27 + "[31m =>\n");
                
                System.out.println("\n"+(char)27 + "[31m                               <| " +(char)27 + "[32mFIM DO PROGRAMA" + (char)27 + "[31m |>");
        }
}
