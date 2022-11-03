/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelEJ1.java
 * 2 nov 2022 - 13:08:46
 * @author Raúl Herrerías Corral
 */
package paquete;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PanelEJ5 extends JPanel{

	private BoxLayout principal;
	
	public PanelEJ5() {
		
		principal = new BoxLayout(this, BoxLayout.X_AXIS);
		
		this.setLayout(principal);
		
	}
}