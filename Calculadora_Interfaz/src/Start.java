import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;
	private JTextField caja1;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton boton7;
	private JButton boton8;
	private JButton boton9;
	private JButton boton0;
	private JButton botonS;
	private JButton botonR;
	private JButton botonM;
	private JButton botonD;
	private JButton botonPar;
	private JButton botonIgual;
	private JButton botonC;
	
	private String num1="";
	private String num2="";
	private String operacion="";
	private float resultado;
	private String contenidoCaja1;
	private float n1;
	private float n2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
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
	private void bloquearOp() {
		botonS.setEnabled(false);
		botonR.setEnabled(false);
		botonM.setEnabled(false);
		botonD.setEnabled(false);
		botonPar.setEnabled(false);
	}
	
	private void bloquearTodo() {
		
		
		boton1.setEnabled(false);
		boton2.setEnabled(false);
		boton3.setEnabled(false);
		boton4.setEnabled(false);
		boton5.setEnabled(false);
		boton6.setEnabled(false);
		boton7.setEnabled(false);
		boton8.setEnabled(false);
		boton9.setEnabled(false);
		boton0.setEnabled(false);
		botonS.setEnabled(false);
		botonR.setEnabled(false);
		botonM.setEnabled(false);
		botonD.setEnabled(false);
		botonPar.setEnabled(false);
		botonIgual.setEnabled(false);
	}
	
	private void desbloquear() {
		boton1.setEnabled(true);
		boton2.setEnabled(true);
		boton3.setEnabled(true);
		boton4.setEnabled(true);
		boton5.setEnabled(true);
		boton6.setEnabled(true);
		boton7.setEnabled(true);
		boton8.setEnabled(true);
		boton9.setEnabled(true);
		boton0.setEnabled(true);
		botonS.setEnabled(true);
		botonR.setEnabled(true);
		botonM.setEnabled(true);
		botonD.setEnabled(true);
		botonPar.setEnabled(true);
		botonIgual.setEnabled(true);
	}
	
		
		
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 443, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		caja1 = new JTextField();
		caja1.setHorizontalAlignment(SwingConstants.RIGHT);
		caja1.setBounds(29, 35, 363, 60);
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
		boton1.setBounds(43, 197, 52, 42);
		frame.getContentPane().add(boton1);
		
		boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "2";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton2.setBounds(109, 197, 52, 42);
		frame.getContentPane().add(boton2);
		
		boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "3";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton3.setBounds(181, 197, 52, 42);
		frame.getContentPane().add(boton3);
		
		boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "4";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton4.setBounds(43, 265, 52, 42);
		frame.getContentPane().add(boton4);
		
		boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "5";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton5.setBounds(109, 265, 52, 42);
		frame.getContentPane().add(boton5);
		
		boton6 = new JButton("6");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "6";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton6.setBounds(181, 265, 52, 42);
		frame.getContentPane().add(boton6);
		
		boton7 = new JButton("7");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "7";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton7.setBounds(43, 325, 52, 42);
		frame.getContentPane().add(boton7);
		
		boton8 = new JButton("8");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "8";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton8.setBounds(109, 325, 52, 42);
		frame.getContentPane().add(boton8);
		
		boton9 = new JButton("9");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "9";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton9.setBounds(181, 325, 52, 42);
		frame.getContentPane().add(boton9);
		
		boton0 = new JButton("0");
		boton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenidoCaja1=caja1.getText().toString();
				contenidoCaja1=contenidoCaja1 + "0";
				
				
				caja1.setText(contenidoCaja1);
			}
		});
		boton0.setBounds(43, 386, 52, 42);
		frame.getContentPane().add(boton0);
		
		botonS = new JButton("+");
		botonS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					num1= caja1.getText().toString();
				try {
					n1=Float.parseFloat(num1);
					caja1.setText("");
					operacion="+";
					System.out.println(num1+" "+ operacion);
					bloquearOp();
				}catch(Exception e1) {
					caja1.setText("Error");
					bloquearTodo();
				}
					
						
				
				
				
			}
		});
		botonS.setBounds(302, 197, 52, 42);
		frame.getContentPane().add(botonS);
		
		botonR = new JButton("-");
		botonR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				num1= caja1.getText().toString();
				try {
					n1=Float.parseFloat(num1);
					caja1.setText("");
					operacion="-";
					System.out.println(num1+" "+ operacion);
					bloquearOp();
				}catch(Exception e1) {
					caja1.setText("Error");
					bloquearTodo();
				}
					
			}
		});
		botonR.setBounds(302, 265, 52, 42);
		frame.getContentPane().add(botonR);
		
		botonM = new JButton("*");
		botonM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1= caja1.getText().toString();
				try {
					n1=Float.parseFloat(num1);
					caja1.setText("");
					operacion="*";
					System.out.println(num1+" "+ operacion);
					bloquearOp();
				}catch(Exception e1) {
					caja1.setText("Error");
					bloquearTodo();
				}
			}
		});
		botonM.setBounds(302, 325, 52, 42);
		frame.getContentPane().add(botonM);
		
		botonD = new JButton("/");
		botonD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1= caja1.getText().toString();
				try {
					n1=Float.parseFloat(num1);
					caja1.setText("");
					operacion="/";
					System.out.println(num1+" "+ operacion);
					bloquearOp();
				}catch(Exception e1) {
					caja1.setText("Error");
					bloquearTodo();
				}
			}
		});
		botonD.setBounds(302, 386, 52, 42);
		frame.getContentPane().add(botonD);
		
		botonPar = new JButton("Par");
		botonPar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				num1=caja1.getText().toString();
				caja1.setText("");
				if(num1.equals("")) {
					caja1.setText("Error");
					bloquearTodo();
				}else {
				if(Float.parseFloat(num1) % 2==0) {
					caja1.setText("Es par");
					bloquearTodo();
				}else {
					caja1.setText("Es Impar");
					bloquearTodo();
				}
				}	
					
					
				
			}
		});
		botonPar.setBounds(109, 130, 79, 42);
		frame.getContentPane().add(botonPar);
		
		botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2=caja1.getText().toString();
				System.out.println(num1+" "+ operacion+" "+ num2);
				if(num1.equals("")) {
					caja1.setText("Error");
					bloquearTodo();
				}else if(num2.equals("")) {
					caja1.setText("Error");
					bloquearTodo();
				}else {
				
				try {
					if(operacion.equals("+")) {
						n2=Float.parseFloat(num2);
						resultado=n1+n2;
						caja1.setText(""+resultado);
						bloquearTodo();
					}else if(operacion.equals("-")) {
						n2=Float.parseFloat(num2);
						resultado=n1-n2;
						caja1.setText(""+resultado);
						bloquearTodo();
					}else if(operacion.equals("*")) {
						n2=Float.parseFloat(num2);
						resultado=n1*n2;
						caja1.setText(""+resultado);
						bloquearTodo();
					}else if(operacion.equals("/")) {
						n2=Float.parseFloat(num2);
						if(n2==0f) {
							caja1.setText("Indeterminacion");
							bloquearTodo();
						}else {
							resultado=n1/n2;
							caja1.setText(""+resultado);
							bloquearTodo();
						}
					}
					
				}catch(Exception e1) {
					caja1.setText("Error");
					bloquearTodo();
				}
				
				}
				
			}
		});
		
		botonIgual.setBounds(119, 386, 114, 42);
		frame.getContentPane().add(botonIgual);
		
		botonC = new JButton("C");
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				caja1.setText("");
				num1="";
				num2="";
				operacion="";
				desbloquear();
			}
		});
		botonC.setBounds(43, 130, 52, 42);
		frame.getContentPane().add(botonC);
		
	}

}
