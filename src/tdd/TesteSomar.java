package tdd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteSomar {

	private Calculadora calculadora;

	@Before
	public void configurar() throws Exception {
		calculadora = new Calculadora();
	}

	@Test
	public void somarDoisMaisDois() throws Exception {
		assertEquals(4, calculadora.somar(2, 2));
	}

	@Test
	public void somarTresMaisTres() throws Exception {
		assertEquals(6, calculadora.somar(3, 3));
	}

	@Test
	public void subtrairUmMenosUm() throws Exception {
		assertEquals(0, calculadora.subtrair(1, 1));
	}

	@Test
	public void subtrairUmMenosDois() throws Exception {
		assertEquals(-1, calculadora.subtrair(1, 2));
	}

	@Test
	public void somarResultadoDaSomaAnteriorQuatroMaisDois() throws Exception {
		calculadora.somar(2, 2);
		assertEquals(6, calculadora.somar(2));
	}

	@Test
	public void somarResultadoDaSomaAnteriorDoisMaisDois() throws Exception {
		calculadora.somar(1, 1);
		assertEquals(4, calculadora.somar(2));
	}

	@Test
	public void somarResultadoDaSomaAnteriorSemQueTenhaSomaAnterior()
			throws Exception {
		assertEquals(2, calculadora.somar(2));
	}

	@Test
	public void tresSomasConsecutivas() throws Exception {
		calculadora.somar(1, 2);
		calculadora.somar(3);
		assertEquals(10, calculadora.somar(4));
	}

	@Test
	public void subtrairDeUmaSomaDaMemoria() throws Exception {
		calculadora.somar(1, 2);
		assertEquals(0, calculadora.subtrair(3));
	}

	@Test
	public void subtrairDeUmaSubtracaoDaMemoria() throws Exception {
		calculadora.subtrair(1, 2);
		assertEquals(-4, calculadora.subtrair(3));
	}

}
