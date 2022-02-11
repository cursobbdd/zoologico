package es.elorrietaErrekamari.curso.bbdd.pojo;

public class Especie {

	private int idEspecie = 0;
	private String nombreVulgar = null;
	private String nombreCientifico = null;
	private boolean extincion = false;
	
	
	public int getIdEspecie() {
		return idEspecie;
	}
	public void setIdEspecie(int idEspecie) {
		this.idEspecie = idEspecie;
	}
	public String getNombreVulgar() {
		return nombreVulgar;
	}
	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public boolean isExtincion() {
		return extincion;
	}
	public void setExtincion(boolean extincion) {
		this.extincion = extincion;
	}
	
	
	
}
