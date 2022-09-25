package ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.Box;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Cierra solo esta ventana con "x"
		setBounds(100, 100, 418, 373);
		contentPane = new JPanel();
		contentPane.setToolTipText("hola");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Notas del estudiante");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(39, 30, 136, 20);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setToolTipText("Hola\r\n");
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(33, 41, 2, 143);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("Hola\r\n");
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(286, 41, 2, 143);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setToolTipText("Hola\r\n");
		separator_2.setBounds(161, 41, 127, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setToolTipText("Hola\r\n");
		separator_3.setBounds(33, 183, 255, 12);
		contentPane.add(separator_3);
		
		JLabel lblNota = new JLabel("Nota 1:");
		lblNota.setBounds(59, 62, 46, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 2:");
		lblNota_1.setBounds(59, 90, 46, 14);
		contentPane.add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 3:");
		lblNota_2.setBounds(59, 119, 46, 14);
		contentPane.add(lblNota_2);
		
		JLabel lblTps = new JLabel("TPs:");
		lblTps.setBounds(59, 146, 46, 14);
		contentPane.add(lblTps);
		
		textField = new JTextField();
		textField.setBounds(171, 59, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 87, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(171, 116, 86, 20);
		contentPane.add(textField_2);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Aprobado", "Desaprobado"}));
		comboBox.setBounds(171, 146, 86, 20);
		comboBox.setSelectedIndex(-1);
		contentPane.add(comboBox);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setToolTipText("Hola\r\n");
		separator_4.setBounds(33, 314, 255, 2);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setToolTipText("Hola\r\n");
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(286, 231, 2, 85);
		contentPane.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setToolTipText("Hola\r\n");
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(33, 231, 2, 85);
		contentPane.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setToolTipText("Hola\r\n");
		separator_7.setBounds(161, 231, 127, 2);
		contentPane.add(separator_7);
		
		JLabel label = new JLabel("Notas del estudiante");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBackground(Color.LIGHT_GRAY);
		label.setBounds(39, 220, 136, 20);
		contentPane.add(label);
		
		JLabel lblCondicion = new JLabel("Condicion:");
		lblCondicion.setBounds(59, 289, 86, 14);
		contentPane.add(lblCondicion);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(59, 261, 102, 14);
		contentPane.add(lblPromedio);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(171, 258, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(171, 286, 86, 20);
		contentPane.add(textField_4);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(306, 76, 86, 33);
		btnCalcular.addActionListener(new eventoBoton());
		contentPane.add(btnCalcular);
		
		//Boton "Nuevo" - Limpieza de campos 
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				comboBox.setSelectedIndex(-1);
			}
		});
		btnNuevo.setBounds(306, 114, 86, 33);
		contentPane.add(btnNuevo);
		
		
		//Boton "Salir" - Cierra la ventana
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(306, 151, 86, 33);
		contentPane.add(btnSalir);
	}
	
	public void Visibilidad(boolean estado)
	{
		setVisible(estado);
	}
	
	class eventoBoton implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			textField_3.setText("Hola!");
			textField_4.setText("Hola!");
		}
	}
	
}
