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

public class VentanaEditar extends JFrame implements ActionListener{

	private Coordinador coordinador;
		
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnGuardar;
	private JTextArea textArea;

	public VentanaEditar() {
		setTitle("Editar Nota");
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
		
		lblNewLabel = new JLabel("Modifica la nota");
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
			String contenido = textArea.getText();
			Nota notaEditada = new Nota(contenido);
			coordinador.editarNota(notaEditada);
			textArea.setText("");
			setVisible(false);
		}
	}

	public void editarNota(Nota nota) {
		this.textArea.setText(nota.getContenido());
	}

}
