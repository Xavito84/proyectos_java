import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad =0;
		int res=0;
		int id =1;
		String tabla="usuarios";
		
		try {
			Connection conexion =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendadamb","root","" );
			System.out.println("se ha conectado correctamente");
			
			Statement stm= (Statement) conexion.createStatement();
			
			ResultSet resultados= (ResultSet) stm.executeQuery("SELECT * FROM usuarios WHERE puntuacion>50");
			
			//resultados.first(); es el primer resultado
			resultados.last();
			cantidad= resultados.getRow();
			System.out.println("La cantidad de resultados es: "+cantidad);
			
			if (cantidad>0) {
				resultados.first();
				while(!resultados.isAfterLast()) {
					System.out.println(resultados.getString(1)+" - "+ resultados.getString(2));
					resultados.next();
					
				}
				
			}else {
				System.out.println("no se ha encontrado resultados");
			}
			
			resultados.close();
			
			//res=stm.executeUpdate("DELETE FROM usuarios WHERE id="+id); borrar
			//res=stm.executeUpdate("UPDATE usuarios SET puntuacion =80 WHERE id="+id ); editar
			
			System.out.println("INSERT INTO "+tabla+ "(nombre, puntuacion,edad) VALUES ('julian',100,40)");
			//res= stm.executeUpdate("INSERT INTO "+tabla+ " (nombre, puntuacion,edad) VALUES ('julian',100,40)"); insertar nuevos datos
			
			
			conexion.close();
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("no se ha conectado");
			
		}
		
		
		
		
	}

}
