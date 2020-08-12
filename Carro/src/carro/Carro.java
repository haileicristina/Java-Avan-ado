package carro;
import java.util.Scanner;
public class Carro {
    //atributos
String marca;
String modelo;
String cor;
double consumoCombustivel;
double quantCombustivel;
int qtdias;
int calendario[] = new int[5];

// Metodos
void mostrarAutonomia(){
    System.out.println("Autonomia: "+ consumoCombustivel * quantCombustivel+ "km");
    
}

void dias(){
    Scanner data = new Scanner(System.in);
    System.out.println("Digite quantos dias:");
    qtdias = data.nextInt();
    for(int i = 0; i<calendario.length; i++){
        calendario [i] = qtdias * (i+1);
    }
    System.out.print("Calendário = ");
    for(int i = 0; i<calendario.length; i++){
        System.out.println(calendario[i]+" ");
       
    }
}


    public static void main(String[] args) {
        Carro bmw = new Carro();
        bmw.modelo = "conversível";
        bmw.marca = "bmw";
        bmw.cor = "scarleth";
        bmw.consumoCombustivel = 0.2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de km gastos: ");
        bmw.quantCombustivel = scan.nextInt();
        System.out.println("marca: "+ bmw.marca+ "\t modelo: "+bmw.modelo);
        bmw.mostrarAutonomia();
        
        
        
    }
    
}
