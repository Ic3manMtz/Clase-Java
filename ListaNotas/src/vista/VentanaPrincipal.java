package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.Nota;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private Coordinador coordinador;
	
	private DefaultListModel<String> modelo;

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnAgregar;
	private JButton btnEditar;
	private JButton btnEliminar;

	public VentanaPrincipal() {
		setResizable(false);
		setTitle("Notas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(419, 348);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 383, 250);
		contentPane.add(scrollPane);
		
		modelo = new DefaultListModel<>();
		list = new JList(modelo);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		
		btnAgregar = new JButton("Crear nota");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(10, 11, 114, 23);
		contentPane.add(btnAgregar);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(this);
		btnEditar.setBounds(196, 11, 89, 23);
		contentPane.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(295, 11, 89, 23);
		contentPane.add(btnEliminar);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAgregar) {
			coordinador.mostrarVentanaAgregar();
		}
		if(e.getSource()==btnEditar) {
			coordinador.mostrarVentanaEditar();
		}
		if(e.getSource()==btnEliminar) {
			coordinador.eliminarNota();
		}
	}

	public void setCoordinador(Coordinador coordinador) {
		this.coordinador=coordinador;		
	}
	
	public int getIndice() {
		return list.getSelectedIndex();
	}

	public void actualizarLista() {
		List<Nota> listaNotas = coordinador.getLista();
		
		modelo.clear();
		for(Nota nota:listaNotas) {
			modelo.addElement(nota.getTitulo());
		}
	}
}
