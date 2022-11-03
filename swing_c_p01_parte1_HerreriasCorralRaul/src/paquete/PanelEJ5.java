/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - PanelEJ1.java
 * 2 nov 2022 - 13:08:46
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelEJ5 extends JPanel {

	private JSpinner spinner;
	private JLabel label, pintura1, pintura2, pintura3, pintura4;
	private ImageIcon img1, img2, img3, img4;

	public PanelEJ5() {

		this.setLayout(null);

		label = new JLabel("¿Cuántas imágenes quieres mostrar?");
		label.setFont(new Font("", Font.PLAIN, 18));
		label.setBounds(80, 40, 360, 24);

		img1 = new ImageIcon(this.getClass().getResource("/recursos/1.png"));
		img1.setImage(img1.getImage().getScaledInstance(80, 80, ABORT));
		pintura1 = new JLabel(img1);
		pintura1.setBounds(160, 70, 80, 80);
		pintura1.setVisible(false);

		img2 = new ImageIcon(this.getClass().getResource("/recursos/2.png"));
		img2.setImage(img2.getImage().getScaledInstance(100, 80, ABORT));
		pintura2 = new JLabel(img2);
		pintura2.setBounds(300, 70, 100, 80);
		pintura2.setVisible(false);

		img3 = new ImageIcon(this.getClass().getResource("/recursos/3.png"));
		img3.setImage(img3.getImage().getScaledInstance(80, 80, ABORT));
		pintura3 = new JLabel(img3);
		pintura3.setBounds(460, 70, 80, 80);
		pintura3.setVisible(false);

		img4 = new ImageIcon(this.getClass().getResource("/recursos/4.png"));
		img4.setImage(img4.getImage().getScaledInstance(80, 80, ABORT));
		pintura4 = new JLabel(img4);
		pintura4.setBounds(600, 70, 80, 80);
		pintura4.setVisible(false);

		SpinnerNumberModel modelo = new SpinnerNumberModel(0, 0, 4, 1);
		spinner = new JSpinner(modelo);
		spinner.setBounds(400, 40, 300, 24);

		spinner.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int valor = (int) spinner.getValue();

				switch (valor) {
				
				case 0:
					pintura1.setVisible(false);
					pintura2.setVisible(false);
					pintura3.setVisible(false);
					pintura4.setVisible(false);
					break;

				case 1:
					pintura1.setVisible(true);
					pintura2.setVisible(false);
					pintura3.setVisible(false);
					pintura4.setVisible(false);
					break;
				case 2:
					pintura1.setVisible(true);
					pintura2.setVisible(true);
					pintura3.setVisible(false);
					pintura4.setVisible(false);
					break;
				case 3:
					pintura1.setVisible(true);
					pintura2.setVisible(true);
					pintura3.setVisible(true);
					pintura4.setVisible(false);
					break;
				case 4:
					pintura1.setVisible(true);
					pintura2.setVisible(true);
					pintura3.setVisible(true);
					pintura4.setVisible(true);
					break;
				}
			}
		});

		this.add(label);
		this.add(spinner);
		this.add(pintura1);
		this.add(pintura2);
		this.add(pintura3);
		this.add(pintura4);
	}
}