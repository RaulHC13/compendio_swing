/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelCentro.java
 * 2 nov 2022 - 14:27:07
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class PanelCentro extends JPanel{

	private PanelEJ1 panelEJ1;
	private PanelEJ2 panelEJ2;
	private PanelEJ3 panelEJ3;
	private PanelEJ4 panelEJ4;
	private PanelEJ5 panelEJ5;
	private PanelBox panelbox;
	
	public PanelCentro() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		panelEJ1 = new PanelEJ1();
		panelEJ2 = new PanelEJ2();
		panelEJ3 = new PanelEJ3();
		panelEJ4 = new PanelEJ4();
		panelEJ5 = new PanelEJ5();
		panelbox = new PanelBox();
		
		Border ej1 = BorderFactory.createLineBorder(Color.GRAY, 2);
		Border ej2 = BorderFactory.createLineBorder(Color.RED, 2);
		Border ej3 = BorderFactory.createLineBorder(Color.GREEN, 2);
		Border ej4 = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.ORANGE, Color.GREEN, Color.BLACK, Color.YELLOW);
		Border ej5 = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.CYAN, Color.GREEN, Color.WHITE, Color.CYAN);
		
		panelEJ1.setBorder(ej1);
		panelEJ1.setVisible(false);
		
		panelEJ2.setBorder(ej3);
		panelEJ2.setVisible(false);
		
		panelEJ3.setBorder(ej2);
		panelEJ3.setVisible(false);
		
		panelEJ4.setBorder(ej4);
		panelEJ4.setVisible(false);
		
		panelEJ5.setBorder(ej5);
		panelEJ5.setVisible(false);
		
		this.add(panelEJ1);
		this.add(panelEJ2);		
		this.add(panelEJ3);
		this.add(panelEJ4);
		this.add(panelEJ5);
	}
	
	public void esconderEJ1() {
		panelEJ1.setVisible(false);
	}
	
	public void mostrarEJ1() {
		panelEJ1.setVisible(true);
	}
	
	public void esconderEJ2() {
		panelEJ2.setVisible(false);
	}
	
	public void mostrarEJ2() {
		panelEJ2.setVisible(true);
	}
	
	public void esconderEJ3() {
		panelEJ3.setVisible(false);
	}
	
	public void mostrarEJ3() {
		panelEJ3.setVisible(true);
	}
	
	public void esconderEJ4() {
		panelEJ4.setVisible(false);
	}
	
	public void mostrarEJ4() {
		panelEJ4.setVisible(true);
	}
	
	public void esconderEJ5() {
		panelEJ5.setVisible(false);
	}
	
	public void mostrarEJ5() {
		panelEJ5.setVisible(true);
	}
}