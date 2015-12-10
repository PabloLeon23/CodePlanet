package Presentacion;


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Dominio.Gestor_Borrar_Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario_Borrar_Cliente {


	public JFrame frame;
	private JTextField txtDNI;
	private Gestor_Borrar_Cliente gestor;
	private JFrame padre;

	public Formulario_Borrar_Cliente(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor_Borrar_Cliente();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDNI = new JLabel("DNI:");
		lblDNI.setBounds(108, 93, 56, 16);
		panel.add(lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(176, 90, 116, 22);
		panel.add(txtDNI);
		txtDNI.setColumns(10);
		
		JButton btnBorrarCliente = new JButton("Borrar Cliente");
		btnBorrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String dni = txtDNI.getText();
				try {
					gestor.borrar_cliente(dni);
					padre.setVisible(true);
					frame.dispose();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBorrarCliente.setBounds(166, 147, 126, 25);
		panel.add(btnBorrarCliente);
	}
}

