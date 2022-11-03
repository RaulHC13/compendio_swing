/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelEJ1.java
 * 2 nov 2022 - 13:08:46
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelEJ4 extends JPanel{

	private JLabel label;
	private JSlider slider;
	
	public PanelEJ4() {
		
		this.setLayout(null);
		
		label = new JLabel();
		label.setText("En un lugar de la Mancha, de cuyo nombre ...");
		label.setFont(new Font("", Font.PLAIN, 25));
		label.setBounds(4, 40, 800, 140);
		
		slider = new JSlider();
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setMinimum(10);
		slider.setMaximum(40);
		slider.setPaintLabels(true);
		slider.setValue(25);
		slider.setBounds(300,10,200,60);

		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int valor = slider.getValue();
				label.setFont(new Font("", Font.PLAIN, valor));
			}
		});
		
		this.add(label);
		this.add(slider);
	}
}