package Interfaz;

import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.DateTimeException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.awt.event.ActionEvent;

public class Start {
	// coger debajo el por ejemplo el JLabel etiqueta1 lo copio y lo pego aqui en private JLabel etiqueta1; y borro el JLabel de abajo
	private JFrame frmVentana;
	private JTextField caja1;
	private JLabel etiqueta1;
	private JButton boton1;
	private JLabel etiqueta2;
	//creo un String para almacenar el contenido de la caja de texto.
	private String contenidoCaja1;
	//crear int para el casting
	private int valorCaja;
	private int anyo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmVentana.setVisible(true);
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
		frmVentana = new JFrame();
		frmVentana.setTitle("Ventana");
		frmVentana.setBounds(100, 100, 653, 533);
		frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentana.getContentPane().setLayout(null);
		
		etiqueta1 = new JLabel("Introduce tu edad:");
		etiqueta1.setFont(new Font("Arial", Font.PLAIN, 15));
		etiqueta1.setBounds(82, 62, 344, 48);
		frmVentana.getContentPane().add(etiqueta1);
		
		
		boton1 = new JButton("Calcular Año Nacimiento");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contenidoCaja1=caja1.getText().toString();
				valorCaja=Integer.parseInt(contenidoCaja1);
				//System.out.println("He pulsado al boton");
				System.out.println("Info de usuario en la caja "+contenidoCaja1);
				
				Date date= new Date();
				LocalDate localDate= date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				anyo=localDate.getYear();
				System.out.println(anyo);
				
				
				
				 
			}
		});
		
		
		caja1 = new JTextField();
		caja1.setBounds(78, 120, 348, 48);
		frmVentana.getContentPane().add(caja1);
		caja1.setColumns(10);
		
		boton1.setFont(new Font("Arial", Font.PLAIN, 15));
		boton1.setBounds(82, 205, 344, 48);
		frmVentana.getContentPane().add(boton1);
		
		etiqueta2 = new JLabel("");
		etiqueta2.setForeground(new Color(255, 0, 0));
		etiqueta2.setFont(new Font("Arial", Font.PLAIN, 18));
		etiqueta2.setBounds(82, 294, 336, 48);
		frmVentana.getContentPane().add(etiqueta2);
	}

}
