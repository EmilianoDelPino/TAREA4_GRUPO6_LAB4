package ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Ventana3 extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
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
	public Ventana3() {
		//Title
		setTitle("Selección multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 588, 447);
		getContentPane().setLayout(null);
		
		//Label
		JLabel lblElejiUnSistema = new JLabel("Eleji un sistema operativo");
		lblElejiUnSistema.setBounds(58, 64, 201, 20);
		getContentPane().add(lblElejiUnSistema);
		
		//Instance Group for JRadioButton
		ButtonGroup group = new ButtonGroup();
		
		//JRadioButton 1
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setBounds(255, 60, 97, 29);
		getContentPane().add(rdbtnWindows);
		
		//JRadioButton 2
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setBounds(363, 60, 65, 29);
		getContentPane().add(rdbtnMac);
		
		//JRadioButton 3
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setBounds(435, 60, 71, 29);
		getContentPane().add(rdbtnLinux);
		
		//Group for JRadioButton
		group.add(rdbtnWindows);
		group.add(rdbtnMac);
		group.add(rdbtnLinux);
		
		//JPanel SO
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(39, 50, 481, 54);
		getContentPane().add(panel);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 479, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 52, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		
		//JPanel specialty
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(39, 136, 481, 127);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxProgramacin = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacin.setBounds(265, 12, 139, 29);
		panel_1.add(chckbxProgramacin);
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		chckbxAdministracin.setBounds(265, 49, 139, 29);
		panel_1.add(chckbxAdministracin);
		
		JLabel lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");
		lblElijeUnaEspecialidad.setBounds(15, 53, 179, 20);
		panel_1.add(lblElijeUnaEspecialidad);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxNewCheckBox.setBounds(265, 86, 139, 29);
		panel_1.add(chckbxNewCheckBox);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "En Desarrollo...");
			}
		});
		btnAceptar.setBounds(391, 346, 115, 29);
		getContentPane().add(btnAceptar);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador:");
		lblCantidadDeHoras.setBounds(62, 295, 262, 20);
		getContentPane().add(lblCantidadDeHoras);
		
		textField = new JTextField();
		textField.setBounds(328, 292, 178, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
	}

	//Visibility
	public void Visibilidad(boolean estado)
	{
		setVisible(estado);
	}
}
