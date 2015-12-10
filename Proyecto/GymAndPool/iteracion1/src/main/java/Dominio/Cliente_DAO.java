package Dominio;

import java.sql.ResultSet;

import Persistencia.Agente_BD;

public class Cliente_DAO {
	private static Cliente_DAO clienteDAO;
	private static Agente_BD agenteBD;
	
	private Cliente_DAO()throws Exception{
		agenteBD= Agente_BD.getAgente();
	}
	
	public static Cliente_DAO getClienteDAO() throws Exception{
		if(clienteDAO==null)
			clienteDAO = new Cliente_DAO();
		return clienteDAO;
	}
	
	public void borrar (String dni) throws Exception{
		agenteBD.delete("DELETE FROM Clientes WHERE dni='"+dni+"';");
	}
	
	public void modificar(Cliente cliente) throws Exception{
		agenteBD.update("UPDATE Clientes SET nombre='"+cliente.getNombre()+"',apellidos='"+cliente.getApellidos() 
				+ "',telefono='" + cliente.getTelefono()+ "',direccion='" + cliente.getDireccion() + "',edad='" + cliente.getEdad() + 
				"'"+" WHERE dni='"+cliente.getDni()+"';");
	}
	
	public Cliente leer(String dni) throws Exception{
		ResultSet resultado = agenteBD.read("SELECT dni, nombre, apellidos, telefono, direccion, edad FROM clientes WHERE dni='"
				+dni+"';");
		resultado.next();
		Cliente cliente = new Cliente(resultado.getString("dni"), resultado.getString("nombre"), 
				resultado.getString("apellidos"), Long.parseLong(resultado.getString("telefono")), 
				resultado.getString("direccion"), Integer.parseInt(resultado.getString("edad")));
		return cliente;
	}
	
	public void anadir(Cliente cliente)throws Exception{
		agenteBD.create("INSERT INTO clientes(dni, nombre, apellidos, telefono, direccion, edad) VALUES('"+cliente.getDni()+"','"+cliente.getNombre()+"','"+cliente.getApellidos()+"','"
				+cliente.getTelefono()+"','"+cliente.getDireccion()+"','"+cliente.getEdad()+"');");
	}
}
