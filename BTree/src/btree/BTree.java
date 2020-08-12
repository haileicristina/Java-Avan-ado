package btree;
//Encaminhamento em Ávore Binária
public class BTree {
//atributos
    private No raiz;
    
    //Construtor
    public BTree(){
        raiz = null; //arvore vazia
    }
    //metodo
    public void inserir(int valor){
        //1) Instanciar novo o
        No temp = new No(); //Nasceu!!!
        temp.cod = valor;
        temp.esq = null;
        temp.dir =null;
        //2) Arvore vazia? Sim, raiz = novo Nó e sair
        if(raiz==null){
            raiz =temp;
            System.out.println("raiz:" + valor);
            return; //sair
        }
        //3) Caminhar em inserir
        No t = raiz; //'t' aponta para raiz
        while(true){
            if(valor == t.cod){
                System.out.println("valor existe"+ valor);
                return; //sair
            }
            if(valor < t.cod){
                //Esquerda
                if(t.esq == null){
                    t.esq = temp; // inseri esq
                    System.out.println("Esq: "+ valor);
                    return;
                }
                t = t.esq; // anda a esquerda
                
            }else{
                //Direita
                if(t.dir == null){
                    t.dir = temp;
                    System.out.println("Dir: "+ valor);
                    return;
                }
                t = t.dir; // anda a direita
            }
        }
        
    }
    public void inOrderIni(){
            inOrder(raiz);
        }
        public void inOrder(No t){ //encaminhamento
            if(t==null)
                return;
            inOrder(t.esq);// recursiva
            System.out.println(t.cod +" ");
            inOrder(t.dir); //recursiva
        }
        //pre order imrime antes
        //pos order imprime depois
    
    
}
