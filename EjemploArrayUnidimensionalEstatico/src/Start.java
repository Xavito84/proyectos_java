import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//manera 1
		float[]notasE1=new float[10];
		
		//manera2
		float[]notasE2= {5f,6f,7f,8f};
		
		
		//para ,odifiar el valor 2
		
		notasE1[2]=4.5f;
		/* el tamaño de un array se ontiene mediante: notasE1.length
		 * donde la posicion maxima permitida es notasE1.length-1
		 */
		
		//Para recorrer los elementos de un array estatico :
		
		int i=0;
		for(i=0;i<notasE1.length;i++) {
			System.out.println(notasE1[i]);
		}
	
		//Array de String
		
		String[] nombres=new String[4];
		nombres[0]="Luis";
		nombres[1]="Pedro";
		nombres[2]="Marco";
		nombres[3]="Lucas";
		//para saber el tamaño del aaray
		System.out.println("el tamaño del array es:"+nombres.length);
		
	//àra saber el nombre de una posicion concreta:
		System.out.println("El alumno de la posicion 0 es: "+nombres[0]);
		
		//Para recorrer todo el array con un num que pone el usuario
		
		Scanner datos=new Scanner(System.in);
		int cantidad=0;
		String[] alumno=null;
		String nom;
		
		System.out.print("Introduce la cantidad de alumnos:");
		cantidad=datos.nextInt();
		
		alumno=new String[cantidad];
		
		for(i=0; i<alumno.length;i++) {
			System.out.print("Nombre alumno "+(i+1)+" : ");
			nom=datos.next();
			alumno[i]=nom;
			
		}
		for(i=0; i<alumno.length;i++) {
			System.out.println("el nombre del alumno "+(i+1)+" es: "+alumno[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
