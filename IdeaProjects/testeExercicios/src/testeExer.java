import java.util.Random;

public class testeExer {
    public static void main(String[] args) {
        Random rand = new Random();
       int[] vetor = new int[6];
       int aux;
       boolean valido;
       for(int i =0;i<vetor.length;i++){
           vetor[i] = rand.nextInt(11);
       }
        for(int i =0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
        for(int i =0;i<vetor.length;i++){
            valido=true;
            for(int j =0;j<vetor.length-1;j++){
               if(vetor[j] > vetor[j+1]){
                   aux=vetor[j];
                   vetor[j] = vetor[j+1];
                   vetor[j+1]=aux;
                   valido =false;
               }
            }
            if(valido){
                break;
            }
        }
        System.out.println();
        System.out.println("Ordem e Progresso");
        for(int i =0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
