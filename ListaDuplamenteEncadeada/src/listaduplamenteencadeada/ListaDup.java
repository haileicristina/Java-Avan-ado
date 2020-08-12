package listaduplamenteencadeada;

public class ListaDup {
    //Atributos
   private No esq;
   private No dir;
    //Construtores
   public ListaDup(){
       esq = null; // Lista Vazia
       dir = null; // Lista vazia
   }
    //Metodos
   //Método para inserir lado direito
   public void inserirDir(int valor){
       //1) Instaniar Novo Nó
       No temp = new No();
       temp.cod = valor;
       temp.prox = null;
       temp.ant = null;
       
       //2) Perguntar se Lista vazia se sim esq e dir apontam Novo No e sair
       if(esq == null){
           //Código da Lista vazia!!!
           esq = temp; // temp é o Nó
           dir = temp;
           System.out.println("Inserir: "+ valor);
           return; // sair
       }
      // 3) Não vazia? Concetar lado direito ao Novo Nó
       dir.prox = temp;
       temp.ant = dir;
       dir = temp;
       System.out.println("Inserir à direita: "+ valor);
      
   }
   //Método para inserir lado esquerdo
   public void inserirEsq(int valor){
       //1) Instaniar Novo Nó
       No temp = new No();
       temp.cod = valor;
       temp.prox = null;
       temp.ant = null;
       
       //2) Perguntar se Lista vazia se sim dir  e esq apontam Novo No e sair
       if(esq == null){
           //Código da Lista vazia!!!
           esq = temp; // temp é o Nó
           dir = temp;
           System.out.println("Inserir: "+ valor);
           return; // sair
       }
      // 3) Inserir o lado esquerdo
       esq.ant = temp; // temp é o Nó
       temp.prox = esq;
       esq = temp;
       System.out.println("Inserir à esquerda: "+ valor);
   }
   //Mostrar da Esquerda para a direita
   public void mostraEsqDir(){
       String lin = "lista: ";
       No p = esq;
       while(p != null){
           lin = p.cod +"-)";
           p = p.prox; // anda para a direita
        }
       System.out.println("lin"+ lin);
    
   }
   public void mostraDirEsq(){
       // Mostrar da direita para a esquerda
       String lin = "lista: ";
       No p = dir;
       while(p != null){
           lin = p.cod +"-)";
           p = p.ant; // anda para a esquerda
        }
       System.out.println("lin"+ lin);
   }
   
    
}
