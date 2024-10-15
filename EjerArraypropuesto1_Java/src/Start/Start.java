 package Start;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays Unidimensionales y Bidimensionales
		/*REaliza un programa que almacene las notas de 3 asignaturas de 5 alumnos de cada una de la
		 * clase y posteriormente calcule la media de cada asignatura y la total.
		 */
		
		Scanner datos=new Scanner (System.in);
		
		int i = 0;
		int j=0;
		
		
		String[] nombreAlumnos=new String[5];
		Float[][] notasAlumnos= new Float[3][5];
		Float[] mediasAsignaturas= new Float[3];
		float total=0f;
		
		for(i=0; i<nombreAlumnos.length; i++) {
			System.out.print("Introduzca nombre del Alumno" +(i+1)+": ");
			nombreAlumnos[i]=datos.next();
		}
		
		for(i=0; i<notasAlumnos.length; i++) {
			mediasAsignaturas[i]=0f;
			for(j=0; j<notasAlumnos[0].length; j++) {
				System.out.print("Introduzca nota Asignatura " +(i+1)+" de "+nombreAlumnos[j]+": ");
				notasAlumnos[i][j]=datos.nextFloat();
				
				mediasAsignaturas[i]+=notasAlumnos[i][j];
			} 
		}
		
		for (i=0; i<mediasAsignaturas.length; i++) {
			mediasAsignaturas[i]=mediasAsignaturas[i] / nombreAlumnos.length;
			System.out.println("La media de la Asignatura "+(i+1)+ " es "+ mediasAsignaturas[i]);
			total+=mediasAsignaturas[i];
			
		}
		
		total=total/ mediasAsignaturas.length;
		System.out.println("la media total es "+ total);
		
		
		/*for(i=0; i<notasAlumnos.length; i++) {
			for(j=0; j<notasAlumnos[0].length; j++) {
				System.out.print(i+"-"+j+" : "+ notasAlumnos[i][j]);
			
				
			}
			System.out.println("");
			System.out.println("*******************************************");
		}
		*/
		
	}

}
