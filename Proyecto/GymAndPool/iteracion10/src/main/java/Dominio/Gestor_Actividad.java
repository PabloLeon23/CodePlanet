package Dominio;

public class Gestor_Actividad {
	public void anadir_actividad(String nombre, int hora_inicio, int hora_fin, String lugar, int max_personas) throws Exception{
		Gestor_Actividad gestor = new Gestor_Actividad();
		gestor.anadir_actividad(nombre, hora_inicio, hora_fin, lugar, max_personas);
	}
	
	public void modificar_actividad(String nombre, int hora_inicio, int hora_fin, String lugar, int max_personas) throws Exception{
		Gestor_Actividad gestor = new Gestor_Actividad();
		gestor.modificar_actividad(nombre, hora_inicio, hora_fin, lugar, max_personas);
	}
	
	public void borrar_actividad(String nombre) throws Exception{
		Actividad_DAO actividadDAO = Actividad_DAO.getActividadDAO();
		actividadDAO.borrar(nombre);
	}
}
