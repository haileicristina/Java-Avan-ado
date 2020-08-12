package desempenhofat;

public class Desempenho {
    public static int fatorialRecursivo(int num){
            if(num ==0){
                return 1;// ponto de parada
                
            }
            //System.out.print(num* fatorial(num-1));
            return num * fatorialRecursivo(num-1); // chama o mmso método
            
        
    }
    
    static int fatorialIterativo(int n) {
        int in = 0;     // atual
        int fim = 0;   // anterior
  
        for (int i = 1; i <= n; i++) {
  
            if (i == 1) {
                in = 1;
                fim = 0;
            } else {
                in += fim;
                fim = in - fim;
            }
  
        }
  
        return in;
    }
      
}
