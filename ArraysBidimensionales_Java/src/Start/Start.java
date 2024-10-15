package Start;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=0;
		
		Scanner datos=new Scanner(System.in);
		
		float[][] notasA=new float[3][5];
		
		System.out.println(notasA.length );
		System.out.println(notasA[0].length );
		
		//bucle Anidado
		
		for(i=0; i<notasA.length; i++) {
			for(j=0; j<notasA[0].length;j++) {
				System.out.print("introduce notas del alumno: "+i+","+j+":");
				notasA[i][j]=datos.nextFloat();
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<5;j++) {
				System.out.print(notasA[i][j]+"|");
			}
			System.out.println("");
		}
		
		
		
		/*for(i=0; i<numAlumnos; i++) {
			System.out.println("introduce notas del alumno: "+(i+1)+"");
			notasD.add(datos.nextFloat());
		}*/
	}

}
