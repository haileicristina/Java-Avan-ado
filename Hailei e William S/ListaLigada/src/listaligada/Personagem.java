/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaligada;

/**
 *
 * @author Hailei
 */
public class Personagem {
    //atributos
    int intensidade;
    int forca;
    int passos;
    String esquiva;
    String [] tiposPoder;
    boolean tipoCachecol;
    boolean ligada;
    boolean tipoLuva;

    //método
    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    //metodo para organização de código
    void mostrarEstado(){
        if(ligada){
            System.out.println("Objeto em ação");
        }else{
            System.out.println("Mudança de Estado Objeto inativo");
        }
    }
    void mudarEstado(){
        if(ligada){
            desligar();
        }else{
            ligar();
        }
    }
    int calculoForca(){
        return forca*intensidade;
    }
        
}
