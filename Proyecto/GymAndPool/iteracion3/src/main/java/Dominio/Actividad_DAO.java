package Dominio;

import java.sql.ResultSet;

import Persistencia.Agente_BD;

public class Actividad_DAO {
	private static Actividad_DAO ActividadDAO;
	private static Agente_BD agenteBD;
	
	private Actividad_DAO()throws Exception{
		agenteBD= Agente_BD.getAgente();
	}
	
	public static Actividad_DAO getActividadDAO() throws Exception{
		if(ActividadDAO==null)
			ActividadDAO = new Actividad_DAO();
		return ActividadDAO;
	}
	
	public void borrar (String nombre) throws Exception{
		agenteBD.delete("DELETE FROM Actividades WHERE nombre='"+nombre +"';");
	}
	
	public void modificar(Actividad actividad) throws Exception{
		agenteBD.update("UPDATE Actividades SET hora_inicio='"+actividad.getHora_inicio()+"',hora_fin='"+actividad.getHora_fin() 
				+ "',lugar='" + actividad.getLugar() + "',max_personas='" + actividad.getMax_personas() + 
				"' WHERE nombre='"+actividad.getNombre()+"';");
	}
	
	public Actividad leer(String nombre) throws Exception{
		ResultSet resultado = agenteBD.read("SELECT nombre, hora_inicio, hora_fin, lugar, max_personas FROM Actividades WHERE nombre='"
				+nombre+"';");
		
		Actividad actividad = new Actividad(resultado.getString(0), Integer.parseInt(resultado.getString(1)), 
				Integer.parseInt(resultado.getString(2)), resultado.getString(3),
				Integer.parseInt(resultado.getString(4)));
		return actividad;
	}
	
	public void anadir(Actividad actividad)throws Exception{
		agenteBD.create("INSERT INTO Actividades VALUES('"+actividad.getNombre()+"','"+actividad.getHora_inicio()+
				"','"+actividad.getHora_fin()+"','"+actividad.getLugar()+"','"+actividad.getMax_personas()+"');");
	}
}
