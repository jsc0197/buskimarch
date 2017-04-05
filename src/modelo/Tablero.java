package modelo;

public class Tablero {
	private int numeroMinas = 10;
	private Casilla[][] casillas;

	public Tablero() {
		super();
		generarTablero();
		colocarMinas();
		contarMinasAlrededor();
	}

	// TODO: creamos un tablero sin minas
	public Tablero(boolean b) {
		generarTablero();
	}

	// TODO:private void contarMinasAlrededor() {
	public void contarMinasAlrededor() {
		// buscando minas
		for (int filas = 0; filas < casillas.length; filas++) {
			for (int columnas = 0; columnas < casillas[0].length; columnas++) {
				if (casillas[filas][columnas].isMina()) {
					incrementarContiguas(filas, columnas);
				}
			}
		}

	}

	public void incrementarContiguas(int filas, int columnas) {
		// TODO:private void incrementarContiguas(int filas, int columnas) {
		for (int i = 0; i < 8; i++) {
			int[] coordenada = getCoordenadaAlrededor(filas, columnas, i);
			if (validarCoordenada(coordenada)) {
				incrementarValor(coordenada);
			}
		}

	}

	public boolean validarCoordenada(int[] coordenada) {
		// TODO:private boolean validarCoordenada(int[] coordenada) {
		return comprobarLimites(coordenada[0], 0, casillas.length)
				&& comprobarLimites(coordenada[1], 0, casillas[0].length);
	}

	private boolean comprobarLimites(int valor, int minimo, int maximo) {
		return valor >= minimo && valor < maximo;
	}

	private void incrementarValor(int[] coordenada) {
		// hemos llegado aqui porque nos han dado una
		// coordenada valida en la que hay que incrementar en 1
		// el valor de minas alrededor de esa casilla
		casillas[coordenada[0]][coordenada[1]]
				.setMinasAlrededor(casillas[coordenada[0]][coordenada[1]].getMinasAlrededor() + 1);
	}

	public int[] getCoordenadaAlrededor(int filas, int columnas, int i) {
		// TODO:private int[] getCoordenadaAlrededor(int filas, int columnas,
		// int i) {
		int[][] alrededor = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
		int[] coordenada = { filas + alrededor[i][0], columnas + alrededor[i][1] };
		return coordenada;
	}

	/**
	 * colocar 10 minas en diez casillas del tablero las posiciones son por
	 * sorteo
	 */
	private void colocarMinas() {
		for (int i = 0; i < numeroMinas; i++) {
			colocarUnaMina();
		}
	}

	private void colocarUnaMina() {
		int posX, posY;
		do {
			posX = dameNumero(casillas.length);
			posY = dameNumero(casillas[0].length);
		} while (casillas[posX][posY].isMina());
		casillas[posX][posY].setMina(true);
	}

	private int dameNumero(int maximo) {
		return (int) (Math.random() * maximo);
	}

	private void generarTablero() {
		casillas = new Casilla[10][10];
		for (int i = 0; i < casillas.length; i++) {
			for (int j = 0; j < casillas[i].length; j++) {
				casillas[i][j] = new Casilla();
			}
		}
	}

	public void marcaMina(int[] coordenada) {
		casillas[coordenada[0]][coordenada[1]].setMarcada
		(!casillas[coordenada[0]][coordenada[1]].isMarcada());		
	}

	public int getAlto() {
		return casillas.length;
	}
	public int getAncho(){
		return casillas[0].length;
	}
	public boolean isMarcada(int i, int j) {
		return casillas[i][j].isMarcada();		
	}

	
	
	
	
	
	
	
	
	
}
