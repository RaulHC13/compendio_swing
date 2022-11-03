/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelBox.java
 * 2 nov 2022 - 9:30:00
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class PanelBox extends JPanel{
	
	private BoxLayout principal;
	public JToggleButton btn1, btn2 ,btn3, btn4, btn5;
	public PanelCentro pc;
	
	public PanelBox() {
		
		principal = new BoxLayout(this, BoxLayout.Y_AXIS);
		
		this.setLayout(principal);
		
		btn1 = new JToggleButton("Ejercicio 1");
		btn2 = new JToggleButton("Ejercicio 2");
		btn3 = new JToggleButton("Ejercicio 3");
		btn4 = new JToggleButton("Ejercicio 4");
		btn5 = new JToggleButton("Ejercicio 5");
		
		this.add(Box.createVerticalGlue());
		this.add(btn1);
		this.add(Box.createVerticalGlue());
		this.add(btn2);
		this.add(Box.createVerticalGlue());
		this.add(btn3);
		this.add(Box.createVerticalGlue());
		this.add(btn4);
		this.add(Box.createVerticalGlue());
		this.add(btn5);
		this.add(Box.createVerticalGlue());
	}
}