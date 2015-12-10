package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Dominio.Gestor_Trabajador;

public class Formulario_Modificar_Trabajador {

	public JFrame frame;
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtSueldo;
	private JTextField txtDireccion;
	private Gestor_Trabajador gestor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_Modificar_Trabajador window = new Formulario_Modificar_Trabajador();
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
	public Formulario_Modificar_Trabajador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor_Trabajador();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 457, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(71, 52, 56, 16);
		panel.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(71, 81, 56, 16);
		panel.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(71, 110, 56, 16);
		panel.add(lblApellidos);
		
		JLabel lblTelfono = new JLabel("Sueldo:");
		lblTelfono.setBounds(71, 139, 56, 16);
		panel.add(lblTelfono);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(71, 168, 70, 16);
		panel.add(lblDireccin);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(166, 49, 116, 22);
		panel.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(166, 78, 116, 22);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(166, 107, 116, 22);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(166, 136, 116, 22);
		panel.add(txtSueldo);
		txtSueldo.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(166, 164, 116, 22);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JButton btnAnadirCliente = new JButton("Modificar Trabajador");
		btnAnadirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					gestor.modificar_trabajador(txtDNI.getText(), txtNombre.getText(), txtApellidos.getText(),
							Double.parseDouble(txtSueldo.getText()), txtDireccion.getText());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnAnadirCliente.setBounds(145, 212, 153, 25);
		panel.add(btnAnadirCliente);
	}

}
