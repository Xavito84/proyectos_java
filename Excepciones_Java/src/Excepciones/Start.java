package Excepciones;

import java.util.Scanner;

public class Start {
	//Para llamr a MiExcepcion es con throws
	public static void main(String[] args) throws MiExcepcion {
		// TODO Auto-generated method stub

		Scanner datos=new Scanner(System.in);
		
		int edad =0;
		String edadText="";
		int mayorEdad=0;
		
		System.out.print("Introduzca su edad: ");
		//simpre que se capture informacion hay que poner una excpecion con try /catch
		try {
			edad=datos.nextInt();
			System.out.print("Su edad es: "+edad);
		}catch (Exception e) {
			System.out.println("la edad introducida no es correcta, debe introducir un valor entero");
			
		}
		
		//tambien try/catch cuando haces un casting
		System.out.println(" ");
		System.out.print("Introduzca su edad: ");
		try {
			edadText=datos.next();
			edad=Integer.parseInt(edadText);
			mayorEdad=18 - edad;
			if(mayorEdad>0) {
				System.out.println("Te quedan "+mayorEdad+ " años para ser adultos");
			}else {
				System.out.println("Ya eres adulto");
			}
			
		}catch (Exception e) {
			System.out.println("la edad introducida no es correcta, debe introducir un valor entero");
			
		}
		//Para lanzar mi excepcion
		System.out.println(" ");
		System.out.print("Introduzca su edad: ");
		try {
			edadText=datos.next();
			edad=Integer.parseInt(edadText);
			if(edad<0) {
				//aqui metemos la excepcion con throw sin la S
				throw new MiExcepcion("La edad no puede ser negativa");
			}else {
				mayorEdad=18 - edad;
				if(mayorEdad>0) {
					System.out.println("Te quedan "+mayorEdad+ " años para ser adultos");
				}else {
					System.out.println("Ya eres adulto");
				}
			}
			
			
		}catch (Exception e) {
			System.out.println("la edad introducida no es correcta, debe introducir un valor entero");	
		}
		
	}

}
