/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelInferior.java
 * 2 nov 2022 - 9:56:29
 * @author Raúl Herrerías Corral
 */
package paquete;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelInferior extends JPanel {

	public JButton botonEJ;
	
	public PanelInferior() {

		botonEJ = new JButton("Ejercicios Activos");
		
		this.add(botonEJ);
		
	}
}