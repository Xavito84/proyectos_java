
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array estatico
		int[] numeros;
		numeros= new int[10];
		int i=0;
		int[] numeros2;
		numeros2= new int[10];
		
		
		for(i=0;i<numeros.length;i++) {
			numeros[i]=i;
		}
		for(i=0;i<numeros2.length;i++) {
			numeros2[i]=numeros[i];
		}
		for(i=0;i<numeros.length;i++) {
			System.out.println(""+numeros2[i]);
		}
	}

}
