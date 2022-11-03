/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelLogo.java
 * 2 nov 2022 - 9:29:51
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLogo extends JPanel{
	private JLabel label, label2, pintura;
	private ImageIcon icono;
	
	public PanelLogo() {
		
		icono = new ImageIcon(this.getClass().getResource("/recursos/Logo.png"));
		pintura = new JLabel(icono);
		
		label = new JLabel("Alumno:");
		label2 = new JLabel("Raúl Herrerías Corral");
		
		label.setFont(new Font("", Font.BOLD, 18));
		label2.setFont(new Font("", Font.BOLD, 18));
		
		label.setForeground(Color.RED);
		label2.setForeground(Color.GREEN);
		
		this.add(pintura);
		this.add(label);
		this.add(label2);
		
	}
}