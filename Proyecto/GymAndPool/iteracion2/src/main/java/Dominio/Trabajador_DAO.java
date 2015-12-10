package Dominio;

import java.sql.ResultSet;

import Persistencia.Agente_BD;

public class Trabajador_DAO {
	private static Trabajador_DAO TrabajadorDAO;
	private static Agente_BD agenteBD;
	
	private Trabajador_DAO()throws Exception{
		agenteBD= Agente_BD.getAgente();
	}
	
	public static Trabajador_DAO getTrabajadorDAO() throws Exception{
		if(TrabajadorDAO==null)
			TrabajadorDAO = new Trabajador_DAO();
		return TrabajadorDAO;
	}
	
	public void borrar (Trabajador trabajador) throws Exception{
		agenteBD.delete("DELETE FROM Trabajadores WHERE dni='"+trabajador.getDni()+"';");
	}
	
	public void modificar(Trabajador trabajador) throws Exception{
		agenteBD.update("UPDATE Trabajadores SET nombre='"+trabajador.getNombre()+"',apellidos='"+trabajador.getApellidos() 
				+ "',sueldo='" + Double.parseDouble(trabajador.getDireccion()) + "',direccion='" + trabajador.getDireccion() + 
				"'"+" WHERE dni='"+trabajador.getDni()+"';");
	}
	
	public Trabajador leer(String dni) throws Exception{
		ResultSet resultado = agenteBD.read("SELECT dni, nombre, apellidos, sueldo, direccion FROM Trabajadores WHERE dni='"
				+dni+"';");
		resultado.next();
		Trabajador trabajador = new Trabajador(resultado.getString("dni"), resultado.getString("nombre"), resultado.getString("apellidos"), 
				Double.parseDouble(resultado.getString("sueldo")), resultado.getString("direccion"));
		return trabajador;
	}
	
	public void anadir(Trabajador trabajador)throws Exception{
		agenteBD.create("INSERT INTO Trabajadores VALUES('"+trabajador.getDni()+"','"+trabajador.getNombre()+"','"+trabajador.getApellidos()+"','"
				+trabajador.getSueldo()+"','"+trabajador.getDireccion()+"');");
	}
}
