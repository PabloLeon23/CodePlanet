package Dominio;

public class Gestor_Cliente {
	public void anadir_cliente(String dni, String nombre, String apellidos, long telefono, String direccion, int edad) throws Exception{
		Cliente cliente = new Cliente(dni, nombre, apellidos, telefono, direccion, edad);
		Cliente_DAO clienteDAO = Cliente_DAO.getClienteDAO();
		clienteDAO.anadir(cliente);
	}
}
