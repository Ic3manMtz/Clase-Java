package Clases;

import javax.swing.SwingUtilities;

public class TestBisiesto {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BisiestoGUI();
            }
        });
    }
}
