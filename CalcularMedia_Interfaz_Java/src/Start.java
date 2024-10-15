import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
	private JLabel etiqueta5;
	private JLabel etiqueta6;
	private JButton boton1;
	//crear 3 variables para las 3 cajas
	private String nota1;
	private String nota2;
	private String nota3;
	
	private float n1;
	private float n2;
	private float n3;
	private float media;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		etiqueta1 = new JLabel("Calcular Media Alumno");
		etiqueta1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiqueta1.setBounds(61, 77, 340, 50);
		frame.getContentPane().add(etiqueta1);
		
		etiqueta2 = new JLabel("Matematicas");
		etiqueta2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiqueta2.setBounds(61, 152, 143, 20);
		frame.getContentPane().add(etiqueta2);
		
		etiqueta3 = new JLabel("Literatura");
		etiqueta3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiqueta3.setBounds(62, 211, 143, 16);
		frame.getContentPane().add(etiqueta3);
		
		etiqueta4 = new JLabel("Geografia");
		etiqueta4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiqueta4.setBounds(61, 281, 143, 30);
		frame.getContentPane().add(etiqueta4);
		
		caja1 = new JTextField();
		caja1.setBounds(241, 154, 180, 39);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setBounds(241, 211, 180, 39);
		frame.getContentPane().add(caja2);
		caja2.setColumns(10);
		
		caja3 = new JTextField();
		caja3.setBounds(241, 278, 180, 39);
		frame.getContentPane().add(caja3);
		caja3.setColumns(10);
		
		etiqueta5 = new JLabel("Nota Media");
		etiqueta5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		etiqueta5.setBounds(183, 426, 143, 50);
		frame.getContentPane().add(etiqueta5);
		
		etiqueta6 = new JLabel("");
		etiqueta6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		etiqueta6.setBounds(386, 426, 167, 50);
		frame.getContentPane().add(etiqueta6);
		
		boton1 = new JButton("Calcular Media");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nota1=caja1.getText().toString();
				nota2=caja2.getText().toString();
				nota3=caja3.getText().toString();
				
				//Mirar que ninguna nota este vacia;
				
				if(nota1.equals("") || nota2.equals("") || nota3.equals("")){
					
					etiqueta6.setText("Todos los campos son obligatorios");
			
				}else {
					n1=Float.parseFloat(nota1);
					n2=Float.parseFloat(nota2);
					n3=Float.parseFloat(nota3);
					media=(n1+n2+n3)/3.0f;
					//Poner comillas dobles porque si no no te dejara ya que la caja es string y tu le pasas un flotante
					etiqueta6.setText(""+media);
					
				}
				
				
				
				
				
				}
		});
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		boton1.setBounds(247, 339, 242, 50);
		frame.getContentPane().add(boton1);
	}

}
