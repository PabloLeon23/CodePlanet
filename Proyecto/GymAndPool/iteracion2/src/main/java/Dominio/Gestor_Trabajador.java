package Dominio;

public class Gestor_Trabajador {
	public void anadir_trabajador(String dni, String nombre, String apellidos, double sueldo, String direccion) throws Exception{
		Trabajador trabajador = new Trabajador(dni, nombre, apellidos, sueldo, direccion);
		Trabajador_DAO trabajadorDAO = Trabajador_DAO.getTrabajadorDAO();
		trabajadorDAO.anadir(trabajador);
	}
}
