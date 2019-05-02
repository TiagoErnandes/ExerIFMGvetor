import java.util.Scanner;

public class va1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numero = 0;
        int var =27;
        
         for(int i= 1;;i++){
         System.out.println("Digite o numero :");
         numero = scan.nextInt();
         if (numero > var){
             System.out.println("O numero não pode ser maior que (var)");
             continue;
         }
         
         if (numero == 0){
             continue;
         }else if(numero == -1){
             break;
         }
             
             if (numero % 2 ==0){
                 System.out.println("Numero Par");
                 break;
             }else{
                 System.out.println("Numero Impar");
                 break;     
         }
  
       }
     }  
 }



