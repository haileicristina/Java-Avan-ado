package filacircular;

public class FilaCircular {
    //aributos
    public FilaCircular proximo;
    public int dado;
    public FilaCircular inicio;
    public FilaCircular fim;
    
    public FilaCircular(){//sobrecarga
        
    }
   
    
    
    
    public FilaCircular(int dado){
        this.proximo = null;
        this.dado = dado;
        this.inicio = null;
        this.fim = null;
    }
    public boolean vazia(){
        return inicio == null && fim == null;
    }
    //Método para adicionar item na lista
    public void adicionarFila(int dado){
        FilaCircular novo = new FilaCircular(dado);
        if(vazia()){
            inicio = novo;
            fim = novo;
            fim.proximo = inicio;
        }else{
            novo.proximo = inicio;
            fim.proximo = novo;
            fim = novo;
        }
    }
    //Metodo de remoção de itens da lista
    public int removerFila(){
        int removido;
        if(vazia()){
            removido = -1;
        }else if(inicio==fim){
            removido = inicio.dado;
            inicio = null;
            fim = null;
        }else{
            removido = inicio.dado;
            fim = inicio;
            inicio = inicio.proximo;
            fim.proximo = inicio;
        }
        return removido;
    }
    
    
}
    
    
    

