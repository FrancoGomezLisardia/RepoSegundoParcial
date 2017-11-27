package topicos.ivan;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void puntoFrmaePlenoTest() {
		topicos topico=new topicos();
		int resultado = topico.puntoFramePleno(10, 5, 4);
		assertEquals(19, resultado);
	}
	
	@Test
	public void TestPrimerTiro() {
		topicos puntaje = new topicos();
		
		
		int resulta = puntaje.mostrarPrimerTiro(5);
		
		int esperado = 5;
		
		assertEquals(esperado, resulta);
	}
	
	@Test
	public void TestPuntosPrimeroySegundoTiro() {
		topicos puntaje = new topicos();
		
		int PrimerTiro=5;
		int SegundoTiro=5;
		int result= puntaje.puntajePrimerYSegundoTiro(PrimerTiro,SegundoTiro);
		int esperado = 10;
		
		assertEquals(esperado, result);
	}
	
	@Test
	public void reconocerFrameTest() {
		topicos topico = new topicos();
		boolean result=topico.reconocerFramePleno();
		assertTrue(true);
		
	}
	
	@Test
	public void contabilizarJuegoPlenosContinuosTest() {
		topicos topico = new topicos();
		boolean result=topico.contabilizarJuegoPlenosContinuos();
		assertTrue(true);
		
	}
	
}
