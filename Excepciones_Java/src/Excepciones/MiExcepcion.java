package Excepciones;

public class MiExcepcion extends Exception{
	
	//llamas al padre
	public MiExcepcion() {
		super();
	}
	public MiExcepcion(String mensaje) {
		super(mensaje);
	}
}
//he creado mi excepcion llamo al mensaje