package Ejercicio;

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
		setBounds(400, 400, 500, 400);
		setTitle("Java App Escritorio");
		getContentPane().setLayout(null);
		
		button = new JButton();
		button.setText("Ejercicio1");
		button.setBounds(184, 122, 134, 44);		
		getContentPane().add(button);
		
		JButton btnEjercicio = new JButton();
		btnEjercicio.setText("Ejercicio2");
		btnEjercicio.setBounds(184, 187, 134, 44);
		getContentPane().add(btnEjercicio);
		
		JButton btnEjercicio_1 = new JButton();
		btnEjercicio_1.setText("Ejercicio3");
		btnEjercicio_1.setBounds(184, 252, 134, 44);
		getContentPane().add(btnEjercicio_1);
		
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

class buttonEvent implements ActionListener 
{
	private JTextField txt1;
	
	public buttonEvent(JTextField txt)
	{
		txt1 = txt;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("BUTTON PRESSED!!" + txt1.getText());
		
	}
	
}