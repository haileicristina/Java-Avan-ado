package br.com.caelum.ed;

import alunos.Alunos;

public class Aluno {
     private String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String toString(){ // metodo para mostrar o nome
        return this.nome;
    }
    //fazer comparação de um objetos tipo Alunos pelo critério de nome
    public boolean equals(Object o){
        //instanciando outro objeto
        Aluno outro = (Aluno)o;
        return this.nome.equals(outro.nome);
    }
    
}
