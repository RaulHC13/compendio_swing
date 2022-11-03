/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelEJ1.java
 * 2 nov 2022 - 13:08:46
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEJ1 extends JPanel {

	private JLabel label;
	private JCheckBox cbN, cbC;

	private boolean negrita = false, cursiva = false;

	public PanelEJ1() {

		this.setLayout(null);

		label = new JLabel();
		label.setText("En un lugar de la Mancha, de cuyo nombre ...");
		label.setFont(new Font("", Font.PLAIN, 20));
		label.setBounds(4, 40, 600, 40);

		cbN = new JCheckBox();
		cbC = new JCheckBox();

		cbN.setText("Negrita");
		cbN.setBounds(340, 130, 80, 20);

		cbC.setText("Cursiva");
		cbC.setBounds(420, 130, 80, 20);

		cbN.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED) {
					negrita = true;
					label.setFont(new Font("", Font.BOLD, 20));
				}
				if (e.getStateChange() == ItemEvent.DESELECTED && cursiva) {
					negrita = false;
					label.setFont(new Font("", Font.ITALIC, 20));
				}
				if (e.getStateChange() == ItemEvent.DESELECTED && !cursiva) {
					negrita = false;
					label.setFont(new Font("", Font.PLAIN, 20));
				}
				if (e.getStateChange() == ItemEvent.SELECTED && cursiva) {
					label.setFont(new Font("", Font.ITALIC + Font.BOLD, 20));
				}
			}
		});

		cbC.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED) {
					cursiva = true;
					label.setFont(new Font("", Font.ITALIC, 20));
				}
				if (e.getStateChange() == ItemEvent.DESELECTED && negrita) {
					cursiva = false;
					label.setFont(new Font("", Font.BOLD, 20));

				}
				if (e.getStateChange() == ItemEvent.DESELECTED && !negrita) {
					cursiva = false;
					label.setFont(new Font("", Font.PLAIN, 20));
				}
				if (e.getStateChange() == ItemEvent.SELECTED && negrita) {
					label.setFont(new Font("", Font.ITALIC + Font.BOLD, 20));
				}
			}
		});
		this.add(label);
		this.add(cbN);
		this.add(cbC);
	}
}