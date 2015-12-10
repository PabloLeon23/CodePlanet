package Presentacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Dominio.Gestor_Cliente;



public class Formulario_Modificar_Cliente {

	public JFrame frame;
	private JTextField txtDNI;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private Gestor_Cliente gestor;
	private JFrame padre;

	public Formulario_Modificar_Cliente(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor_Cliente();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 486, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(71, 80, 56, 16);
		panel.add(lblDni);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(71, 109, 56, 16);
		panel.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(71, 138, 56, 16);
		panel.add(lblApellidos);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(71, 167, 56, 16);
		panel.add(lblTelfono);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(71, 196, 70, 16);
		panel.add(lblDireccin);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(71, 225, 56, 16);
		panel.add(lblEdad);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(166, 77, 116, 22);
		panel.add(txtDNI);
		txtDNI.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(166, 106, 116, 22);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(166, 222, 116, 22);
		panel.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(166, 135, 116, 22);
		panel.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(166, 164, 116, 22);
		panel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(166, 193, 116, 22);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JButton btnModificarCliente = new JButton("Modificar");
		btnModificarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					gestor.modificar_cliente(txtDNI.getText(), txtNombre.getText(), txtApellidos.getText(),
							Long.parseLong(txtTelefono.getText()), txtDireccion.getText(), Integer.parseInt(txtEdad.getText()));
					padre.setVisible(true);
					frame.dispose();
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnModificarCliente.setBounds(171, 282, 97, 25);
		panel.add(btnModificarCliente);
	}

}
