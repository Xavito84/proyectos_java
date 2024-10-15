import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Declaracion de un array unidimensional dinamico:
		 * ArrayList<Float> notasD= newArrayList<Float>();
		 * 
		 * Añadir o agregar un elemento al array:
		 * notasD.add(6.8f);
		 * 
		 * Obtener un elemento mediante su posicion:
		 * notasD.get(n)--> donde n vale de 0 a notasD.size()-1.
		 * 
		 * Modificar un elemento de un array dinamico es:
		 * notasD.set(n,7.0f;---> donde n vale de 0 a notasD.size()-1.
		 * 
		 * La longitud de un array dinamico 
		 * notasD.size() 
		 * 
		 * Recorridode un array unidimensional dinamico:
		 * int i=0_;
		 * for(i=0;i<notasD.size();i++){
		 * system.out.println(notasD.get(i));
		 * }
		 * 
		 * for(Float nota:notasD){
		 * System.out.println(nota);
		 * {
		 */
		
		ArrayList<String> nombres= new ArrayList<String>();
		
		System.out.println("Tamaño array dinamico: "+ nombres.size());
		
		//añadir nombre
		
		nombres.add("Ronaldo");
		
		System.out.println("Tamaño array dinamico: "+ nombres.size());
		
		/*borrar nombre
		 * nombres.remove(0);
		 */
		
		System.out.println("el nombre de la posicion 0 es: "+ nombres.get(0));
		
		//para modificar una posicion:
		
		nombres.set(0,"Marco" );
		
		System.out.println("el nombre de la posicion 0 es: "+ nombres.get(0));
		
		
		
		ArrayList<String> nombre= new ArrayList<String>();
		
		Scanner datos=new Scanner(System.in);
		int cantidad=0;
		int i=0;
		String n="";
		
		System.out.print("Introduce la cantidad de alumnos");
		cantidad=datos.nextInt();
		
		for (i=0; i<cantidad;i++) {
			System.out.print("introduce el nombre del alumno "+(i+1)+" : ");
			n=datos.next();
			nombre.add(n);
		}
		for (i=0; i<nombre.size();i++) {
			System.out.println("el nombre del alumno "+(i+1)+" : "+ nombre.get(i));
		}
		
		//otra manera for each
		int cont=0;
		for(String nom: nombre) {
			
			cont++;
			System.out.println("nombre del alumno "+(cont)+" : "+ nom);
		}
		
		
		
		
		
		
		
		

	}

}
