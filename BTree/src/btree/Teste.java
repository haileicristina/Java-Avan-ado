package btree;

public class Teste {
    public static void main(String [] args){
        BTree arvore = new BTree();
        arvore.inserir(5);
        arvore.inserir(25);
        arvore.inserir(18);
        arvore.inOrder(null);
        
        arvore.inOrderIni();
    }
    
}
