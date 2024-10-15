import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class BaseDeDatos {
	private String servidor;
	private String nombreBD;
	private String usuario;
	private String password;
	
	
	
//Registar el driver
	public BaseDeDatos(String servidor, String nombreBD, String usuario, String password ) 
	{
		this.servidor=servidor;
		this.nombreBD=nombreBD;
		this.usuario=usuario;
		this.password=password;
		
		try {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean C(String consulta) {
		return false;
	}
	public ArrayList<usuario> R(String consulta) {
		
		Connection conexion=null;
		
		int contador=0;
		ArrayList<usuario> alu =new ArrayList<usuario>();
		usuario u=null;
		Statement s=null;
		
		
	System.out.println("jdbc:mysql://"+this.servidor+"/"+this.nombreBD+usuario+ password);
		try {
			conexion = (Connection) DriverManager.getConnection("jdbc:mysql://+"+this.servidor+"/"+this.nombreBD, usuario, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			s= (Statement) conexion.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResultSet rs=null;
		try {
			
			rs = s.executeQuery("SELECT *FROM `usuarios` ORDER BY edad DESC");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
									
		
		try {
			while(rs.next()) {
				u=new usuario();
				u.setId(rs.getInt("id"));
				u.setNombre(rs.getString("nombre"));
				u.setPassword(rs.getString("password"));
				u.setEdad(rs.getInt("edad"));
				u.setSalario(rs.getFloat("salario"));
				u.setActivo(rs.getBoolean("activo"));
				
				alu.add(u);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return alu;
	}
	public void U(String consulta) {
	
}
	public void D(String consulta) {
	
}


}
