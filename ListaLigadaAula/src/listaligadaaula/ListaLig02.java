package listaligadaaula;


public class ListaLig02 {
    //Atributos
    private No ini; 
// importante!!
    
    // Construtores
    public ListaLig02(){
        ini=  null; // lista vazia
    } 
    //Metodo
    public class No {
    //Atributos
    public String cod;
    public No prox; // importante
    public String ch;
    public void inserir(String valor){
        //1) Criar novo Nó
        No temp = new No(); //Instanciar Nó
        temp.cod = valor;
        temp.prox = null; // Importante!!
        //2) Verificar se é cabeça(primeiro), se sim, sair
        if(ini==null){
            ini = temp;//novo Nó é cabeça (primeiro)
            return;//sair
        }
        //3) Percorrer a Lista e inserir ao final
        No p = ini; //"p" aponta cabeça
        while(p.prox != null){
            p = p.prox; // "p" anda para o proximo Nó
            
        }
        //4) Conectar ultimo Nó da Lista ao Novo Nó
        p.prox = temp;
    }
    /*
    Remover
    0) Lista não existe
    1) Não encontrou
    2) caso Nó procurado é a cabeça primeiro vai na cabeça
    3) encontra o Nó não é a cabeça
    */
    void remover(){
        //1) Lista vazia => sair
        
        if(ini == null){
            System.out.println("Lista Vazia");
            return; // Sair
        }
        //2) É a cabeça
        
        if(ini.cod == ch){
            ini = ini.prox; // "ini" anda p/ proximo
            System.out.println("Cabeça: "+ ch);
            return; // Sair
        }
        //3) Percorrer na Lista
        No p2, p1;
        p2 = ini; // aponta para a cabeça
        p1 = ini.prox; // p1 aponta para proximo
        //percorrer
        while(p1 != null && p1.cod != ch){
            p2 = p1; // "p2" anda até "p1"
            p1 = p1.prox; // "p1" avança para o proximo
        }
        //4) Nó Não existe
        if(p1 == null){
            System.out.println("Não achou: "+ ch);
            return; // Sair
        }
        //5)achou e remove
        p2.prox = p1.prox;
        System.out.println("Removido: " + ch);
            
    }
    
    
    
}
// 1) Inserir Nó
//2) remover Nó
//3) Mostrar 
//4) Remover
//5) sair
