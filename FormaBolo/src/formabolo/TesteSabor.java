package formabolo;
import java.util.Scanner;
public class TesteSabor {
    public static void main(String[]args){
    FormaBolo teste = new FormaBolo();
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o sabor: ");
    String sabor = scan.next();
    if(sabor.equalsIgnoreCase("chocolate")){
      System.out.println("É chocolate "); 
      //teste.chocolate = true;
      teste.saberSabor();
    }else{
        System.out.println("Não é chocolate é: "+ sabor);
       //teste.chocolate = false;
       teste.outroSabor();
    }
   
    
    teste.mostrarSabor();
    
    }
    
    
}
