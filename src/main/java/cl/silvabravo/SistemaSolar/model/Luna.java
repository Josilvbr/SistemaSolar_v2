package cl.silvabravo.SistemaSolar.model;

import cl.silvabravo.SistemaSolar.interfaces.ILuna;

public class Luna implements ILuna{
	private String nombre;
	private int diametro;
	private int tiempoOrbita;
	
	
	//Constructor Sin parametros
	public Luna() {
		// TODO Auto-generated constructor stub
	}
	
	//Constructor con Parametros
	
	public Luna(String nombre, int diametro, int tiempoOrbita) {
		super();
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoOrbita = tiempoOrbita;
	}

//Seters getters

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public int getTiempoOrbita() {
		return tiempoOrbita;
	}
	public void setTiempoOrbita(int tiempoOrbita) {
		this.tiempoOrbita = tiempoOrbita;
	}
	@Override
	public String toString() {
		return "   LUNA [Nombre: " + nombre + "|| Diametro: " + diametro + "|| Tiempo Orbita: " + tiempoOrbita + " dias ]";
	}
	
	
}
