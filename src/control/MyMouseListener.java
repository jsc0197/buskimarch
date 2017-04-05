package control;

import java.awt.RenderingHints.Key;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import modelo.Tablero;

public class MyMouseListener extends MouseAdapter {
	Logica logica;
	
	public MyMouseListener(Logica logica) {
		super();
		this.logica = logica;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Cuando pulsas boton derecho
		if (SwingUtilities.isRightMouseButton(e)) {
			System.out.println("derecho");
			int[] coordenada=Utiles.obtenerCoordenda(e.getComponent());
			logica.getTablero().marcaMina(coordenada);
			// quiero cambiar los valores del tablero
			logica.actualizarBotonera();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
