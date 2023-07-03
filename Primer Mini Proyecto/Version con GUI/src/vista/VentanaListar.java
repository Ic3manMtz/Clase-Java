package vista;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.Empleado;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaListar extends JFrame {

	private JPanel contentPane;

	private DefaultTableModel modelo;
	
	private Coordinador coordinador;
	private JTable tableEmpleados;

	public VentanaListar() {
		setResizable(false);
		setTitle("Listado de Empleados");
		setSize(504, 306);		
		setLocationRelativeTo(null); //Centra el JFrame a la pantalla
		
		iniciarComponente();
	}

	private void iniciarComponente() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 488, 256);
		contentPane.add(scrollPane);
		
		tableEmpleados = new JTable();
		
		modelo = new DefaultTableModel();
		tableEmpleados.setModel(modelo);
		
		modelo.addColumn("Id");
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		modelo.addColumn("Salario");
		
		scrollPane.setViewportView(tableEmpleados);
	}
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador=coordinador;
	}

	public void llenarTabla() {
		List<Empleado> listaEmpleados=coordinador.getListaEmpleados();
		
		for(Empleado e: listaEmpleados) {
			Object[] fila=new Object[4];
			fila[0]=e.getIdEmpleado();
			fila[1]=e.getNombre();
			fila[2]=e.getEdad();
			fila[3]=e.getSalario();
			
			if(!validarFila(fila)) {
				modelo.addRow(fila);
			}
		}
	}

	private boolean validarFila(Object[] fila) {
		boolean existe = false;
		for(int i=0;i<modelo.getRowCount();i++) {
			if(modelo.getValueAt(i, 0)==fila[0]) {
				existe=true;
			}
		}
		return existe;
	}
}
