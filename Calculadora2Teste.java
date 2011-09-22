import static org.junit.Assert.*;

import org.junit.Test;

public class Calculadora2Teste {

	@Test
	public void deveSomarListaDeValores(){
		int[] valores = {1,2,6};
		int resultado = Calculadora2.somar(valores);
		assertEquals(9, resultado);
		
	}
	
	@Test
	public void deveMultiplicarListaDeValores(){
		int[] valores = {1,2,6};
		int resultado = Calculadora2.multiplicar(valores);
		assertEquals(12, resultado);
		
	}
	
	@Test
	public void deveSubtrairListaDeValores(){
		int[] valores = {6,2,1};
		int resultado = Calculadora2.subtrair(valores);
		assertEquals(-9, resultado);
	}
}



