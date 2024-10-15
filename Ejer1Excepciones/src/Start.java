import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crear un programa que pida al usuario, si el usuario
		 * introduce un numero positivo mostrara en consola "Numero positivo"
		 * en caso contrario mostrara "Numero negativo"
		 * en caso de que no introduzca un valor numerico mostrar en consola "formato del valor erroneo".
		 */

		Scanner datos = new Scanner(System.in);

		int num = 0;
		try {
			System.out.println("Introduce numero: ");
			num = datos.nextInt();

			if (num >= 0) {
				System.out.println("Numero positivo");
			} else {
				System.out.println("Numero negativo");
			}
		} catch (Exception e) {
			System.out.println("Formato erroneo");
		}
	}

}
