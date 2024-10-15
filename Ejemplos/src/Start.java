import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		
		Scanner datos=new Scanner(System.in);
		
		float[][][] notas=new float[3][2][2];
		
		System.out.println(notas.length );
		System.out.println(notas[0].length );
	
		
		//bucle Anidado
		
		for(i=0; i<notas.length; i++) {
			for(j=0; j<notas[i].length;j++) {
				for(k=0;k<notas[i][j].length;k++) {
					System.out.print("introduce notas del alumno: "+i+","+j+","+k+":");
					notas[i][j][k]=datos.nextFloat();
					
				}
				
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<2;j++) {
				for(k=0;k<2;k++) {
					System.out.print(notas[i][j][k]+"|");
				}
				
			}
			System.out.println("");
		}
		
	}

}
		