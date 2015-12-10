package Dominio;

public class Gestor_Borrar_Cliente extends Gestor_Cliente {
	
	public void borrar_cliente(String dni) throws Exception{
		Cliente_DAO clienteDAO = Cliente_DAO.getClienteDAO();
		clienteDAO.borrar(dni);
	}
}
