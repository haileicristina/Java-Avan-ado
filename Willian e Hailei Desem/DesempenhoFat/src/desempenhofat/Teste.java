package desempenhofat;
public class Teste {
     public static void main(String[] args) {
        
         int fatorialRec = Desempenho.fatorialRecursivo(5);
         System.out.println("Recursivo: "+ fatorialRec);
         for (int i = 0; i < 30; i++) {
            System.out.print( Desempenho.fatorialRecursivo(i) + "\t");
        }
         
         int fatorialIt = Desempenho.fatorialIterativo(5);
         System.out.println("\n Fatorial Iterativo de "+ fatorialIt);
         // teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i < 30; i++) {
            System.out.print( Desempenho.fatorialIterativo(i) + "\t");
        }
  
        
        
    }
    
}
