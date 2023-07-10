package ejercicios;

import javax.swing.UIManager;

import ejercicios.gui.VentanaPrincipal;

public class Main {
	public static void main(String[] args) {
//		CardGame cardGame = new CardGame();
//		cardGame.showDeck();
		try {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch(Exception e) {
			  System.out.println("Error setting native LAF: " + e);
		}
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.setVisible(true);
	}
}
