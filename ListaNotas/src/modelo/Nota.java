package modelo;

public class Nota {
	private int idNota;
	private String contenido; 
	private String titulo;
	private static int contadorNotas;
	
	private Nota() {
		this.contadorNotas=++Nota.contadorNotas;
	}
	
	public Nota(String contenido) {
		this();
		if(contenido.length()>20) {
			this.titulo=contenido.substring(0,20);
		}else {
			this.titulo=contenido;
		}
		
		this.contenido=contenido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
}
