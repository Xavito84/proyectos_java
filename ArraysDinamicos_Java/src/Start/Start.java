package Start;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos= new Scanner (System.in);
		
		int i = 0;
		String nombre="";
		float nota=0f;
		float media=0f;
		
		//ArrayList de objetos Alumnos
		ArrayList<Alumno> notasAlumnos=new ArrayList<Alumno>();
		
		
		for (i = 0; i < 5; i++) {
			System.out.print("Introduzca una nota: "+(i+1));	
			nota=datos.nextFloat();
			System.out.print("Introduce el nombre del Alumno: "+(i+1));
			nombre=datos.next();
			Alumno a= new Alumno();
			a.setNombre(nombre);
			a.setNota(nota);
			notasAlumnos.add(a);
		}
		
		//Iterator sirve recorrer los elementos de un aaraylist
		//mostrar cada nombre con su nota
		
		Iterator<Alumno>it= notasAlumnos.iterator();
		while(it.hasNext()) {
			Alumno al=(Alumno) it.next();
			System.out.println(al.getNombre()+" -- "+al.getNota());
		}
		
		
		
		System.out.println("Tamaño Actual: "+notasAlumnos.size());
		
		
		for(i=0; i<notasAlumnos.size();i++) {
			media=media+notasAlumnos.get(i).getNota();
			
		}
		media=media/ notasAlumnos.size();
		System.out.println("la noTa media es: "+ media);
		
		
		
		/*float nota=0f;
		float media=0f;
		

		ArrayList<Float> notasAlumno = new ArrayList<Float>();

		System.out.println("Tamaño Actual: " + notasAlumno.size());

		for (i = 0; i < 5; i++) {
			System.out.println("Introduzca una nota: ");	
			nota=datos.nextFloat();
			notasAlumno.add(nota);
		}
		
		for(i=0;i<notasAlumno.size();i++) {
			media=media+ notasAlumno.get(i);
			
		}

		media=media/notasAlumno.size();
		System.out.println("la media es: "+ media);*/
	}
}