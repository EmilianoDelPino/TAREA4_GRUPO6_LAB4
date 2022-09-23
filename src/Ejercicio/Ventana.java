package Ejercicio;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
		button.setBounds(200, 300, 100, 20);
		
		getContentPane().add(button);
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