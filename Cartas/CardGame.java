package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CardGame {
	private Set<Card> deck;
	
	public CardGame() {
		this.deck=new HashSet<>();
		createDeck();
	}

	private void createDeck() {
		for(Palos palo:Palos.values()){
			for(Valores valor:Valores.values()) {
				Card newCard = new Card(palo,valor);
				deck.add(newCard);
			}
		}
	}
	
	public Set<Card> getDeck(){
		return deck;
	}
	
	public void shuffleDeck() {
		List<Card> shuffledDeck = new ArrayList<>(deck);
		Collections.shuffle(shuffledDeck);
		
		deck.clear();
		for(Card card:shuffledDeck) {
			deck.add(card);
		}
	}
	
	public void showDeck() {
		for(Card card:deck) {
			System.out.println(card.getPalo()+" "+card.getValor());
		}
	}
}
