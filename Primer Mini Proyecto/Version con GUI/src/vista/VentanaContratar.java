package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.Empleado;

public class VentanaContratar extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	private Coordinador coordinador;
	private JLabel lblNombre;
	private JTextField textNombre;
	private JLabel lblEdad;
	private JTextField textEdad;
	private JLabel lblSalario;
	private JTextField textSalario;
	
	private JButton btnContratar;

	public VentanaContratar() {
		setTitle("Contratación de empleados");
		setResizable(false);
		setSize(345, 246);		
		setLocationRelativeTo(null); //Centra el JFrame a la pantalla

		iniciarComponentes();
	}

	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese los datos del empleado");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 19));
		lblNewLabel.setBounds(10, 11, 287, 45);
		contentPane.add(lblNewLabel);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(20, 53, 72, 26);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNombre.setBounds(99, 53, 200, 26);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(20, 90, 72, 26);
		contentPane.add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEdad.setColumns(10);
		textEdad.setBounds(99, 90, 200, 26);
		contentPane.add(textEdad);
		
		lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSalario.setBounds(20, 127, 72, 26);
		contentPane.add(lblSalario);
		
		textSalario = new JTextField();
		textSalario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSalario.setColumns(10);
		textSalario.setBounds(99, 127, 200, 26);
		contentPane.add(textSalario);
		
		btnContratar = new JButton("Contratar");
		btnContratar.addActionListener(this);
		btnContratar.setBounds(119, 177, 89, 23);
		contentPane.add(btnContratar);
	}
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador=coordinador;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnContratar) {
			String nombre=textNombre.getText();
			int edad=Integer.parseInt(textEdad.getText());
			double salario=Double.parseDouble(textSalario.getText());
						
			Empleado nuevoEmpleado=new Empleado(nombre,edad,salario);
			coordinador.contratarEmpleado(nuevoEmpleado);
			
			textNombre.setText("");
			textEdad.setText("");
			textSalario.setText("");
		}
	}
}
