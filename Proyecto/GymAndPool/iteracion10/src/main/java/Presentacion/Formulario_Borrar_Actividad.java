package Presentacion;


import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Dominio.Gestor_Actividad;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario_Borrar_Actividad {

	public JFrame frame;
	private JTextField textNombre;
	private Gestor_Actividad gestor;
	private JFrame padre;

	public Formulario_Borrar_Actividad(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor_Actividad();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(85, 96, 56, 16);
		panel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(153, 93, 142, 22);
		panel.add(textNombre);
		textNombre.setColumns(10);
		
		JButton btnBorrarActividad = new JButton("Borrar Actividad");
		btnBorrarActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre = textNombre.getText();
				try {
					gestor.borrar_actividad(nombre);
					padre.setVisible(true);
					frame.dispose();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBorrarActividad.setBounds(153, 148, 142, 25);
		panel.add(btnBorrarActividad);
	}
}
