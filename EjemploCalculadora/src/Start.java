import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Font;

public class Start {

	private JFrame frame;
	private JTextField caja1;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private String contenidoCaja1;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	
	private String operando1="";
	private String operando2="";
	private String operacion="";
	private float resultado;
	
	

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
	
	private void bloquearOperaciones() {
		boton4.setEnabled(false);
		boton5.setEnabled(false);
		
	}
	private void bloquearTodo() {
		boton1.setEnabled(false);
		boton2.setEnabled(false);
		boton3.setEnabled(false);
		boton4.setEnabled(false);
		boton5.setEnabled(false);
		boton7.setEnabled(false);
		
	}
	private void desbloquearTodo() {
		boton1.setEnabled(true);
		boton2.setEnabled(true);
		boton3.setEnabled(true);
		boton4.setEnabled(true);
		boton5.setEnabled(true);
		boton7.setEnabled(true);
		
	}
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja1 = new JTextField();
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);
		caja1.setBounds(54, 32, 297, 34);
		frame.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "1";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton1.setBounds(79, 175, 49, 41);
		frame.getContentPane().add(boton1);
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "2";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton2.setBounds(150, 175, 49, 41);
		frame.getContentPane().add(boton2);
		
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "3";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton3.setBounds(223, 175, 49, 41);
		frame.getContentPane().add(boton3);
		
		boton4 = new JButton("+");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operando1= caja1.getText().toString(); //REcojo el primer numero del usuario
				caja1.setText("");
				operacion="+";
				System.out.println(operando1+" "+ operacion);
				bloquearOperaciones();
				
				
				
				
				
			}
		});
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton4.setBounds(366, 185, 73, 51);
		frame.getContentPane().add(boton4);
		
		boton5 = new JButton("-");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				operando1= caja1.getText().toString(); //REcojo el primer numero del usuario
				caja1.setText("");
				operacion="-";
				System.out.println(operando1+" "+ operacion);
				bloquearOperaciones();
			}
		});
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton5.setBounds(366, 246, 73, 51);
		frame.getContentPane().add(boton5);
		
		boton6 = new JButton("C");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText("");
				operando1="";
				operando2="";
				operacion="";
				desbloquearTodo();
				//para cambiar color de la tecla es boton6.setforeground(new Color 255,0,0)
				
				
				
			}
		});
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton6.setBounds(79, 102, 73, 51);
		frame.getContentPane().add(boton6);
		
		boton7 = new JButton("=");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operando2=caja1.getText().toString();
				System.out.println(operando1+" "+ operacion+" "+ operando2);
				
				if(operacion.equals("+")) {
					resultado=Float.parseFloat(operando1)+ Float.parseFloat(operando2);
					caja1.setText(""+resultado);// si solo queres que salga la parte decimal es caja1.setText(""+ (int) resultado);
					bloquearTodo();
				}
				else if(operacion.equals("-")) {
					resultado=Float.parseFloat(operando1)- Float.parseFloat(operando2);
					caja1.setText(""+resultado);// si solo queres que salga la parte decimal es caja1.setText(""+ (int) resultado);
					bloquearTodo();
				}

			
			}
		});
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton7.setBounds(366, 315, 73, 51);
		frame.getContentPane().add(boton7);
	}
}
