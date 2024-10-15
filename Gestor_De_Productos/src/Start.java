import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner datos= null;
		
		
		
		int opcion=-1;
		String nombre="";
		float precio=0.0f;
		int cantidad=0;
		String crear="";
		Connection conexion=null;
		Statement stmCrear=null;
		Statement stmListar=null;
		ResultSet resultadoListar=null;
		String contenidoListar;
		int resListar;
		int i=0;
		int opcionModificar;
		int id;
		Statement stmModificar=null;
		String modificar="";
		Statement stmBorrar=null;
		String borrar;
		
		
		
			try {
				conexion= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/productos","root","");
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
		do {
			try {
			datos= new Scanner(System.in);
		
			System.out.println("********************");
			System.out.println("GESTOR DE PRODUCTOS ");
			System.out.println("********************");
			System.out.println("selecciona una opcion");
			System.out.println("1. Crear Producto");
			System.out.println("2. Listar todos los productos");
			System.out.println("3. Modificar un Producto");
			System.out.println("4. Borrar un producto");
			System.out.println("0. Salir del programa");
			System.out.print("Opcion:_ ");
			
			opcion=datos.nextInt();
			
			if(opcion==1) {
				
					System.out.print("Introduce el nombre del prodcuto: ");
					nombre=datos.next();
					System.out.print("Introduce el precio del producto: ");
					precio=datos.nextFloat();
					System.out.print("Introduce la cantidad del producto: ");
					cantidad=datos.nextInt();
					stmCrear= (Statement) conexion.createStatement();
					crear= "'"+nombre+"'"+","+precio+","+cantidad;
					System.out.println(crear);
					crear="INSERT INTO productos (nombre, precio, cantidad) VALUES ("+crear+")";
					//System.out.println(crear);
					stmCrear.executeUpdate(crear);
					System.out.println("Producto creado correctamente");
				
				
				
			}else if(opcion==2){
				
				stmListar= (Statement) conexion.createStatement();
				resultadoListar= (ResultSet) stmListar .executeQuery("SELECT * FROM productos");
				resultadoListar.last();
				resListar= resultadoListar.getRow();
				if(resListar>0) {
					resultadoListar.first();
					contenidoListar="posicion,id;nombre;precio;cantidad\n";
					while(!resultadoListar.isAfterLast()) 
					{
						i++;
						contenidoListar+=i+" - "+resultadoListar.getString(1)+" - "+ resultadoListar.getString(2)+" - "+resultadoListar.getString(3)+"€"+" - "+resultadoListar.getString(4)+" unidades"+"\n";		
						
					
						resultadoListar.next();
					}
					System.out.println(contenidoListar);
				
				}else {
					System.out.println("Lista vacia");
				}
				resultadoListar.close();
				
				
			
			}else if (opcion==3) {
				
				System.out.print("Introduce el número de id que desea modificar: ");
				id=datos.nextInt();
				
				System.out.println("*************");
				System.out.println("campo ha modificar:");
				System.out.println("1. Nombre");
				System.out.println("2. Precio");
				System.out.println("3. Cantidad");
				System.out.print("Opcion:_");
				opcionModificar=datos.nextInt();
				stmModificar= (Statement) conexion.createStatement();
				
				if(opcionModificar==1) {
					System.out.print("Introduce el nombre del producto:_");
					nombre=datos.next();
					
					modificar= ("UPDATE `productos` SET `nombre`='"+nombre+"' WHERE id="+id);
					//System.out.println(modificar);
					stmModificar.executeUpdate(modificar);
					System.out.println("**************");
					System.out.println("producto modificado correctamente");
					System.out.println("**************");
					
					
					
				}else if(opcionModificar==2) {
					System.out.print("Introduce el precio del producto:_");
					precio=datos.nextFloat();
					
					modificar= ("UPDATE `productos` SET `precio`="+precio+" WHERE id="+id);
					//System.out.println(modificar);
					stmModificar.executeUpdate(modificar);
					System.out.println("**************");
					System.out.println("producto modificado correctamente");
					System.out.println("**************");
				}else if(opcionModificar==3) {
					System.out.print("Introduce la cantidad del producto:_");
					cantidad=datos.nextInt();
					
					modificar= ("UPDATE `productos` SET `cantidad`="+cantidad+" WHERE id="+id);
					//System.out.println(modificar);
					stmModificar.executeUpdate(modificar);
					System.out.println("**************");
					System.out.println("producto modificado correctamente");
					System.out.println("**************");
				}else {
					System.out.println("**************");
					System.out.println("opcion incorrecta");
					System.out.println("**************");
				}
				
			}else if(opcion==4) {
				
				System.out.print("Introduce el número de id que desea borrar: ");
				id=datos.nextInt();
				stmBorrar= (Statement) conexion.createStatement();
				borrar="DELETE FROM productos WHERE id="+id;
				stmBorrar.executeUpdate(borrar);
				System.out.println("**************");
				System.out.println("producto borrado correctamente");
				System.out.println("**************");
				
				
				
				//borrar
			}else if(opcion==0){
				
			}else {
				System.out.println("**************");
				System.out.println("opcion erronea");
				System.out.println("**************");
			}
			
			
			
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("***********************");
				System.out.println("Valor introducido no es válido");
				System.out.println("***********************");
			}
					
			
			
			
			
			
	}while (opcion!=0) ;
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}
}
