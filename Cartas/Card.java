package ejercicios;

public class Card {
	private Palos palo;
	private Valores valor;
	
	public Card(Palos palo, Valores valor) {
		this.palo=palo;
		this.valor=valor;
	}


	public Palos getPalo() {
		return palo;
	}

	public void setPalo(Palos palo) {
		this.palo = palo;
	}

	public Valores getValor() {
		return valor;
	}

	public void setValor(Valores valor) {
		this.valor = valor;
	}
	
}
