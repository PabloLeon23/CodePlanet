package Presentacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Dominio.Gestor_Trabajador;
import Dominio.Trabajador;


public class Formulario_Seleccionar_Trabajador {
	public JFrame frame;
	private JTextField txtDNI;
	private Gestor_Trabajador gestor;
	private JFrame padre;

	

	/**
	 * Create the application.
	 */
	public Formulario_Seleccionar_Trabajador(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor_Trabajador();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(121, 29, 56, 16);
		panel.add(lblDni);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(178, 26, 116, 22);
		panel.add(txtDNI);
		txtDNI.setColumns(10);
		
		JButton btnBuscarTrabajador = new JButton("Buscar Trabajador");
		btnBuscarTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Trabajador trabajador = gestor.visualizar_trabajador(txtDNI.getText());
					(new Formulario_Visualizar_Trabajador(padre, trabajador)).frameVisualizar.setVisible(true);
					frame.dispose();
					padre.setVisible(true);
					frame.dispose();
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBuscarTrabajador.setBounds(151, 87, 143, 25);
		panel.add(btnBuscarTrabajador);
	}
}
