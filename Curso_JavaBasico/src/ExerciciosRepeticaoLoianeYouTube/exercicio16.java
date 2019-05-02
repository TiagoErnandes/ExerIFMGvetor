package ExerciciosRepeticaoLoianeYouTube;

public class exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1 = 0;
       int n2 =1;
       int aux =0;
       
       for(int i = 0; n1<=700;i++) {
    	   System.out.println(n1);
    	   n1=n1+n2;
    	   aux=n1;
    	   n1=n2;
    	   n2=aux;	   
       }
	}

}
