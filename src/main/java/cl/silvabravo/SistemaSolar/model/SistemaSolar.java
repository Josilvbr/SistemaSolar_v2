package cl.silvabravo.SistemaSolar.model;

import java.util.ArrayList;

import java.util.List;

public class SistemaSolar {
	private List<Planeta> planetas = new ArrayList<Planeta>();

	
	//getters setter
	public List<Planeta> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(List<Planeta> planetas) {
		this.planetas = planetas;
	}

	
	// Metodos
	public void mostarPlanetas() {
		for (Planeta planeta : planetas) {
			System.out.println(planeta.toString());
		}
	}

	public void mostrarPlanetasConLunas() {
		for (int i = 0; i < planetas.size(); i++) {
			System.out.println(planetas.get(i).toString()); //se recorren los planetas y se imprimen
			for (int x = 0; x < planetas.get(i).getLunas().size(); x++) {
				System.out.println(planetas.get(i).getLunas().get(x).toString()); // recorren las lunas dentro del arreglo de lunas y se imprimen
			}
		}
 
	}

}
