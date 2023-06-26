package Clases;

public class Bisiesto {
	private int year;
	
	public Bisiesto(int year) {
		this.year = year;
	}	
	
	public int getYear() {
		return this.year;
	}
	
	public Boolean isBisiesto() {
		if(year%4==0 && year%100!=0) {
			return true;
		}else {
			return false;
		}
	}
}
