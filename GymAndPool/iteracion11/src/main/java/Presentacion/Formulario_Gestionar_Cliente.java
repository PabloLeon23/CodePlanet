package Presentacion;


import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Formulario_Gestionar_Cliente {

	public JFrame frame;
	private JFrame padre;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Formulario_Gestionar_Cliente(JFrame padre) {
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
		
		JButton btnAadirCliente = new JButton("A\u00F1adir Cliente");
		btnAadirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Anadir_Cliente(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnAadirCliente.setBounds(142, 83, 134, 25);
		frame.getContentPane().add(btnAadirCliente);
		
		JButton btnModificarCliente = new JButton("Modificar Cliente");
		btnModificarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Modificar_Cliente(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnModificarCliente.setBounds(142, 123, 134, 25);
		frame.getContentPane().add(btnModificarCliente);
		
		JButton btnVisualizarCliente = new JButton("Visualizar Cliente");
		btnVisualizarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Seleccionar_Cliente(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnVisualizarCliente.setBounds(142, 161, 134, 25);
		frame.getContentPane().add(btnVisualizarCliente);
		
		JButton btnBorrarCliente = new JButton("Borrar Cliente");
		btnBorrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Borrar_Cliente(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnBorrarCliente.setBounds(142, 199, 134, 25);
		frame.getContentPane().add(btnBorrarCliente);
		
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
