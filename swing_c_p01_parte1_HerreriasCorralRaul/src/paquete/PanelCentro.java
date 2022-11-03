/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelCentro.java
 * 2 nov 2022 - 14:27:07
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PanelCentro extends JPanel{

	private PanelEJ1 panelEJ1;
	private PanelEJ2 panelEJ2;
	private PanelEJ3 panelEJ3;
	private PanelEJ4 panelEJ4;
	private PanelEJ5 panelEJ5;
	private PanelBox panelbox;
	
	public PanelCentro() {
		this.setLayout(null);
		
		panelEJ1 = new PanelEJ1();
		panelEJ2 = new PanelEJ2();
		panelEJ3 = new PanelEJ3();
		panelEJ4 = new PanelEJ4();
		panelEJ5 = new PanelEJ5();
		panelbox = new PanelBox();
		
		Border line = BorderFactory.createLineBorder(Color.RED, 2);
		Border line2 = BorderFactory.createLineBorder(Color.GREEN, 2);
		
		panelEJ1.setBorder(line);
		panelEJ1.setBounds(10,10,840,160);
		panelEJ1.setVisible(false);
		
		panelEJ2.setBorder(line2);
		panelEJ2.setBounds(10, 170, 840, 160);
		panelEJ2.setVisible(false);
		
		panelEJ3.setBorder(line);
		panelEJ3.setBounds(10, 330, 840, 160);
		panelEJ3.setVisible(false);
		
		panelEJ4.setBorder(line2);
		panelEJ4.setBounds(10, 490, 840, 160);
		panelEJ4.setVisible(false);
		
		panelEJ5.setBorder(line);
		panelEJ5.setBounds(10, 650, 840, 160);
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