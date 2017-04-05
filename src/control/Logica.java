package control;
//filling my heart
//otro cambio en el original
//tercer cambio original
//quinto en el original 
//diezx original 

import javax.swing.JButton;
import javax.swing.JPanel;

import modelo.Tablero;

public class Logica {

	private Tablero tablero;
	private JPanel panelBotonera;

	public Tablero getTablero() {
		return tablero;
	}

	public Logica(JPanel panelBotonera) {
		super();
		this.tablero = new Tablero();
		this.panelBotonera = panelBotonera;
	}

	// Escribir en la botonera la situacion del tablero
	public void actualizarBotonera() {
		for (int i = 0; i < tablero.getAlto(); i++) {
			for (int j = 0; j < tablero.getAncho(); j++) {
				JButton boton = (JButton) panelBotonera.getComponent(obtenerValor(i,j));
				if (tablero.isMarcada(i, j)) {
					boton.setText("marcada");
				} else
					boton.setText("");
			}
		}
	}

	private int obtenerValor(int i, int j) {
		return i*10+j;
	}
}






