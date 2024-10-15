import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Crear un programa que cree dos variables de tipo String llamadas numero1S y numero 2S.
		 * Despues las tenemos que convertir a float para poder sumarlas.
		 * Tras convertirlas las sumamos y mostramos el resultado en la consola.
		 * En caso de que el usuario no introduzca un valor numerico se mostrara un mensaje en la consola "Error valor no numerico" y el programa finalizara.
		 */

		Scanner datos=new Scanner (System.in);
		
		String numero1S;
		String numero2S;
		float num1;
		float num2;
		float resultado;
	
			System.out.print("Introduce numero a sumar: ");
			numero1S=datos.next();
			System.out.print("Introduce numero a sumar: ");
			numero2S=datos.next();
			// en este caso se pone en el casting
			try {
			num1=Float.parseFloat(numero1S);
			num2=Float.parseFloat(numero2S);
			
			resultado=num1+num2;
			
			System.out.println("La suma es: "+ resultado);
			}catch (Exception e){
	
			System.out.println("Error valor no numerico");
		
			}
	
		
		
		
		
		
		
		
	}

}
