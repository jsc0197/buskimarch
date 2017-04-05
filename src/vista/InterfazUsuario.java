package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;

public class InterfazUsuario extends JFrame {

	private JPanel contentPane;
	protected JPanel panelBotonera;

	

	/**
	 * Create the frame.
	 */
	public InterfazUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(15, 15));
		
		panelBotonera = new JPanel();
		contentPane.add(panelBotonera, BorderLayout.CENTER);
		panelBotonera.setLayout(new GridLayout(10, 10, 0, 0));
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		
		for (int filas = 0; filas < 10; filas++) {
			for (int columnas = 0; columnas < 10; columnas++) {
				JButton jButton = new JButton();
				String nombre=Integer.toString(filas)+Integer.toString(columnas);
				jButton.setName(nombre);
				panelBotonera.add(jButton);				
			}			
		}
	}

}





















