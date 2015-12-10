package Presentacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Dominio.Gestor_Actividad;


public class Formulario_Modificar_Actividad {

	public JFrame frame;
	private JTextField txtNombre;
	private JTextField txtHora_inicio;
	private JTextField txtHora_fin;
	private JTextField txtLugar;
	private JTextField txtMax_personas;
	private Gestor_Actividad gestor;
	private JFrame padre;


	public Formulario_Modificar_Actividad(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor_Actividad();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 486, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(71, 80, 70, 16);
		panel.add(lblNombre);
		
		JLabel lblHora_inicio = new JLabel("Hora inicio:");
		lblHora_inicio.setBounds(71, 109, 70, 16);
		panel.add(lblHora_inicio);
		
		JLabel lblHora_fin = new JLabel("Hora fin:");
		lblHora_fin.setBounds(71, 138, 56, 16);
		panel.add(lblHora_fin);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setBounds(71, 167, 56, 16);
		panel.add(lblLugar);
		
		JLabel lblMax_personas = new JLabel("Max. personas:");
		lblMax_personas.setBounds(71, 196, 98, 16);
		panel.add(lblMax_personas);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(190, 77, 116, 22);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtHora_inicio = new JTextField();
		txtHora_inicio.setBounds(190, 106, 116, 22);
		panel.add(txtHora_inicio);
		txtHora_inicio.setColumns(10);
		
		txtHora_fin = new JTextField();
		txtHora_fin.setBounds(190, 135, 116, 22);
		panel.add(txtHora_fin);
		txtHora_fin.setColumns(10);
		
		txtLugar = new JTextField();
		txtLugar.setBounds(190, 164, 116, 22);
		panel.add(txtLugar);
		txtLugar.setColumns(10);
		
		txtMax_personas = new JTextField();
		txtMax_personas.setBounds(190, 193, 116, 22);
		panel.add(txtMax_personas);
		txtMax_personas.setColumns(10);
		
		JButton btnModificarCliente = new JButton("Modificar");
		btnModificarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					gestor.modificar_actividad(txtNombre.getText(), Integer.parseInt(txtHora_inicio.getText()), 
							Integer.parseInt(txtHora_fin.getText()), txtLugar.getText(), Integer.parseInt(txtMax_personas.getText()));
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
		btnModificarCliente.setBounds(172, 261, 97, 25);
		panel.add(btnModificarCliente);
	}

}

