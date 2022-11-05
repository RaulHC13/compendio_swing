/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - Ventana.java
 * 2 nov 2022 - 9:17:42
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	private Panel border;
	
	public Ventana() {
		
		
		this.setTitle("Swing Práctica 01 Compendio - Raúl Herrerías Corral");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamañoPantalla = miPantalla.getScreenSize();
		int altoPantalla = tamañoPantalla.height;
		int anchoPantalla = tamañoPantalla.width;
		
		int nuevoAlto = (int) Math.round(altoPantalla/1.08);
		
		this.setSize(anchoPantalla/2, nuevoAlto);
		this.setLocation(anchoPantalla/4, altoPantalla/40);
		
		Image icono = miPantalla.getImage(this.getClass().getResource("/recursos/icono.png"));
		
		border = new Panel();
		
		this.add(border);
		this.setIconImage(icono);
		this.setVisible(true);
	}
}