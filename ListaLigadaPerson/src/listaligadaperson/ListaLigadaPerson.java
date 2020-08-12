
package listaligadaperson;

public class ListaLigadaPerson {
    //aributos
    public ListaLigadaPerson proximo;
    public String dado;
    public ListaLigadaPerson inicio;
    public ListaLigadaPerson fim;
    public String removido;
    public boolean mario;
    
    public ListaLigadaPerson(){//sobrecarga
        
    }
   
    
    
    
    public ListaLigadaPerson(String dado){
        this.proximo = null;
        this.dado = dado;
        this.inicio = null;
        this.fim = null;
    }
    public boolean vazia(){
        return inicio == null && fim == null;
        
    }
    //Método para adicionar item na lista
    public void inserir(String dado){
        ListaLigadaPerson novo = new ListaLigadaPerson(dado);
        if(vazia()){
            inicio = novo;
            
        }else{
            novo.proximo = inicio;
            fim.proximo = novo;
            fim = novo;
        }
    }
    //Metodo de remoção de itens da lista
    void remover(){
        
        if(vazia()){
            
            System.out.println("Lista Vazia");
        }else if(inicio==fim){
            
            removido = inicio.dado;
            inicio = null;
            fim = inicio.proximo;
        }else{
            removido = inicio.dado;
            fim = inicio;
            inicio = inicio.proximo;
            fim.proximo = inicio;
        }
        
    }
    void mostrarEstado(){
        if(mario){
            mario = true;
            System.out.println("Sabor: Chocolate");
            
            
        } else{
            mario = false;
            System.out.println("Outro sabor");
        }
    }
}   
    

    
    
    

