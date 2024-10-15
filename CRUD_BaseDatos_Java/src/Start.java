import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CRUD--> Create, Read, Update, Delete
		
		int i=0;
		ArrayList<usuario> usuario= new ArrayList<usuario>();
		
		
		BaseDeDatos db= new BaseDeDatos("localhost","ifp","root","");
		
		usuario= db.R("SELECT * FROM `usuarios`");
		
		for(i=0; i<usuario.size(); i++) {
			System.out.println(usuario.get(i).getId()+"--"+usuario.get(i).getNombre() +"--"+usuario.get(i).getPassword()+"--"+usuario.get(i).getEdad()+"--"+usuario.get(i).getSalario()+"--"+usuario.get(i).getActivo());
		}

	}

}
