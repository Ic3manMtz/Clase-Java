package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.Empleado;

public class VentanaAumentarSalario extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	private Coordinador coordinador;
	private JButton btnAumentar;
	private JTextField textAumento;
	private Empleado empleado;

	public VentanaAumentarSalario() {
		setResizable(false);
		setTitle("Aumento de Salario");
		setSize(450, 125);		
		setLocationRelativeTo(null); //Centra el JFrame a la pantalla
		this.empleado=empleado;
		iniciarComponente();

	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado=empleado;
	}

	private void iniciarComponente() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseElPorcentaje = new JLabel("Ingrese el porcentaje del aumento");
		lblIngreseElPorcentaje.setBounds(22, 11, 283, 23);
		lblIngreseElPorcentaje.setForeground(Color.BLACK);
		lblIngreseElPorcentaje.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		contentPane.add(lblIngreseElPorcentaje);
		
		btnAumentar = new JButton("Aumentar salario");
		btnAumentar.addActionListener(this);
		btnAumentar.setBounds(150, 45, 136, 32);
		contentPane.add(btnAumentar);
		
		textAumento = new JTextField();
		textAumento.setBounds(314, 15, 86, 20);
		contentPane.add(textAumento);
		textAumento.setColumns(10);
	}
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador=coordinador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {			
			double porcentajeAumento = Double.parseDouble(textAumento.getText());
			
			coordinador.aumentarSalario(empleado, porcentajeAumento);
			
			textAumento.setText("");
		
	}
}
