package bubblesort;
import javax.swing.JOptionPane;

public class OrdenarPersonagem {
    //atributos
    private int vetor[]={10,300,50,20};
    private String avatar[]={"Mario",  "Luigi", "Sonic", "PacMan"};
    //Metodos
    public void bubbleS(){
        int aux = 0;
        for(int fim = vetor.length-1; fim>=1; fim--){
            for(int i=1; i<=fim; i++){
                if(vetor[i-1]>vetor[i]){
                    aux= vetor[i];
                    vetor[i] = vetor[i-1];
                    vetor[i-1]= aux;
                }
            }
        }
        
    }
    public void SelectS(){
        int posMaior = 0,aux=0;
        for(int fim = vetor.length-1; fim>=1; fim--){
            posMaior = 0;
            for(int i=1; i<=fim; i++){
                if(vetor[i]>vetor[posMaior]){
                    posMaior = i;
                }
            }
            //troca
            aux = vetor[fim];
            vetor[fim]= vetor[posMaior];
            vetor[posMaior]= aux;
        }
    }
    public void mostrar(){
        String lin ="";
        for(int i =0;i<vetor.length;i++){
            lin = lin+vetor[i]+"";
        }
        JOptionPane.showMessageDialog(null,lin);
        JOptionPane.showMessageDialog(null,avatar);
    }
}
    