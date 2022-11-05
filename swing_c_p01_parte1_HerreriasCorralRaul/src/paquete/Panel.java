/**
 * swing_c_p01_parte1_HerreriasCorralRaul - paquete - Panel.java
 * 2 nov 2022 - 9:17:45
 * @author Raúl Herrerías Corral
 */
package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class Panel extends JPanel {

	private PanelLogo panelLogo;
	private PanelBox panelBox;
	private PanelInferior panelInferior;
	private PanelCentro panelCentro;
	private JToggleButton btn1, btn2, btn3, btn4, btn5;
	private JButton btnLista;
	private int contador = 0;
	private ArrayList<String> lista;
	
	public Panel() {
		
		this.setLayout(new BorderLayout());
		
		lista = new ArrayList<String>();
		
		panelLogo = new PanelLogo();
		panelBox = new PanelBox();
		panelInferior = new PanelInferior();
		panelCentro = new PanelCentro();

		listeners();
		
		Border bevelLowered = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.GREEN, Color.BLACK, Color.RED);
		panelLogo.setBorder(bevelLowered);
		
		this.add((panelLogo), BorderLayout.NORTH);
		this.add((panelBox), BorderLayout.WEST);
		this.add((panelCentro), BorderLayout.CENTER);
		this.add((panelInferior), BorderLayout.SOUTH);
	}
	
	public void listeners() {
		
		btn1 = panelBox.btn1;
		btn2 = panelBox.btn2;
		btn3 = panelBox.btn3;
		btn4 = panelBox.btn4;
		btn5 = panelBox.btn5;
		btnLista = panelInferior.botonEJ;
		
		btn1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (btn1.isSelected()) {
					panelCentro.mostrarEJ1();
					contador++;
					lista.add("Ejercicio 1");
				} else if (!btn1.isSelected()) {
					panelCentro.esconderEJ1();
					contador--;
					lista.remove("Ejercicio 1");
				}}});
		
		btn2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (btn2.isSelected()) {
					panelCentro.mostrarEJ2();
					contador++;
					lista.add("Ejercicio 2");
				} else if (!btn2.isSelected()) {
					panelCentro.esconderEJ2();
					contador--;
					lista.remove("Ejercicio 2");
				}}});
		
		btn3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (btn3.isSelected()) {
					panelCentro.mostrarEJ3();
					contador++;
					lista.add("Ejercicio 3");
				} else if (!btn3.isSelected()) {
					panelCentro.esconderEJ3();
					contador--;
					lista.remove("Ejercicio 3");
				}}});
		
		btn4.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (btn4.isSelected()) {
					panelCentro.mostrarEJ4();
					contador++;
					lista.add("Ejercicio 4");
				} else if (!btn4.isSelected()) {
					panelCentro.esconderEJ4();
					contador--;
					lista.remove("Ejercicio 4");
				}}});
		
		btn5.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (btn5.isSelected()) {
					panelCentro.mostrarEJ5();
					contador++;
					lista.add("Ejercicio 5");
				} else if (!btn5.isSelected()) {
					panelCentro.esconderEJ5();
					contador--;
					lista.remove("Ejercicio 5");
				}}});
		
		btnLista.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Collections.sort(lista);
				String listaFormateada = lista.toString().replace(",","\n")
						.replace("[", "").replace("]", "").replace(" E", "E");
				
				String string = String.format("Ejercicios activos: %d"
						+ "\nLos ejercicios activos son:"
						+ "\n%s",contador, listaFormateada);
				
				JOptionPane.showMessageDialog(null, string, 
						"Ejercicios activos", JOptionPane.PLAIN_MESSAGE);
			}
		});
	}
}