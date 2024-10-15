package Start;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner datos=new Scanner(System.in);
		
		int i=0;
		String nom1="Juan";
		String nom2="Pedro";
		String nom3="Jaime";
		String nom4="Lucas";
		String nom5="Maria";
		// String [] nombreArray=new String[pposiciones de memoria];
		String [] nombres= new String[5];
		nombres[0]="Juan";
		nombres[1]="Pedro";
		nombres[2]="Jaime";
		nombres[3]="Lucas";
		nombres[4]="Maria";
		
		//Para preguntar numbres mas rapido cin arrays
		//imprimir x pantalla mas facil
		
		
		for(i=0; i<nombres.length; i++) {
			System.out.println("Introduzca nombre " +(i+1)+": ");
			nombres[i]=datos.next();
		}
		
		for(i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}

}
