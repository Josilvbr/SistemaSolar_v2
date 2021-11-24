package cl.silvabravo.SistemaSolar;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.silvabravo.SistemaSolar.model.Luna;
import cl.silvabravo.SistemaSolar.model.Planeta;
import cl.silvabravo.SistemaSolar.model.SistemaSolar;

@SpringBootApplication
public class SistemaSolarApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SistemaSolarApplication.class, args);

		// Se Instancia el Sistema Solar
		SistemaSolar sistemaSolar = new SistemaSolar();

		// Se Instancian los Planetas
		List<Planeta> planetas = new ArrayList<>();

		// Se Instancian las lunas de Planeta Tierra

		// INFO LUNAS: Nombre, Diametro, TiempoOrbita
		// INFO PLANETA: Nombre, Tamaño, DistanciaSol, Lunas

		// MERCURIO
		List<Luna> listaLunasMercurio = new ArrayList<Luna>();
		//Luna lunaMercurio01 = new Luna("Cero", 0, 0);
		//listaLunasMercurio.add(lunaMercurio01);
		Planeta mercurio = new Planeta("Mercurio", 4880, 57910000, listaLunasMercurio);
		planetas.add(mercurio);
		
		System.out.printf("El planeta %s, está a %d kms. del Sol. Su tamaño es de %d kilometros de diametro y tiene %d lunas.\n"
				,mercurio.getNombre(), mercurio.getDistanciaAlSol(), mercurio.getTamano(), mercurio.getLunas().size());
		System.out.println("");

		// VENUS
		List<Luna> listaLunasVenus = new ArrayList<Luna>();
		//Luna lunaVenus01 = new Luna("0", 0, 0);
		//listaLunasVenus.add(lunaVenus01);
		Planeta venus = new Planeta("Venus", 12104, 108200000, listaLunasVenus);
		planetas.add(venus);
		
		System.out.printf("El planeta %s, está a %d kms. del Sol. Su tamaño es de %d kilometros de diametro y tiene %d lunas.\n"
				,venus.getNombre(), venus.getDistanciaAlSol(), venus.getTamano(), venus.getLunas().size());
		System.out.println("");
		// TIERRA
		List<Luna> listaLunasTierra = new ArrayList<Luna>();
		Luna lunaTierra01 = new Luna("Luna", 3476, 27);
		listaLunasTierra.add(lunaTierra01);
		Planeta tierra = new Planeta("Tierra", 12756, 149600000, listaLunasTierra);
		planetas.add(tierra);
		
		System.out.printf("El planeta %s, está a %d kms. del Sol. Su tamaño es de %d kilometros de diametro y tiene %d lunas.\n"
				+ "Su luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				,tierra.getNombre(), tierra.getDistanciaAlSol(), tierra.getTamano(), tierra.getLunas().size(), tierra.getLunas().get(0).getNombre(), tierra.getLunas().get(0).getDiametro(), tierra.getLunas().get(0).getTiempoOrbita());
		System.out.println("");
		
		
		
		// MARTE
		List<Luna> listaLunasMarte = new ArrayList<Luna>();
		Luna lunaMarte01 = new Luna("Phobos", 28, 0);
		Luna lunaMarte02 = new Luna("Deimos", 8, 1);
		listaLunasMarte.add(lunaMarte01);
		listaLunasMarte.add(lunaMarte02);
		Planeta marte = new Planeta("Marte", 6794, 227940000, listaLunasMarte);
		planetas.add(marte);
		
		System.out.printf("El planeta %s, está a %d kms. del Sol. Su tamaño es de %d kilometros de diametro y tiene %d lunas.\n"
				+ "Su primera luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d,3 dias.\n"
				+ "Su segunda luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dia.\n"
				,marte.getNombre(), marte.getDistanciaAlSol(), marte.getTamano(), marte.getLunas().size(), marte.getLunas().get(0).getNombre(), marte.getLunas().get(0).getDiametro(), marte.getLunas().get(0).getTiempoOrbita(),    marte.getLunas().get(1).getNombre(), marte.getLunas().get(1).getDiametro(), marte.getLunas().get(1).getTiempoOrbita());
		System.out.println("");
		
		
		
		// JUPITER
		List<Luna> listaLunasJupiter = new ArrayList<Luna>();
		Luna lunaJupiter01 = new Luna("Ganymede", 5276, 7155);
		Luna lunaJupiter02 = new Luna("Callisto", 4800, 16689);
		listaLunasJupiter.add(lunaJupiter01);
		listaLunasJupiter.add(lunaJupiter02);
		Planeta jupiter = new Planeta("Jupiter", 142984, 778330000, listaLunasJupiter);
		planetas.add(jupiter);
		
		System.out.printf("El planeta %s, está a %d kms. del Sol. Su tamaño es de %d kilometros de diametro y tiene %d lunas.\n"
				+ "Su primera luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				+ "Su segunda luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				,jupiter.getNombre(), jupiter.getDistanciaAlSol(), jupiter.getTamano(), jupiter.getLunas().size(), jupiter.getLunas().get(0).getNombre(), jupiter.getLunas().get(0).getDiametro(), jupiter.getLunas().get(0).getTiempoOrbita(),    jupiter.getLunas().get(1).getNombre(), jupiter.getLunas().get(1).getDiametro(), jupiter.getLunas().get(1).getTiempoOrbita());
		System.out.println("");
		
		
		// SATURNO
		List<Luna> listaLunasSaturno = new ArrayList<Luna>();
		Luna lunaSaturno01 = new Luna("Titan", 5150, 15945);
		Luna lunaSaturno02 = new Luna("Iapetus", 1436, 79321);
		listaLunasSaturno.add(lunaSaturno01);
		listaLunasSaturno.add(lunaSaturno02);
		Planeta saturno = new Planeta("Saturno", 108728, 1429400000, listaLunasSaturno);
		planetas.add(saturno);
		System.out.printf("El planeta %s, está a %d kms. del Sol. Su tamaño es de %d kilometros de diametro y tiene %d lunas.\n"
				+ "Su primera luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				+ "Su segunda luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				,saturno.getNombre(), saturno.getDistanciaAlSol(), saturno.getTamano(), saturno.getLunas().size(), saturno.getLunas().get(0).getNombre(), saturno.getLunas().get(0).getDiametro(), saturno.getLunas().get(0).getTiempoOrbita(),    saturno.getLunas().get(1).getNombre(), saturno.getLunas().get(1).getDiametro(), saturno.getLunas().get(1).getTiempoOrbita());
		System.out.println("");
		
		// URANO
		List<Luna> listaLunasUrano = new ArrayList<Luna>();
		Luna lunaUrano01 = new Luna("Oberon", 1526, 13463);
		Luna lunaUrano02 = new Luna("Titania", 1580, 8706);
		listaLunasUrano.add(lunaUrano01);
		listaLunasUrano.add(lunaUrano02);
		Planeta urano = new Planeta("Urano", 51118, 2870990, listaLunasUrano);
		planetas.add(urano);

		System.out.printf("El planeta %s, está a %d kms. del Sol. Su tamaño es de %d kilometros de diametro y tiene %d lunas.\n"
				+ "Su primera luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				+ "Su segunda luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				,urano.getNombre(), urano.getDistanciaAlSol(), urano.getTamano(), urano.getLunas().size(), urano.getLunas().get(0).getNombre(), urano.getLunas().get(0).getDiametro(), urano.getLunas().get(0).getTiempoOrbita(),    urano.getLunas().get(1).getNombre(), urano.getLunas().get(1).getDiametro(), urano.getLunas().get(1).getTiempoOrbita());
		System.out.println("");

		
		// NEPTUNO
		List<Luna> listaLunasNeptuno = new ArrayList<Luna>();
		Luna lunaNeptuno01 = new Luna("Triton", 2705, 5877);
		Luna lunaNeptuno02 = new Luna("Proteus", 420, 112);
		listaLunasNeptuno.add(lunaNeptuno01);
		listaLunasNeptuno.add(lunaNeptuno02);
		Planeta neptuno = new Planeta("Neptuno", 49532, 4504300, listaLunasNeptuno);
		planetas.add(neptuno);
		
		System.out.printf("El planeta %s, está a %d kms. del Sol. Su tamaño es de %d kilometros de diametro y tiene %d lunas.\n"
				+ "Su primera luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				+ "Su segunda luna se llama: '%s' y mide %d kilometros de diametro. Su tiempo de orbita es de: %d dias.\n"
				,neptuno.getNombre(), neptuno.getDistanciaAlSol(), neptuno.getTamano(), neptuno.getLunas().size(), neptuno.getLunas().get(0).getNombre(), neptuno.getLunas().get(0).getDiametro(), neptuno.getLunas().get(0).getTiempoOrbita(),    neptuno.getLunas().get(1).getNombre(), neptuno.getLunas().get(1).getDiametro(), neptuno.getLunas().get(1).getTiempoOrbita());
		System.out.println("");
		
		sistemaSolar.setPlanetas(planetas);
//		sistemaSolar.mostarPlanetas();
		System.out.println("");
		System.out.println("*********************************************************");
		sistemaSolar.mostrarPlanetasConLunas();

	}

}
