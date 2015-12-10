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

public class Formulario_Anadir_Actividad {

	public JFrame frame;
	private JTextField txtNombre;
	private JTextField txtHora_inicio;
	private JTextField txtHora_fin;
	private JTextField txtLugar;
	private JTextField txtMax_personas;
	private Gestor_Actividad gestor;
	private JFrame padre;


	public Formulario_Anadir_Actividad(JFrame padre) {
		this.padre = padre;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		gestor = new Gestor_Actividad();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 457, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(53, 52, 56, 16);
		panel.add(lblNombre);
		
		JLabel lblHora_inicio = new JLabel("Hora inicio:");
		lblHora_inicio.setBounds(53, 81, 70, 16);
		panel.add(lblHora_inicio);
		
		JLabel lblHora_fin = new JLabel("Hora_fin");
		lblHora_fin.setBounds(53, 110, 56, 16);
		panel.add(lblHora_fin);
		
		JLabel lblLugar = new JLabel("Lugar:");
		lblLugar.setBounds(53, 139, 56, 16);
		panel.add(lblLugar);
		
		JLabel lblMax_personas = new JLabel("Max. personas:");
		lblMax_personas.setBounds(53, 168, 88, 16);
		panel.add(lblMax_personas);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(166, 49, 116, 22);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtHora_inicio = new JTextField();
		txtHora_inicio.setBounds(166, 78, 116, 22);
		panel.add(txtHora_inicio);
		txtHora_inicio.setColumns(10);
		
		txtHora_fin = new JTextField();
		txtHora_fin.setBounds(166, 107, 116, 22);
		panel.add(txtHora_fin);
		txtHora_fin.setColumns(10);
		
		txtLugar = new JTextField();
		txtLugar.setBounds(166, 136, 116, 22);
		panel.add(txtLugar);
		txtLugar.setColumns(10);
		
		txtMax_personas = new JTextField();
		txtMax_personas.setBounds(166, 164, 116, 22);
		panel.add(txtMax_personas);
		txtMax_personas.setColumns(10);
		
		JButton btnAnadirActividad = new JButton("A\u00F1adir Actividad");
		btnAnadirActividad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					gestor.anadir_actividad(txtNombre.getText(), Integer.parseInt(txtHora_inicio.getText()), 
							Integer.parseInt(txtHora_fin.getText()),txtLugar.getText(), Integer.parseInt(txtMax_personas.getText()));
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
		btnAnadirActividad.setBounds(145, 212, 137, 25);
		panel.add(btnAnadirActividad);
	}

}



