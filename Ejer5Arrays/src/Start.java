import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crea un array dinamico que contega el nombre de 5 futbolistas.
		 * posteriormente muestra la informacion en la consola*/
		Scanner datos=new Scanner(System.in);
		
		int i=0;
		String nombre;
		//cramos el ArrayList de la clase futbolista y creamos una variable
		ArrayList<Futbolista> nombreFutbolista=new ArrayList<Futbolista>();
		
		//bucle for para indicar el numero de fut que queremos poner
		for(i=0;i<5;i++) {
			System.out.println("Introduce nombre");
			nombre=datos.next();
			Futbolista f1= new Futbolista();
			f1.setNombre(nombre);
			nombreFutbolista.add(f1);
		}
		//creamos iterator xa imprimir tal y como esta aprenderselo a fuego
		Iterator<Futbolista>it=nombreFutbolista.iterator();
		while(it.hasNext()) {
			Futbolista fut=(Futbolista) it.next();
			System.out.println(fut.getNombre());
		}
		
		/* otra manera
		 * 
		 * int=0;
		 * ArrayList<Futbolista> nombreFutbolista=new ArrayList<Futbolista>();
		 * 
		 * nombreFutbolista.add("Pedro");
		 * nombreFutbolista.add("Lucas");
		 * nombreFutbolista.add("Alberto");
		 * nombreFutbolista.add("Dani");
		 * nombreFutbolista.add("Miriam");
		 * 
		 * for(i=0;i<5;i++){
		 * System.out.println(nombreFutbolista.get(i));
		 * }
		 */
	}

}
