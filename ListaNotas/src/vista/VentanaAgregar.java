package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.Nota;

public class VentanaAgregar extends JFrame implements ActionListener{
	
	private Coordinador coordinador;
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnGuardar;
	private JTextArea textArea;

	public VentanaAgregar() {
		setTitle("Nota nueva");
		setSize(450, 267);
		setResizable(false);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Escribe la nota que quieres guardar");
		lblNewLabel.setBounds(10, 11, 397, 20);
		contentPane.add(lblNewLabel);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnGuardar.setBounds(172, 193, 89, 23);
		contentPane.add(btnGuardar);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 42, 397, 132);
		contentPane.add(textArea);
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador=coordinador;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnGuardar) {
			int opt = JOptionPane.showConfirmDialog(null, "¿Desea guardar esta nota?");
			if(opt==0) {
				String texto = textArea.getText();
				Nota newNota = new Nota(texto);
				coordinador.agregarNota(newNota);
				textArea.setText("");
				setVisible(false);
			}			
		}
	}
}
