/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelEJ1.java
 * 2 nov 2022 - 13:08:46
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEJ2 extends JPanel{

	private BoxLayout principal;
	private JComboBox<String> combo;
	private JLabel label;
	
	public PanelEJ2() {
		
		this.setLayout(null);
	
		label = new JLabel();
		label.setText("En un lugar de la Mancha, de cuyo nombre ...");
		label.setFont(new Font("", Font.PLAIN, 20));
		label.setBounds(4, 80, 600, 20);
		
		GraphicsEnvironment graphicsEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] nombres = graphicsEnv.getAvailableFontFamilyNames();
		
		combo = new JComboBox<String>(nombres);
		combo.setBounds(2,4,836,28);
		
		combo.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				String seleccion = combo.getSelectedItem().toString();
				label.setFont(new Font(seleccion, Font.PLAIN, 20));
		}});

		this.setLayout(principal);
		this.add(combo);
		this.add(label);
	}
}