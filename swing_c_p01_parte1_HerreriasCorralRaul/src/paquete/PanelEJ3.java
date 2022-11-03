/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelEJ1.java
 * 2 nov 2022 - 13:08:46
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelEJ3 extends JPanel {

	private JLabel label;
	private JRadioButton rb1, rb2, rb3, rb4;
	private ButtonGroup bg;

	public PanelEJ3() {

		this.setLayout(null);

		rb1 = new JRadioButton("Pequeño");
		rb2 = new JRadioButton("Mediano");
		rb3 = new JRadioButton("Grande");
		rb4 = new JRadioButton("Muy grande");

		bg = new ButtonGroup();

		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);

		label = new JLabel();
		label.setText("En un lugar de la Mancha, de cuyo nombre ...");
		label.setFont(new Font("", Font.PLAIN, 18));
		label.setBounds(4, 40, 800, 60);

		rb1.setBounds(240, 130, 80, 20);
		rb2.setBounds(320, 130, 80, 20);
		rb3.setBounds(400, 130, 80, 20);
		rb4.setBounds(480, 130, 100, 20);

		rb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setFont(new Font("", Font.PLAIN, 12));
			}
		});
		
		rb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setFont(new Font("", Font.PLAIN, 20));
			}
		});
		
		rb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setFont(new Font("", Font.PLAIN, 26));
			}
		});
		
		rb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setFont(new Font("", Font.PLAIN, 32));
			}
		});

		this.add(label);
		this.add(rb1);
		this.add(rb2);
		this.add(rb3);
		this.add(rb4);
	}
}