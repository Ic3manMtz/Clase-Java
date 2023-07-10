package ejercicios;

import java.util.HashSet;
import java.util.Set;

public class Jugador {
	private Set<Card> hand;
	
	public Jugador() {
		this.hand=new HashSet<>();
	}

	public void callCard(Card card) {
		this.hand.add(card);
	}
	
	public Set<Card> getHand(){
		return hand;
	}

	public int getHandScore() {
		int score=0;
		for(Card card:hand) {
			score+=card.getValor().getValor();
		}
		
		return score;
	}
	
	@Override
	public String toString() {
		String stringHand="";
		for(Card card:hand) {
			System.out.println(card.getPalo()+", "+card.getValor());
		}
		return stringHand;
	}
}
