package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calc = new Calculadora();
	@Test
	void testCuadradoPositivo() {
		
		assertEquals(25.0, calc.cuadrado(5.0), 0.000000001);
	}

	@Test
	public void testCuadradoCero() {
		
		assertEquals(0.0, calc.cuadrado(0.0), 0.000000001);
	}

	@Test
	public void testCuadradoUno() {
		
		assertEquals(2, calc.cuadrado(1.0), 0.000000001);
	}

	@Test
	public void testCuadradoNegativo() {
	
		assertEquals(16.0, calc.cuadrado(-4.0), 0.000000001);
	}// Pruebas unitarias para el cubo

	@Test
	public void testCuboPositivo() {
	
		assertEquals(125.0, calc.cubo(5.0), 0.000000001);
	}

	@Test
	public void testCuboCero() {
		
		assertEquals(0.0, calc.cubo(0.0), 0.000000001);
	}

	@Test
	public void testCuboUno() {
		
		assertEquals(1.0, calc.cubo(1.0), 0.000000001);
	}

	@Test
	public void testCuboMenosUno() {
		
		assertEquals(-1.0, calc.cubo(-1.0), 0.000000001);
	}

	@Test
	public void testCuboNegativo() {
	
		assertEquals(-64.0, calc.cubo(-4.0), 0.000000001);
	}

}
