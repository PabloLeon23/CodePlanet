package Presentacion;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Presentacion.Formulario_Seleccionar_Trabajador;
import Presentacion.Formulario_Modificar_Trabajador;
import Presentacion.Formulario_Anadir_Trabajador;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Formulario_Gestionar_Actividad {

	public JFrame frame;
	private JFrame padre;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Formulario_Gestionar_Actividad(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 429, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAnadirActividad = new JButton("A\u00F1adir Actividad");
		btnAnadirActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Anadir_Actividad(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnAnadirActividad.setBounds(128, 83, 162, 25);
		frame.getContentPane().add(btnAnadirActividad);
		
		JButton btnModificarActividad = new JButton("Modificar Actividad");
		btnModificarActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Modificar_Actividad(frame)).frame.setVisible(true);
				frame.setVisible(false);
	
			}
		});
		btnModificarActividad.setBounds(128, 123, 162, 25);
		frame.getContentPane().add(btnModificarActividad);
		
		JButton btnBorrarActividad = new JButton("Borrar Actividad");
		btnBorrarActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Borrar_Actividad(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnBorrarActividad.setBounds(128, 161, 162, 25);
		frame.getContentPane().add(btnBorrarActividad);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				padre.setVisible(true);
			}
		});
		btnVolver.setBounds(302, 307, 97, 25);
		frame.getContentPane().add(btnVolver);
	}
}
