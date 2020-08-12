package estudocaso;
import java.util.Scanner;

public class EstudoCaso {
    //Atributos
    public int avatar;
    public int prox;
    //Métodos
    public void inserir(){
        boolean dado = true;
        int teste = 0;
        while(dado){
            Scanner scan = new Scanner(System.in);
            System.out.println("Inserir um número: ");
            avatar = scan.nextInt();
            dado = false;
            teste = 1;
        }
        
        
        
        
    }
    public void mostrar(){
        System.out.println("Mostra número: "+ avatar);
    }
    public static void main(String[] args) {
        EstudoCaso novo = new EstudoCaso();
        novo.inserir();
        novo.mostrar();
    }
    
}
