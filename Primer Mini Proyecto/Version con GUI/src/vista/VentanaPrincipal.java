package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import controlador.Coordinador;
import modelo.Empleado;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel PanelPrincipal;
	
	private DefaultTableModel modelo;
	
	private Coordinador coordinador;
	private JScrollPane scrollPane;
	private JButton btnContratar;
	private JTable table;
	private JButton btnRefresh;
	
	public VentanaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(437, 299);
		setTitle("Gestión de Empleados");
		setLocationRelativeTo(null); //Centra el JFrame a la pantalla
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes(){
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBackground(new Color(255, 255, 255));
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		scrollPane =  new JScrollPane();
		scrollPane.setBounds(10, 45, 403, 206);
		PanelPrincipal.add(scrollPane);
		
		table = new JTable();
		table.setOpaque(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setEnabled(false);
		
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		
		modelo.addColumn("Id");
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		modelo.addColumn("Salario");
		modelo.addColumn("");
		modelo.addColumn("");
		
		table.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer("despedir"));
		table.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));
		
		table.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer("aumentar"));
		table.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(new JCheckBox()));
		
		scrollPane.setViewportView(table);
		
		btnContratar = new JButton("Contratar");
		btnContratar.addActionListener(this);
		btnContratar.setBounds(21, 11, 89, 23);
		PanelPrincipal.add(btnContratar);
		
		btnRefresh = new JButton("");
		btnRefresh.addActionListener(this);
		btnRefresh.setBounds(377, 11, 27, 27);
		PanelPrincipal.add(btnRefresh);
		btnRefresh.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/icons/refresh.png")));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnContratar) {
			coordinador.mostrarVentanaContratar();
		}
		if(e.getSource()==btnRefresh) {
			coordinador.actualizarTabla();
		}
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador=coordinador;
	}

	public void llenarTabla() {
		List<Empleado> listaEmpleados=coordinador.getListaEmpleados();
		
		if(listaEmpleados.isEmpty()) {
			return;
		}
	
		for(Empleado e: listaEmpleados) {
			Object[] fila=new Object[5];
			fila[0]=e.getIdEmpleado();
			fila[1]=e.getNombre();
			fila[2]=e.getEdad();
			fila[3]=e.getSalario();
			
			if(!validarFila(fila)) {
				modelo.addRow(fila);
				
			}
		}	
	}
	
	class ButtonRenderer extends JButton implements TableCellRenderer{
		
		public ButtonRenderer(String etiqueta) {
			setOpaque(true);
			if(etiqueta=="despedir") {
				setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/icons/delete.png")));
			}
			if(etiqueta=="aumentar") {
				setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/icons/add.png")));
			}
		}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {			
			return this;
		}
		
	}
	
	class ButtonEditor extends DefaultCellEditor{
		protected JButton button;

		private boolean isPushed;

		public ButtonEditor(JCheckBox checkBox) {
			super(checkBox);
		    button = new JButton();
		    button.setOpaque(true);
		    button.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        fireEditingStopped();
		      }
		    });
		}

		public Component getTableCellEditorComponent(JTable table, Object value,
		      boolean isSelected, int row, int column) {
		    if (isSelected) {
		      button.setForeground(table.getSelectionForeground());
		      button.setBackground(table.getSelectionBackground());
		    } else {
		      button.setForeground(table.getForeground());
		      button.setBackground(table.getBackground());
		    }
		    isPushed = true;
		    return button;
		}

		public Object getCellEditorValue() {
			if (isPushed) {
	        	int fila = table.getSelectedRow();

			    String nombre = (String) modelo.getValueAt(fila, 1);
				Empleado empleado=new Empleado(nombre);
			    
		        if(button.getLocation().x==331) {	        	
				    int respuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere despedir al empleado?");
					//0=si, 1=no, 2=cancel
			   
					if(respuesta==0) {
						coordinador.despedirEmpleado(empleado);
						modelo.removeRow(fila);
					}
		        }else if(button.getLocation().x==414) {
		        	coordinador.mostrarVentanaAumentaSalario(empleado);
		        }
		     
		    }
		    isPushed = false;
		    return button.getText();
		}

		public boolean stopCellEditing() {
		    isPushed = false;
		    return super.stopCellEditing();
		}

		protected void fireEditingStopped() {
		    super.fireEditingStopped();
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

	public void actualizarSalario() {
		List<Empleado> listaEmpleados=coordinador.getListaEmpleados();
		
		if(listaEmpleados.isEmpty()) {
			return;
		}
		
		int i=0;
		for(Empleado e: listaEmpleados) {
			modelo.setValueAt(e.getSalario(), i++, 3);
		}
	}
}
