package ejercicio;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class Ventana extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JButton button;
	
	public Ventana() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 500, 400);
		setTitle("Java App Escritorio");
		getContentPane().setLayout(null);
		
		button = new JButton();
		button.setText("Ejercicio1");
		button.setBounds(184, 122, 134, 44);		
		getContentPane().add(button);
		button.addActionListener(new button1Event());
		
		JButton btnEjercicio = new JButton();
		btnEjercicio.setText("Ejercicio2");
		btnEjercicio.setBounds(184, 187, 134, 44);
		getContentPane().add(btnEjercicio);
		btnEjercicio.addActionListener(new button2Event());
		
		JButton btnEjercicio_1 = new JButton();
		btnEjercicio_1.setText("Ejercicio3");
		btnEjercicio_1.setBounds(184, 252, 134, 44);
		getContentPane().add(btnEjercicio_1);
		btnEjercicio_1.addActionListener(new button3Event());
		
		JLabel lblGrupoNro = new JLabel("GRUPO NRO: 6");
		lblGrupoNro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrupoNro.setBounds(51, 41, 100, 33);
		getContentPane().add(lblGrupoNro);
	}
	
	public void Visibilidad(boolean estado)
	{
		setVisible(estado);
	}
}

class button1Event implements ActionListener 
{
	//private JTextField txt1;
	
	public button1Event()
	{
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Ventana1 M = new Ventana1();
		M.Visibilidad(true);
		
	}
	
}

class button2Event implements ActionListener 
{
	//private JTextField txt1;
	
	public button2Event()
	{
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Ventana2 M = new Ventana2();
		M.Visibilidad(true);
		
	}
	
}

class button3Event implements ActionListener 
{
	//private JTextField txt1;
	
	public button3Event()
	{
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Ventana3 M = new Ventana3();
		M.Visibilidad(true);
		
	}
	
}