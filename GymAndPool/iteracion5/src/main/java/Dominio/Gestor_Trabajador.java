package Dominio;

public class Gestor_Trabajador {
	public void anadir_trabajador(String dni, String nombre, String apellidos,
			double sueldo, String direccion) throws Exception{
		Gestor_Trabajador gestor = new Gestor_Trabajador();
		gestor.anadir_trabajador(dni, nombre, apellidos, sueldo, direccion);
	}
	
	public Trabajador visualizar_trabajador(String dni) throws Exception{
		Trabajador_DAO trabajadorDAO = Trabajador_DAO.getTrabajadorDAO();
		Trabajador trabajador = trabajadorDAO.leer(dni);
		return trabajador;
	}
}
