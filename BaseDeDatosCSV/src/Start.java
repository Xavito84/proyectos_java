import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos = new Scanner(System.in);
		int opcion = -1;
		Connection conexion = null;
		Statement stmExportar= null;
		Statement stmImportar=null;
		ResultSet resultadosExportar=null;
		int numResultados;
		String contenidoCSV="";
		String ruta="";
		FileWriter fw=null;
		PrintWriter pw=null;
		File f=null;
		FileReader fr=null;
		BufferedReader br= null;
		String linea="";
		String contenido_bd="";
		String[] partes=null;
		int contador=0;
		String consulta="";
		
		
		
		
		

		System.out.println("******EXPORTA/IMPORTAR**********");

		try {
			conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendadamb",
					"root", "");
			//System.out.println("conexion correcta");

			do {
				System.out.println("selecciona una opcion");
				System.out.println("1.Exportar a CSV");
				System.out.println("2.Importar de CSV");
				System.out.println("0. Salir");
				System.out.print("Opcion: ");
				opcion = datos.nextInt();

				if (opcion == 1) {
					// Exportar
					stmExportar= (Statement)conexion.createStatement();
					resultadosExportar= (ResultSet) stmExportar .executeQuery("SELECT * FROM productos");
					resultadosExportar.last();
					numResultados= resultadosExportar.getRow();
					if(numResultados>0) {
						resultadosExportar.first();
						contenidoCSV+="id;nombre;precio;cantidad\n";
						while(!resultadosExportar.isAfterLast()) 
						{
							
							contenidoCSV+=resultadosExportar.getString(1)+" ; "+ resultadosExportar.getString(2)+" ; "+resultadosExportar.getString(3)+" ; "+resultadosExportar.getString(4)+"\n"	;		
							
							
							resultadosExportar.next();
						}
						resultadosExportar.close();
						System.out.println(contenidoCSV);
						System.out.println("***************************");
						System.out.println("Introduce nombre del fichero");
						ruta=datos.next();
						
						f=new File (ruta);
						if(f.exists()) {
							System.out.println("El fichero ya existe");
							
						}else {
							fw= new FileWriter(f);
							pw= new PrintWriter(fw);
							pw.println(contenidoCSV);
							
							pw.close();
							fw.close();
							
						}
						
						
						
					}else {
						System.out.println("no han encontrado datos");
					}
					
					
					
					
					

				} else if (opcion == 2) {
					// importar
					System.out.print("Introduce nombre del fichero CSV a importar");
					ruta=datos.next();
					f= new File(ruta);
					if(f.exists()) {
						stmImportar= (Statement) conexion.createStatement();
						
						
						fr= new FileReader(f);
						br= new BufferedReader(fr);
						
						while(linea!=null) {
							
							contador++;
							linea=br.readLine();
							if(contador==1) {
								continue;
							}
							
							if(linea!=null) {
								
								partes=linea.split(";");
								System.out.println(partes[0]+" - "+partes[1]+" - "+partes[2]+" - "+partes[3]);
								consulta="INSERT INTO productos (id,nombre, precio, cantidad) VALUES ("+partes[0]+",'"+partes[1]+"',"+partes[2]+","+partes[3]+")";
								System.out.println(consulta);
								stmImportar.executeUpdate(consulta);
							}
						}
						
						System.out.println("Importacion finalizada");
						br.close();
						fr.close();
						
						
					}else
						System.out.println("El fichero no existe");
					 
					
					
					
					
				} else if (opcion == 0) {

				} else {
					System.out.println("opcion erronea");
				}

			} while (opcion != 0);
			// desconexion base de datos
			conexion.close();
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
