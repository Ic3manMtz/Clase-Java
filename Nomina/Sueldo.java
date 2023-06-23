package Nomina;

public class Sueldo {
	private double pagoPorHora;
	private double pagoHoraExtra;
	
	public Sueldo() {
		this.pagoPorHora = 71.87;
		this.pagoHoraExtra = 25.96;
	}
	
	public double mostrarSueldoBruto(int horasNormales, int horasExtras) {
		return (horasNormales * pagoPorHora) + (horasExtras * pagoHoraExtra);
	}
	
	public double mostrarSueldoNeto(int horasNormales, int horasExtras) {
		double sueldoBruto = mostrarSueldoBruto(horasNormales, horasExtras);
		
		if(sueldoBruto < 2000) {
			return sueldoBruto*0.84;
		}else {
			return sueldoBruto*0.82;
		}
	}
}
