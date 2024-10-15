
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Crear un array estatico de tipo String de 10 posiciones. Rellenalos con cualquier informacion.
		 * El programa recorrera los valores de cada una de las posiciones del array,
		 * y si el contenido de alguna de las posiciones es vaacio, mostrara un mensaje indicando 
		 * "El array tiene huecos vacios" (Este mensaje solo puede salir ina unica vez aunque haya mas de un hueco o elemnto vacio)
		 * en caso de que no tenga huecos "El array esta correctamente relleno".
		 */
		//entero contador
		int i;
		//array estatico
		String[] valores =new String[10];
		//creamos un boolean para preguntar si tiene huecos o no y no se repita la frase cada vez que vea un hueco
		boolean tieneHuecos=false;
		//para saber cuantos huecos hay crear un int contador
		int contador=0;
		
		//doy 10 valores
		valores[0]="valor1";
		valores[1]="valor2";
		valores[2]="valor3";
		valores[3]="valor4";
		valores[4]="valor5";
		valores[5]="valor6";
		valores[6]="";
		valores[7]="valor8";
		valores[8]="";
		valores[9]="valor9";
		
		//Hago un bucle
		
		for(i=0;i<valores.length;i++) {
			//System.out.println(valores[i]);
			//hago un if para ver si hay huecos en los valores
			if (valores[i].equals("")) {
				contador++;
				tieneHuecos=true;
				
			}
		}
		//bucle para saber si hay huecos
		if(tieneHuecos) {
			System.out.println("el array tiene huecos vacios "+contador);
		}else {
			System.out.println("El array está correctamente");
		}
		
		
		
	}

}
