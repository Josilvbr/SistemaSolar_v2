package cl.silvabravo.SistemaSolar.interfaces;

import java.util.List;

import cl.silvabravo.SistemaSolar.model.Luna;

public interface IPlaneta {
	public String getNombre();
	public void setNombre(String nombre);
	public int getTamano();
	public void setTamano(int tamano);
	public long getDistanciaAlSol();
	public void setDistanciaAlSol(long distanciaAlSol);
	public List<Luna> getLunas();
	public void setLunas(List<Luna> lunas);
}
