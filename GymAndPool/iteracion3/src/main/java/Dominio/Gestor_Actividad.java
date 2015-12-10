package Dominio;

public class Gestor_Actividad {
	public void anadir_actividad(String nombre, int hora_inicio, int hora_fin, String lugar, int max_personas) throws Exception{
		Actividad actividad = new Actividad(nombre, hora_inicio, hora_fin, lugar, max_personas);
		Actividad_DAO actividadDAO = Actividad_DAO.getActividadDAO();
		actividadDAO.anadir(actividad);
	}
}
