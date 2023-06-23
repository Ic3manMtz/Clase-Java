package Nomina;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculadoraNomina{
	public static void main(String[] args) {
        final JFrame frame = new JFrame("Calculadora de Nómina");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        final JTextField nombreField = new JTextField(20);
        final JTextField puestoField = new JTextField(20);
        final JTextField horasNormalesField = new JTextField(20);
        final JTextField horasExtraField = new JTextField(20);

        JLabel nombreLabel = new JLabel("Nombre del empleado:");
        JLabel puestoLabel = new JLabel("Puesto del empleado:");
        JLabel horasNormalesLabel = new JLabel("Horas de trabajo normales:");
        JLabel horasExtraLabel = new JLabel("Horas extras:");

        JButton calcularButton = new JButton("Calcular");
        
        final Empleado empleado = new Empleado();
        final Sueldo sueldo = new Sueldo();

        frame.add(nombreLabel);
        frame.add(nombreField);
        frame.add(puestoLabel);
        frame.add(puestoField);
        frame.add(horasNormalesLabel);
        frame.add(horasNormalesField);
        frame.add(horasExtraLabel);
        frame.add(horasExtraField);
        frame.add(calcularButton);

        calcularButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent  e) {
        		 String nombre = nombreField.getText();
                 String puesto = puestoField.getText();
                 int horasNormales = Integer.parseInt(horasNormalesField.getText());
                 int horasExtra = Integer.parseInt(horasExtraField.getText());
                 
                 empleado.setNombre(nombre);;
                 empleado.setPuesto(puesto);
                 empleado.setHorasNormales(horasNormales);
                 empleado.setHorasExtra(horasExtra);
                 
                 double sueldoBruto = sueldo.mostrarSueldoBruto(empleado.getHorasNormales(), empleado.getHorasExtra());
                 double sueldoNeto = sueldo.mostrarSueldoNeto(empleado.getHorasNormales(), empleado.getHorasExtra());

                 JOptionPane.showMessageDialog(frame, "Tu sueldo bruto es: " + sueldoBruto + "\nTu sueldo neto es: " + sueldoNeto);
        	}
           
        });
        frame.setVisible(true);
  
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Ingrese el nombre del empleado...");
//		Empleado empleado = new Empleado(scanner.nextLine());
//		
//		System.out.print("Ingrese el puesto del empleado...");
//		empleado.setPuesto(scanner.nextLine());
//		System.out.print("Ingrese las horas de trabajo normal del empleado...");
//		empleado.setHorasNormales(scanner.nextInt());
//		
//		System.out.print("Ingrese las horas extras del empleado...");
//		empleado.setHorasExtra(scanner.nextInt());
//		
//		Sueldo sueldo = new Sueldo();
//		System.out.print("Tu sueldo bruto es: ");
//		System.err.println(sueldo.mostrarSueldoBruto(empleado.getHorasNormales(),empleado.getHorasExtra()));
//		
//		System.out.print("Tu sueldo neto es: ");
//		System.err.println(sueldo.mostrarSueldoNeto(empleado.getHorasNormales(),empleado.getHorasExtra()));
	}

}
