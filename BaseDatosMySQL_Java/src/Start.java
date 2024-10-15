import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//xa vincular con msql poner DriverManager.registerDriver.... y despues surround try/cath	
		try {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
			//establecer conexion con base de datos.
			Connection conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/ifp",  "root", "");
			//consultas dentro de la base de datos
			Statement s= (Statement) conexion.createStatement();
			//consulta para devolver todows los campos de la tabla
			//OJO LA COMILLA DE USUARIO ES CON  EL ACENTO HACIA LA IZQUIERDA
			ResultSet rs=s.executeQuery("SELECT *FROM `usuarios` ORDER BY edad ASC");
										
			//IR MOSTRANDO CADA VALOR CON UN BUCLE WHILE
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" - "+rs.getString("nombre")+" - "+rs.getString("password")+" - "+rs.getInt("edad")+" - "+rs.getFloat("salario")+" - "+rs.getBoolean("activo"));
			}
			conexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
