package filacircular;
import java.util.Scanner;

public class TesteFila {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String output = " ";
        int terminou = 0;
        int select;
        FilaCircular fila = new FilaCircular();
        while(terminou==0){
            output = "Digite: "
                    + "1 para Adicionar item " +
                    "2 para Remover item" +
                    " 3 Mostrar item"+
                    "4 para Sair";
            select = scan.nextInt();
            switch(select){
                case 1:
                {
                    output = "---------Adiciona Itens ---------";
                    output = "Digite um número. Insira um elemento na fila";
                    int ad = scan.nextInt();
                    fila.adicionarFila(ad);
                    break;
                }
                case 2:{
                    output = "---------Remove Itens ---------";
                    fila.removerFila();
                    break;
                }
                case 3:
                {
                    output = "---------Mostra Itens ---------";
                    output = "Itens cadastrados"+ fila;
                    break;
                }
                case 4:{
                    output = "---------Saiu ---------";
                    terminou = 1;
                    output = "Você saiu da sala. Volte sempre!";
                    break;
                }
                default:
                {
                    fila.vazia();
                    output = fila + "Não foi possível encontrar valores "
                            + "cadastrados";
                }
                    
            }
        }
        
        
        
    }
    
}
