import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Crear un Array de 5 posiciones de tipo String.
		 * Pide al usuario 5 nomnres e introduce en cada una de las posiciones del array.
		 * muestra info*/
		
		Scanner datos=new Scanner(System.in);
		
		String[] nombres=new String[5];
		int i;
		
		for(i=0; i<nombres.length; i++) {
			System.out.println("Introduce el nombre: "+(i+1));
			nombres[i]=datos.next();
			
			
		}
		System.out.println("");
		for(i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		 
	}

}
