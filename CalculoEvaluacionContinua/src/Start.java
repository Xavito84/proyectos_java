import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frmNotas;
	private JTextField caja1;
	private JTextField caja2;
	private JTextField caja3;
	private JLabel Label1;
	private JLabel Label2;
	private JLabel Label3;
	private JLabel Label4;
	private JLabel Label5;
	private JButton boton1;
	
	private String contenidoCaja1;
	private String contenidoCaja2;
	private String contenidoCaja3;
	
	private float notaP;
	private float notaT;
	private float notaR;
	private float resultado;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmNotas.setVisible(true);
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
		frmNotas = new JFrame();
		frmNotas.setTitle("Notas");
		frmNotas.setBounds(100, 100, 745, 524);
		frmNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNotas.getContentPane().setLayout(null);
		
		Label1 = new JLabel("Nota Ejercico evaluable práctico:");
		Label1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Label1.setBounds(44, 78, 287, 34);
		frmNotas.getContentPane().add(Label1);
		
		Label2 = new JLabel("Nota Ejercico evaluable teórico:");
		Label2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Label2.setBounds(44, 122, 277, 34);
		frmNotas.getContentPane().add(Label2);
		
		Label3 = new JLabel("Reto:");
		Label3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Label3.setBounds(44, 166, 277, 34);
		frmNotas.getContentPane().add(Label3);
		
		caja1 = new JTextField();
		caja1.setBounds(379, 78, 277, 34);
		frmNotas.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		caja2 = new JTextField();
		caja2.setColumns(10);
		caja2.setBounds(379, 122, 277, 34);
		frmNotas.getContentPane().add(caja2);
		
		caja3 = new JTextField();
		caja3.setColumns(10);
		caja3.setBounds(379, 166, 277, 34);
		frmNotas.getContentPane().add(caja3);
		
		boton1 = new JButton("Calcular");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//Se pone try/cath para la excepcion de que solo escriban numeros
			// se pone un if pra que el numero no sea mayor a 10 y menor que 0
				try {
				Label4.setText("");
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja2=caja2.getText().toString();
				contenidoCaja3=caja3.getText().toString();
				
				notaP=Float.parseFloat(contenidoCaja1);
				notaT=Float.parseFloat(contenidoCaja2);
				notaR=Float.parseFloat(contenidoCaja3);
				
				if((notaP>0f && notaP<=10f) && (notaT>0f && notaT<=10f) && (notaR>0f && notaR<=10f)) {
				
					notaP=notaP*0.8f;
					notaT=notaT*0.1f;
					notaR=notaR*0.1f;
				
				resultado= notaP+notaT+notaR;
				Label5.setText(Float.toString(resultado));
				}else {
					caja1.setText("");
					caja2.setText("");
					caja3.setText("");
					Label4.setText("Formato erroneo");
				}
				
				//Label5.setText(""+resultado); un truco para no poner el Float.toString(resultado) 
				}catch (Exception e2) {
					caja1.setText("");
					caja2.setText("");
					caja3.setText("");
					Label4.setText("Formato erroneo");
					// para cabiar el color los numeros son RGB va de 0 a 255
					Label4.setForeground(new Color(0,0 ,255));
				
				}
			}
		});
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton1.setBounds(379, 257, 277, 50);
		frmNotas.getContentPane().add(boton1);
		
		Label4 = new JLabel("0");
		Label4.setHorizontalAlignment(SwingConstants.CENTER);
		Label4.setForeground(new Color(255, 128, 0));
		Label4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		Label4.setBounds(378, 338, 278, 50);
		frmNotas.getContentPane().add(Label4);
		
		Label5 = new JLabel("");
		Label5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Label5.setForeground(new Color(255, 0, 0));
		Label5.setBounds(379, 214, 277, 33);
		frmNotas.getContentPane().add(Label5);
	}

}
