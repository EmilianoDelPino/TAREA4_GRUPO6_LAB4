package ejercicio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JFormattedTextField textField_3;
	private JLabel lblLosDatosIngresados;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setTitle("Ejercicio 1");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cierra solo esta ventana con "x"
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Label Nombre
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(84, 43, 89, 14);
		contentPane.add(lblNombre);
		
		//Label Apellido
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(84, 68, 89, 14);
		contentPane.add(lblApellido);
		
		//Label Telefono
		JLabel lblNewLabel = new JLabel("Telefono:");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(84, 93, 89, 14);
		contentPane.add(lblNewLabel);
		
		//Label Fecha
		JLabel lblNewLabel_1 = new JLabel("Fecha Nac.:");
		lblNewLabel_1.setBounds(84, 118, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		//Label para mostrar datos (vacio)
		lblLosDatosIngresados = new JLabel("");
		lblLosDatosIngresados.setBounds(20, 236, 370, 14);
		contentPane.add(lblLosDatosIngresados);
		
		//Field Nombre
		textField = new JTextField();
		textField.setBounds(237, 40, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Field Apellido 
		textField_1 = new JTextField();
		textField_1.setBounds(237, 65, 130, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		//Field Telefono
		textField_2 = new JTextField();
		textField_2.setBounds(237, 90, 130, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//Field Fecha
		textField_3 = new JFormattedTextField();
		textField_3.setBounds(237, 115, 130, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		//Button Mostrar
		JButton btnNewButton = new JButton("Mostrar datos");
		btnNewButton.addActionListener(new eventoBoton());
		
		btnNewButton.setBounds(237, 162, 130, 23);
		contentPane.add(btnNewButton);
		
		
	}
	
	public void Visibilidad(boolean estado)
	{
		setVisible(estado);
	}
	
	class eventoBoton implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
			boolean show = true;
			
			// check textField for only text - charcount - null
			if(!textField.getText().matches("[a-zA-Z]+") || textField.getText().length() < 3 || textField.getText().isEmpty() )
			{
				textField.setBackground(Color.RED);
				show = false;
			}
			else {textField.setBackground(Color.WHITE);}
			
			// check textField_1 for only text - charcount - null
			if(!textField_1.getText().matches("[a-zA-Z]+") || textField_1.getText().length() < 3 || textField_1.getText().isEmpty() )
			{
				textField_1.setBackground(Color.RED);
				show = false;
			}
			else {textField_1.setBackground(Color.WHITE);}
			
			// check textField_2 for only numbers - charcount - null
			if(!textField_2.getText().matches("[0-9]+") || textField_2.getText().length() < 3 || textField_2.getText().isEmpty() )
			{
				textField_2.setBackground(Color.RED);
				show = false;
			}
			else {textField_2.setBackground(Color.WHITE);}
			
			// check textField_2 for charcount - null
			if(textField_3.getText().length() < 3 || textField_3.getText().isEmpty() )
			{
				textField_3.setBackground(Color.RED);
				show = false;
			}
			else {textField_3.setBackground(Color.WHITE);}
			
			
			if(show)
			{
				//Si todos los campos estan completos muestro resultado
				lblLosDatosIngresados.setText("Los datos ingresados fueron: " + textField.getText() + " " + textField_1.getText() + " "  + textField_2.getText() + " "  + textField_3.getText() );
				
				//Vaciar campos
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
			}
			
		}
		
	}
	
}



