package Clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BisiestoGUI extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public BisiestoGUI() {
        setTitle("Comprobador de Año Bisiesto");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Ingrese el año para saber si es bisiesto:");
        textField = new JTextField(10);
        button = new JButton("Comprobar");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        getContentPane().add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
        	
        	
            int year = Integer.parseInt(textField.getText());           
            Bisiesto bisiesto = new Bisiesto(year);

            String message;
            if (bisiesto.isBisiesto()) {
                message = "El año " + bisiesto.getYear() + " es bisiesto";
            } else {
                message = "El año " + bisiesto.getYear() + " NO es bisiesto";
            }

            JOptionPane.showMessageDialog(this, message);
        }
    }
}
