package Dominio;

public class Actividad {
	private String nombre;
	private int hora_inicio;
	private int hora_fin;
	private String lugar;
	private int max_personas;
	
	public Actividad(String nombre, int hora_inicio, int hora_fin,
			String lugar, int max_personas) {
		this.nombre = nombre;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.lugar = lugar;
		this.max_personas = max_personas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHora_inicio() {
		return hora_inicio;
	}
	public void setHora_inicio(int hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	public int getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(int hora_fin) {
		this.hora_fin = hora_fin;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getMax_personas() {
		return max_personas;
	}
	public void setMax_personas(int max_personas) {
		this.max_personas = max_personas;
	}
}
