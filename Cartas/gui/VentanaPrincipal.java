package ejercicios.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import ejercicios.Card;
import ejercicios.CardGame;
import ejercicios.Jugador;
import ejercicios.Palos;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;

	private CardGame cardGame;

	private JPanel barra;
	private JLabel lblJugadores;
	private JTextField textJugadores;
	private JButton btnIniciar;

	private JPanel fondo;
	private JLabel lblBackground;

	private Map<JLabel, Card> cartas;

	private Map<JList, JButton> jugadores;
	private List<Jugador> jugadoresJugando;

	private DefaultListModel modeloLista1;
	private DefaultListModel modeloLista2;
	private DefaultListModel modeloLista3;
	private DefaultListModel modeloLista4;
	private DefaultListModel modeloLista5;

	private JScrollPane scrollPanePlayer1;
	private JScrollPane scrollPanePlayer2;
	private JScrollPane scrollPanePlayer3;
	private JScrollPane scrollPanePlayer4;
	private JScrollPane scrollPanePlayer5;

	private JButton btnCallPlayer1;
	private JButton btnCallPlayer2;
	private JButton btnCallPlayer3;
	private JButton btnCallPlayer4;
	private JButton btnCallPlayer5;

	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/ejercicios/icons/outline_casino_black_24dp.png")));
		setTitle("Blackjack");
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(837, 568);
		setLocationRelativeTo(null);

		iniciarComponentes();

	}

	private void iniciarComponentes() {
		this.cardGame = new CardGame();
		cardGame.shuffleDeck();

		this.jugadores = new HashMap<>();
		this.cartas = new HashMap<>();

		createCards();

		this.jugadoresJugando = new ArrayList<>(Collections.nCopies(5, null));

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		barra = new JPanel();
		barra.setBounds(0, 0, 821, 59);
		contentPane.add(barra);
		barra.setLayout(null);

		lblJugadores = new JLabel("Numero de jugadores (max 5) ");
		lblJugadores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJugadores.setBounds(10, 11, 299, 37);
		barra.add(lblJugadores);

		textJugadores = new JTextField();
		textJugadores.setHorizontalAlignment(SwingConstants.CENTER);
		textJugadores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textJugadores.setBounds(296, 11, 46, 37);
		barra.add(textJugadores);
		textJugadores.setColumns(10);

		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(this);
		btnIniciar.setBackground(SystemColor.activeCaption);
		btnIniciar.setBounds(352, 11, 68, 37);
		barra.add(btnIniciar);

		fondo = new JPanel();
		fondo.setBounds(0, 59, 821, 502);
		contentPane.add(fondo);
		fondo.setLayout(null);

		createPlayers();

		lblBackground = new JLabel("");
		lblBackground.setBounds(-19, 5, 860, 472);
		lblBackground.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackground.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ejercicios/icons/mesa.png")));
		fondo.add(lblBackground);
	}

	private void createPlayers() {
		scrollPanePlayer1 = new JScrollPane();
		scrollPanePlayer1.setBorder(null);
		scrollPanePlayer1.setBounds(106, 207, 90, 71);
		fondo.add(scrollPanePlayer1);

		modeloLista1 = new DefaultListModel();

		JList cardsPlayer1 = new JList(modeloLista1);
		cardsPlayer1.setBorder(null);
		cardsPlayer1.setBackground(new Color(9, 88, 7));
		cardsPlayer1.setName("jugador 1");
		scrollPanePlayer1.setViewportView(cardsPlayer1);

		btnCallPlayer1 = new JButton("Pedir carta");
		btnCallPlayer1.addActionListener(this);
		btnCallPlayer1.setBackground(new Color(0, 0, 0));
		btnCallPlayer1.setEnabled(false);
		scrollPanePlayer1.setColumnHeaderView(btnCallPlayer1);

		scrollPanePlayer2 = new JScrollPane();
		scrollPanePlayer2.setBorder(null);
		scrollPanePlayer2.setBounds(216, 292, 90, 71);
		fondo.add(scrollPanePlayer2);

		modeloLista2 = new DefaultListModel();

		JList cardsPlayer2 = new JList(modeloLista2);
		cardsPlayer2.setBorder(null);
		cardsPlayer2.setBackground(new Color(9, 88, 7));
		cardsPlayer2.setName("jugador 2");
		scrollPanePlayer2.setViewportView(cardsPlayer2);

		btnCallPlayer2 = new JButton("Pedir Carta");
		btnCallPlayer2.addActionListener(this);
		btnCallPlayer2.setEnabled(false);
		btnCallPlayer2.setBackground(new Color(0, 0, 0));
		scrollPanePlayer2.setColumnHeaderView(btnCallPlayer2);

		scrollPanePlayer3 = new JScrollPane();
		scrollPanePlayer3.setBackground(new Color(9, 88, 7));
		scrollPanePlayer3.setBorder(null);
		scrollPanePlayer3.setBounds(368, 322, 90, 71);
		fondo.add(scrollPanePlayer3);

		modeloLista3 = new DefaultListModel();

		JList cardsPlayer3 = new JList(modeloLista3);
		cardsPlayer3.setBorder(null);
		cardsPlayer3.setBackground(new Color(9, 88, 7));
		cardsPlayer3.setName("jugador 3");
		scrollPanePlayer3.setViewportView(cardsPlayer3);

		btnCallPlayer3 = new JButton("Pedir Carta");
		btnCallPlayer3.addActionListener(this);
		btnCallPlayer3.setEnabled(false);
		btnCallPlayer3.setBackground(Color.BLACK);
		scrollPanePlayer3.setColumnHeaderView(btnCallPlayer3);

		scrollPanePlayer4 = new JScrollPane();
		scrollPanePlayer4.setBorder(null);
		scrollPanePlayer4.setBackground(new Color(9, 88, 7));
		scrollPanePlayer4.setBounds(516, 292, 90, 71);
		fondo.add(scrollPanePlayer4);

		modeloLista4 = new DefaultListModel();

		JList cardsPlayer4 = new JList(modeloLista4);
		cardsPlayer4.setBorder(null);
		cardsPlayer4.setBackground(new Color(9, 88, 7));
		cardsPlayer4.setName("jugador 4");
		scrollPanePlayer4.setViewportView(cardsPlayer4);

		btnCallPlayer4 = new JButton("Pedir Carta");
		btnCallPlayer4.addActionListener(this);
		btnCallPlayer4.setEnabled(false);
		btnCallPlayer4.setBackground(Color.BLACK);
		scrollPanePlayer4.setColumnHeaderView(btnCallPlayer4);

		scrollPanePlayer5 = new JScrollPane();
		scrollPanePlayer5.setBorder(null);
		scrollPanePlayer5.setBackground(new Color(9, 88, 7));
		scrollPanePlayer5.setBounds(627, 206, 90, 71);
		fondo.add(scrollPanePlayer5);

		modeloLista5 = new DefaultListModel();

		JList cardsPlayer5 = new JList(modeloLista5);
		cardsPlayer5.setBorder(null);
		cardsPlayer5.setBackground(new Color(9, 88, 7));
		cardsPlayer5.setName("jugador 5");
		scrollPanePlayer5.setViewportView(cardsPlayer5);

		btnCallPlayer5 = new JButton("Pedir Carta");
		btnCallPlayer5.addActionListener(this);
		btnCallPlayer5.setEnabled(false);
		btnCallPlayer5.setBackground(Color.BLACK);
		btnCallPlayer5.setName("jugador5");
		scrollPanePlayer5.setColumnHeaderView(btnCallPlayer5);

		jugadores.put(cardsPlayer1, btnCallPlayer1);
		jugadores.put(cardsPlayer2, btnCallPlayer2);
		jugadores.put(cardsPlayer3, btnCallPlayer3);
		jugadores.put(cardsPlayer4, btnCallPlayer4);
		jugadores.put(cardsPlayer5, btnCallPlayer5);
	}

	private void createCards() {
		for (Card card : cardGame.getDeck()) {
			if (card.getPalo() == Palos.corazones) {
				String lblText = createLabelText(card.getValor().toString());
				JLabel lblNewLabel = new JLabel(lblText);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ejercicios/icons/corazon.png")));
				cartas.put(lblNewLabel, card);
			}
			if (card.getPalo() == Palos.diamantes) {
				String lblText = createLabelText(card.getValor().toString());
				JLabel lblNewLabel = new JLabel(lblText);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel
						.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ejercicios/icons/diamante.png")));
				cartas.put(lblNewLabel, card);
			}
			if (card.getPalo() == Palos.picas) {
				String lblText = createLabelText(card.getValor().toString());
				JLabel lblNewLabel = new JLabel(lblText);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ejercicios/icons/pica.png")));
				cartas.put(lblNewLabel, card);
			}
			if (card.getPalo() == Palos.treboles) {
				String lblText = createLabelText(card.getValor().toString());
				JLabel lblNewLabel = new JLabel(lblText);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/ejercicios/icons/trebol.png")));
				cartas.put(lblNewLabel, card);
			}
		}
	}

	private String createLabelText(String carta) {
		switch (carta) {
		case "ACE":
			return "A";
		case "DOS":
			return "2";
		case "TRES":
			return "3";
		case "CUATRO":
			return "4";
		case "CINCO":
			return "5";
		case "SEIS":
			return "6";
		case "SIETE":
			return "7";
		case "OCHO":
			return "8";
		case "NUEVE":
			return "9";
		case "DIEZ":
			return "10";
		case "JACK":
			return "J";
		case "QUEEN":
			return "Q";
		case "KING":
			return "K";
		default:
			return "";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIniciar) {
			int jugadores = isInputEmpty();

			activatePlayers(jugadores);

			textJugadores.setEditable(false);
			btnIniciar.setEnabled(false);

			startGame();
		}
		if (e.getSource() == btnCallPlayer1) {
			System.out.println("Jugador 1 calling");

			System.out.println(jugadoresJugando.size());

			Jugador jugador1 = jugadoresJugando.get(0);

			System.out.println(jugador1.toString());
		}
		if (e.getSource() == btnCallPlayer2) {
			System.out.println("Jugador 2 calling");
			Jugador jugador2 = jugadoresJugando.get(1);

			System.out.println(jugador2.toString());
		}
		if (e.getSource() == btnCallPlayer3) {
			System.out.println("Jugador 3 calling");
			Jugador jugador3 = jugadoresJugando.get(2);

			System.out.println(jugador3.toString());
		}
		if (e.getSource() == btnCallPlayer4) {
			System.out.println("Jugador 4 calling");
			Jugador jugador4 = jugadoresJugando.get(3);

			System.out.println(jugador4.toString());
		}
		if (e.getSource() == btnCallPlayer5) {
			System.out.println("Jugador 5 calling");
			Jugador jugador5 = jugadoresJugando.get(4);

			if (cartas.size() > 0) {
				for (Map.Entry<JList, JButton> jugador : jugadores.entrySet()) {
					if (jugador.getKey().getName().equals("jugador 5")) {
						callCard(jugador,jugador5);
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Ya no hay cartar", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}
	}

	private void callCard(Entry<JList, JButton> jugadorSeleccionado, Jugador jugador) {
		List<JLabel> playerCard = new ArrayList<>();

		Random rand = new Random();

		int cartasSize = cartas.size();
		int index = rand.nextInt(cartas.size());
		
		List<Card> cardList = new ArrayList<>(cartas.values());

		int randomCardIndex = new Random().nextInt(cardList.size());
		Card randomCard = cardList.get(randomCardIndex);
		jugador.callCard(randomCard);

		JLabel dealedCard = getJLabel(randomCard);

		playerCard.add(dealedCard);

		cartas.remove(dealedCard);
		
		return;
	}

	private void startGame() {
		for (Map.Entry<JList, JButton> jugador : jugadores.entrySet()) {
			if (jugador.getValue().isEnabled()) {
				JList manoJugador = jugador.getKey();

				int cartasSize = cartas.size();
				if (cartasSize == 0) {
					JOptionPane.showMessageDialog(null, "Ya no hay más cartas", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				dealFirstCards(manoJugador);
			}
		}
	}

	private void dealFirstCards(JList manoJugador) {
		List<JLabel> playerCards = new ArrayList<>();
		Jugador jugador = new Jugador();

		for (int i = 0; i < 2; i++) {
			Random rand = new Random();

			int cartasSize = cartas.size();
			int index = rand.nextInt(cartas.size());
			List<Card> cardList = new ArrayList<>(cartas.values());

			int randomCardIndex = new Random().nextInt(cardList.size());
			Card randomCard = cardList.get(randomCardIndex);
			jugador.callCard(randomCard);

			JLabel dealedCard = getJLabel(randomCard);

			playerCards.add(dealedCard);

			cartas.remove(dealedCard);
		}

		addCardToPlayer(jugador, manoJugador, playerCards);
		return;
	}

	private void addCardToPlayer(Jugador jugador, JList lista, List<JLabel> playerCards) {
		switch (lista.getName()) {
		case "jugador 1":
			jugadoresJugando.set(0, jugador);
			lista = new JList<>(playerCards.toArray(new JLabel[0]));
			lista.setBorder(null);
			lista.setBackground(new Color(9, 88, 7));

			lista.setCellRenderer(new ListCellRenderer<JLabel>() {
				@Override
				public Component getListCellRendererComponent(JList<? extends JLabel> list, JLabel value, int index,
						boolean isSelected, boolean cellHasFocus) {
					return value;
				}
			});
			scrollPanePlayer1.setViewportView(lista);
			break;

		case "jugador 2":
			jugadoresJugando.set(1, jugador);
			lista = new JList<>(playerCards.toArray(new JLabel[0]));
			lista.setBorder(null);
			lista.setBackground(new Color(9, 88, 7));

			lista.setCellRenderer(new ListCellRenderer<JLabel>() {
				@Override
				public Component getListCellRendererComponent(JList<? extends JLabel> list, JLabel value, int index,
						boolean isSelected, boolean cellHasFocus) {
					return value;
				}
			});
			scrollPanePlayer2.setViewportView(lista);
			break;

		case "jugador 3":
			jugadoresJugando.set(2, jugador);
			lista = new JList<>(playerCards.toArray(new JLabel[0]));
			lista.setBorder(null);
			lista.setBackground(new Color(9, 88, 7));

			lista.setCellRenderer(new ListCellRenderer<JLabel>() {
				@Override
				public Component getListCellRendererComponent(JList<? extends JLabel> list, JLabel value, int index,
						boolean isSelected, boolean cellHasFocus) {
					return value;
				}
			});
			scrollPanePlayer3.setViewportView(lista);
			break;

		case "jugador 4":
			jugadoresJugando.set(3, jugador);
			lista = new JList<>(playerCards.toArray(new JLabel[0]));
			lista.setBorder(null);
			lista.setBackground(new Color(9, 88, 7));

			lista.setCellRenderer(new ListCellRenderer<JLabel>() {
				@Override
				public Component getListCellRendererComponent(JList<? extends JLabel> list, JLabel value, int index,
						boolean isSelected, boolean cellHasFocus) {
					return value;
				}
			});
			scrollPanePlayer4.setViewportView(lista);
			break;

		case "jugador 5":
			jugadoresJugando.set(4, jugador);
			lista = new JList<>(playerCards.toArray(new JLabel[0]));
			lista.setBorder(null);
			lista.setBackground(new Color(9, 88, 7));

			lista.setCellRenderer(new ListCellRenderer<JLabel>() {
				@Override
				public Component getListCellRendererComponent(JList<? extends JLabel> list, JLabel value, int index,
						boolean isSelected, boolean cellHasFocus) {
					return value;
				}
			});
			scrollPanePlayer5.setViewportView(lista);
			break;
		}
	}

	private JLabel getJLabel(Card card) {
		for (Map.Entry<JLabel, Card> entry : cartas.entrySet()) {
			if (entry.getValue().equals(card)) {
				return entry.getKey();
			}
		}
		return null;
	}

	private int isInputEmpty() {
		int jugadores = 0;
		if (textJugadores.getText() != "") {
			jugadores = Integer.parseInt(textJugadores.getText());
			if (jugadores <= 0 || jugadores > 5) {
				JOptionPane.showMessageDialog(null, "El número máximo de jugadores es 5", "Error",
						JOptionPane.ERROR_MESSAGE);
				return -1;
			}
			return jugadores;
		}
		return -1;
	}

	private void activatePlayers(int jugadoresActivos) {
		if (jugadoresActivos != -1) {
			Map.Entry<JList, JButton>[] entries = jugadores.entrySet().toArray(new Map.Entry[0]);

			for (int i = 0; i < jugadoresActivos; i++) {
				Map.Entry<JList, JButton> jugador = entries[i];
				JList lista = jugador.getKey();
				JButton boton = jugador.getValue();

				boton.setEnabled(true);
				jugadores.put(lista, boton);
			}
		}
	}
}
