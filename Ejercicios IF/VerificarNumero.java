package Semana4;

public class VerificarNumero {
	private double numero;

	public VerificarNumero(double numero) {
		this.numero = numero;
	}
	
	public boolean esPositivo() {
		if(this.numero > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esNegativo() {
		if(this.numero < 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean esCero() {
		if(this.numero == 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
