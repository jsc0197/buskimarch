package control;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import vista.InterfazUsuario;

//Comportamiento de la interfaz
public class ParaInterfazUsuario extends InterfazUsuario {

	public ParaInterfazUsuario() {
		super();	
		Logica logica=new Logica(panelBotonera);
		MouseListener comportamiento = new MyMouseListener(logica);
		Component[] components = panelBotonera.getComponents();
		for (int i = 0; i < components.length; i++) {
			components[i].addMouseListener(comportamiento);
		}
	}

}
