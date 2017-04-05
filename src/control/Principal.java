package control;

import java.awt.EventQueue;

import vista.InterfazUsuario;

/**
 * Esta clase solo contiene el main o punto de entrada a la app
 * @author jose
 *
 */
public class Principal {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParaInterfazUsuario frame = new ParaInterfazUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
