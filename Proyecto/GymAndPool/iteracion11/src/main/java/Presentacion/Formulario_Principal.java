package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario_Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_Principal window = new Formulario_Principal();
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
	public Formulario_Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnGestionarClientes = new JButton("Gestionar Clientes");
		btnGestionarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				(new Formulario_Gestionar_Cliente(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnGestionarClientes.setBounds(142, 61, 167, 25);
		panel.add(btnGestionarClientes);
		
		JButton btnGestionarTrabajadores = new JButton("Gestionar Trabajadores");
		btnGestionarTrabajadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Gestionar_Trabajador(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnGestionarTrabajadores.setBounds(142, 99, 167, 25);
		panel.add(btnGestionarTrabajadores);
		
		JButton btnGestionarActividades = new JButton("Gestionar Actividades");
		btnGestionarActividades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new Formulario_Gestionar_Actividad(frame)).frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnGestionarActividades.setBounds(142, 137, 167, 25);
		panel.add(btnGestionarActividades);
	}
}
