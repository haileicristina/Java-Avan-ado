package listaligada;
public class TarefaListaLigada {
    public static void main(String[]args){
        Personagem cachecol = new Personagem();
        //cachecol.ligar();
        //System.out.println("cachecol em movimento " + cachecol.ligada);
        cachecol.desligar();
        //System.out.println("cachecol inativo" + cachecol.ligada);
        
        //ou
        if(cachecol.ligada){
            System.out.println("Cachecol em movimento");            
        }else{
            System.out.println("cachecol inativo");
        }
        
                
        cachecol.mostrarEstado();
        cachecol.mudarEstado();
        cachecol.mostrarEstado();
        
        //Instanciar Objeto luva
        Personagem luva = new Personagem();
        luva.forca = 5;
        luva.intensidade = 100;
        luva.mostrarEstado();
        luva.mudarEstado();
        int soco = luva.calculoForca();
        //System.out.println("A força do soco é de: "+ soco);
        //ou
        System.out.println("A força do soco é de: "+ luva.calculoForca());
        
        Personagem caminha = new Personagem();
        caminha.passos = 5;
        caminha.mostrarEstado();
        caminha.mudarEstado();
        caminha.mostrarEstado();
        
                
    }
    
}
