package alunos;
public class Alunos {
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
        Alunos outro = (Alunos)o;
        return this.nome.equals(outro.nome);
    }

    public static void main(String[] args) {
        
    }
    
}
