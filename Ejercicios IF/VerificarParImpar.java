package Semana4;

public class VerificarParImpar {
	private double numero;

	public VerificarParImpar(double numero) {
		this.numero = numero;
	}
	
	public boolean esPar() {
		if(numero%2 == 0) {
				return true;
		}else {
			return false;
		}
	}
	
	public boolean esImpar() {
		if(!esPar()) {
			return true;
		}else {
			return false;
		}
	}
}
