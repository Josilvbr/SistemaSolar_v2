package cl.ATorresGa.SistemaSolar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

import cl.silvabravo.SistemaSolar.interfaces.ILuna;
import cl.silvabravo.SistemaSolar.interfaces.IPlaneta;
import cl.silvabravo.SistemaSolar.model.Luna;
import cl.silvabravo.SistemaSolar.model.Planeta;

@ContextConfiguration
public class SistemaSolarTest {
	static ILuna luna = new Luna();
	static List<Luna> lunas = new ArrayList<Luna>();
	static IPlaneta planeta = new Planeta();

	@BeforeAll
	public static void seteo() {
		luna.setNombre("LunaDeTierra");
		luna.setDiametro(1737);
		luna.setTiempoOrbita(27);
		lunas.add((Luna) luna);
		planeta.setNombre("Tierra");
		planeta.setTamano(6371);
		planeta.setLunas(lunas);
		planeta.setDistanciaAlSol(150);
	}

	@Test
	public void pruebaCreacionPlaneta() {
		assertTrue(planeta.getNombre().equals("Tierra"));

	}

	@Test
	public void pruebaLunas() {
		assertTrue(planeta.getLunas().get(0).getNombre().equals("LunaDeTierra"));
	}

	@Test
	public void pruebaCantidadLunas() {
		assertEquals(1, planeta.getLunas().size());
	}

	@Test
	public void notNull() {
		assertNotNull(planeta.getNombre());
		assertNotNull(planeta.getLunas().get(0).getNombre());
	}
}
