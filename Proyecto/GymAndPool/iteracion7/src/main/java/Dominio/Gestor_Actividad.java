package Dominio;

import Dominio.Actividad;
import Dominio.Actividad_DAO;

public class Gestor_Actividad {
	public void anadir_actividad(String nombre, int hora_inicio, int hora_fin, String lugar, int max_personas) throws Exception{
		Gestor_Actividad gestor = new Gestor_Actividad();
		gestor.anadir_actividad(nombre, hora_inicio, hora_fin, lugar, max_personas);
	}
	
	public void modificar_actividad(String nombre, int hora_inicio, int hora_fin, String lugar, int max_personas) throws Exception{
		Actividad act = new Actividad(nombre, hora_inicio, hora_fin, lugar, max_personas);
		Actividad_DAO actividad_dao = Actividad_DAO.getActividadDAO();
		actividad_dao.modificar(act);
	}
}
