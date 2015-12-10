package Dominio;

import Dominio.Cliente;
import Dominio.Cliente_DAO;
import Dominio.Gestor_Cliente;

public class Gestor_Cliente{
	public void anadir_cliente(String dni, String nombre, String apellidos, long telefono, String direccion, int edad) throws Exception{
		Gestor_Cliente gestor = new Gestor_Cliente();
		gestor.anadir_cliente(dni, nombre, apellidos, telefono, direccion, edad);
	}
	
	public Cliente visualizar_cliente(String dni) throws Exception{
		Cliente_DAO clienteDAO = Cliente_DAO.getClienteDAO();
		Cliente cliente = clienteDAO.leer(dni);
		return cliente;
	}
}
