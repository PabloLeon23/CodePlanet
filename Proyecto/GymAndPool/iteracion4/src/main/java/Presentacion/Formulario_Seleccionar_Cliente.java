package Presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Dominio.Cliente;
import Dominio.Gestor_Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario_Seleccionar_Cliente {

	public JFrame frame;
	private JTextField txtDNI;
	private Gestor_Cliente gestor;
	private JFrame padre;


	public Formulario_Seleccionar_Cliente(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor_Cliente();
		
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
		
		JButton btnBuscarCliente = new JButton("Buscar Cliente");
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Cliente cliente = gestor.visualizar_cliente(txtDNI.getText());
					(new Formulario_Visualizar_Cliente(padre, cliente)).frameVisualizar.setVisible(true);
					padre.setVisible(true);
					frame.dispose();
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBuscarCliente.setBounds(151, 87, 143, 25);
		panel.add(btnBuscarCliente);
	}
}
