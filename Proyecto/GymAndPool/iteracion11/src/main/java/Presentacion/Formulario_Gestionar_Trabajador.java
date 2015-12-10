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


public class Formulario_Gestionar_Trabajador {

	public JFrame frame;
	private JFrame padre;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Formulario_Gestionar_Trabajador(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				padre.setVisible(true);
				frame.dispose();
			}
		});
		frame.setBounds(100, 100, 429, 392);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAnadirTrabajador = new JButton("A\u00F1adir Trabajador");
		btnAnadirTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Anadir_Trabajador(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnAnadirTrabajador.setBounds(128, 83, 162, 25);
		frame.getContentPane().add(btnAnadirTrabajador);
		
		JButton btnModificarTrabajador = new JButton("Modificar Trabajador");
		btnModificarTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Modificar_Trabajador()).frame.setVisible(true);
				frame.setVisible(false);
	
			}
		});
		btnModificarTrabajador.setBounds(128, 123, 162, 25);
		frame.getContentPane().add(btnModificarTrabajador);
		
		JButton btnVisualizarTrabajador = new JButton("Visualizar Trabajador");
		btnVisualizarTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Seleccionar_Trabajador(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnVisualizarTrabajador.setBounds(128, 161, 162, 25);
		frame.getContentPane().add(btnVisualizarTrabajador);
		
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
