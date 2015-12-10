package Presentacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Dominio.Cliente;

public class Formulario_Visualizar_Cliente {

	public JFrame frameVisualizar;
	private Cliente cliente;
	private JFrame padre;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Formulario_Visualizar_Cliente(JFrame padre, Cliente c) {
		cliente = c;
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frameVisualizar = new JFrame();
		frameVisualizar.setBounds(100, 100, 476, 365);
		frameVisualizar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frameVisualizar.getContentPane().add(panel, BorderLayout.CENTER);
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
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				padre.setVisible(true);
				frameVisualizar.dispose();
			}
		});
		btnVolver.setBounds(337, 280, 97, 25);
		panel.add(btnVolver);
		
		JLabel lblDNIv = new JLabel("New label");
		lblDNIv.setBounds(199, 80, 56, 16);
		panel.add(lblDNIv);
		lblDNIv.setText(cliente.getDni());
		
		JLabel lblNombrev = new JLabel("");
		lblNombrev.setBounds(199, 109, 56, 16);
		panel.add(lblNombrev);
		lblNombrev.setText(cliente.getNombre());
		
		JLabel lblApellidosv = new JLabel("");
		lblApellidosv.setBounds(199, 138, 56, 16);
		panel.add(lblApellidosv);
		lblApellidosv.setText(cliente.getApellidos());
		
		JLabel lblTelefonov = new JLabel("");
		lblTelefonov.setBounds(199, 167, 56, 16);
		lblTelefonov.setText(String.valueOf(cliente.getTelefono()));
		panel.add(lblTelefonov);
		
		JLabel lblDireccionv = new JLabel("");
		lblDireccionv.setBounds(199, 196, 56, 16);
		lblDireccionv.setText(cliente.getDireccion());
		panel.add(lblDireccionv);
		
		JLabel lblEdadv = new JLabel("");
		lblEdadv.setBounds(199, 225, 56, 16);
		lblEdadv.setText(String.valueOf(cliente.getEdad()));
		panel.add(lblEdadv);
	}
}

