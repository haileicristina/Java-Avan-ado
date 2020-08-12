package listaex;
import java.util.Scanner;
public class ItemLista {
    private No inicio, fim;
    public String element;
    public String removido;
    public void Inserir(){
        String obj;
        //Criar Nó
        No novo = new No();
        //novo.getvalor();
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um elemento:");
        element = scan.next();
        element = novo.getvalor();
       
        //Verificar se é o primeiro objeto
        if(inicio == null){
            inicio = novo;
        }else{
            fim = novo.getProximo();
        }
        fim = novo;
       
        
    }
    public boolean vazia(){
        return inicio == null && fim == null;
        
    }
    //Método para adicionar item na lista
    public void inserir(String element){
        No novo = new No();
        if(vazia()){
            inicio = novo;
            
        }else{
            inicio = novo.getProximo();
            novo = fim.getProximo();
            fim = novo;
        }
    }
    //Metodo de remoção de itens da lista
    public void remover(){
        
        if(vazia()){
            
            System.out.println("Lista Vazia");
        }else if(inicio==fim){
            
            removido = inicio.getvalor();
            inicio = null;
            fim = inicio.getProximo();
        }else{
            removido = inicio.getvalor();
            fim = inicio;
            inicio = inicio.getProximo();
            inicio = fim.getProximo();
        }
        
    }
    public String mostrar(){
        System.out.println("Mostrar "+ element);
        return element;
    }
    
    
   
    
}
