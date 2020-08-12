package basqueterobo;
import java.util.Scanner;

public class D {
    int tabela = 3;
    int jogar;
    int joga;
    int soma;
    public int InserirJogada(int jogada){
        for(int i = 0; i<tabela; i++){
            System.out.println("Digite a jogada: ");
            Scanner input = new Scanner(System.in);
            jogada = input.nextInt();
            System.out.println("Jogada digitada é: "+ i +" " + jogada);
            soma = jogada + jogada;
            System.out.println("somar: "+ soma);
            
        }
               
        return jogada;
        
    }
    public void somarJogada(){
        jogar = joga + joga;
        System.out.println("Soma de jogada: "+ jogar);
    }
    
    public static void main(String[] args) {
        int D;int ponto = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a distância do robô em cm: ");
        D = scan.nextInt();
        if(D <= 800){
            ponto = 1;
        }else if(D > 800 && D <= 1400){
            ponto = 2;
        }else if(D > 1400 && D<= 2000){
            ponto = 3;
        }
        System.out.println("Entrada: "+ D + " Saída: " + ponto);
        D distancia = new D();
        distancia.InserirJogada(5);
        distancia.somarJogada();
       
    }
    
}
