package formabolo;
public class FormaBolo {
    //atributos
    int pesoBolo;
    String sabor;
    boolean chocolate;
    String cor;
    String formato;
    
    // método para definição do sabor
    void saberSabor(){
        chocolate = true;
    }
    void outroSabor(){
        chocolate = false;
    }
    // metodo para saber qual éo sabor
    void mostrarSabor(){
        if(chocolate){
            chocolate = true;
            System.out.println("Sabor: Chocolate");
            
            
        } else{
            chocolate = false;
            System.out.println("Outro sabor");
            
        }
       
    }

        
}
