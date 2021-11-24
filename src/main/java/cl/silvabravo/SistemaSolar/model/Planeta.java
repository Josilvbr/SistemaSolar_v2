package cl.silvabravo.SistemaSolar.model;

import java.util.ArrayList;
import java.util.List;

import cl.silvabravo.SistemaSolar.interfaces.IPlaneta;

public class Planeta implements IPlaneta {
	private String nombre;
	private int tamano;
	private long distanciaAlSol;
	List<Luna> lunas= new ArrayList<Luna>();
	
	//BigInteger variable
	
	
	//Constructor sin parametros
	public Planeta() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Constructor con Paranmetros	
	public Planeta(String nombre, int tamano, long distanciaAlSol, List<Luna> lunas) {
		super();
		this.nombre = nombre;
		this.tamano = tamano;
		this.distanciaAlSol = distanciaAlSol;
		this.lunas = lunas;
	}


//Seters Geters

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTamano() {
		return tamano;
	}


	public void setTamano(int tamano) {
		this.tamano = tamano;
	}


	public long getDistanciaAlSol() {
		return distanciaAlSol;
	}


	public void setDistanciaAlSol(long distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}


	public List<Luna> getLunas() {
		return lunas;
	}


	public void setLunas(List<Luna> lunas) {
		this.lunas = lunas;
	}
	


	@Override
	public String toString() {
		return "\n- PLANETA [Nombre: " + nombre + "|| Tamaño (Diametro): " + tamano + "kms. || Distancia Al Sol: " + distanciaAlSol + "kms. ]";
	}


	
}
