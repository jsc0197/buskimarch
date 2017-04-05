package control;

import java.awt.Component;

public class Utiles {

	public static int[] obtenerCoordenda(Component component) {
		String name = component.getName();
		int[] coordenada={Integer.valueOf(name.substring(0, 1)),Integer.valueOf(name.substring(1, 2))};
		return coordenada;
	}

}
