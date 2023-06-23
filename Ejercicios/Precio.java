package Clases;

public class Precio {
	private double precio;

	public Precio(double precio) {
		super();
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double agregarIva() {
		double iva = precio * 0.16;
		
		if(iva > 50) {
			return precio * 1.06;
		}else {
			return precio * 1.11;
		}
	}
}
