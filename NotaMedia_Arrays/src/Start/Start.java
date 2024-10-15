package Start;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
/* Arrrays estaticos: su tamaño si es de 10 no se podra alterar durante el programa-
 * Arrays dinaminos: si el tamaño es 0 se puede ir aumentando y dismiyundo durante el programa
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner datos=new Scanner (System.in);
		
		
		float[] notas =new float[10];
		int i=0;
		float media=0.00f;
		int numAlumnos=5;
		
		
		//Arrays Estatico
		/*for(i=0; i<notas.length; i++){
			System.out.println("Introduzca la nota del alumno:  " +(i+1)+": ");
			notas[i]=datos.nextFloat();
			
		}
		for(i=0; i<notas.length; i++){
			media=media + notas[i];
		}
		
		media= media/ notas.length;
		System.out.println("la media es "+media);*/
		
		//***********************************************************************
		//***********************************************************************
		//***********************************************************************
		//Arrays Dinamico de flotantes
		//HAy que poner el float con la F mayuscula e impotar Array List
		
		ArrayList<Float>notasD=new ArrayList<Float>();
		
		//capturar datos
		for(i=0; i<numAlumnos; i++) {
			System.out.println("introduce notas del alumno: "+(i+1)+"");
			notasD.add(datos.nextFloat());
		}
		
		/*mostart datos
		for(i=0; i<notasD.size(); i++) {
			System.out.println("la nota del alumno "+notasD.get(i));
		}*/
		
		//mostrar media
		
		for(i=0; i<notasD.size(); i++) {
			media=media+notasD.get(i);
			
		}
		media=media/notasD.size();
		System.out.println("la nota media mediante array dinamico es: "+media);
		
		//para borrar una nota se hace con--->   .remove(2);
		
		notasD.remove(4);
		for(i=0; i<notasD.size(); i++) {
			System.out.println("la nota del alumno "+notasD.get(i));
		}
		
		
	}

}
