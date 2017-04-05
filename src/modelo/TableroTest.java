package modelo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TableroTest {

	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testContarMinasAlrededor() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testIncrementarContiguas() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testValidarCoordenada() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCoordenadaAlrededor() {
		Tablero instancia=new Tablero(false);
//		posicion de la fila
		int filas[]={1,1,0};
//		posicion de la columna
		int columnas[]={1,1,0};
//		indice de la casillas alrededor
		int alrededor[]={0,7,0};
//		resultado esperado
		int resultado[][]={{0,0},{2,2},{-1,-1}};
		for (int i = 0; i < resultado.length; i++) {
			assertArrayEquals(resultado[i], 
					instancia.getCoordenadaAlrededor
					(filas[i], columnas[i], alrededor[i]));

		}
		
	}

}
