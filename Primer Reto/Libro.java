package PrimerReto;

public class Libro {
	private String title;
	private String author;
	private int releaseYear;
	private Boolean isLoan;
	
	public Libro() {
		
	}
	
	public Libro(String title, String author, int releaseYear) {
		this.title = title;
		this.author = author;
		this.releaseYear = releaseYear;
		this.isLoan = false;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Boolean getIsLoan() {
		return isLoan;
	}
	public void setIsLoan(Boolean isLoan) {
		this.isLoan = isLoan;
	}
	public void changeLoanStatus() {
		isLoan = !isLoan;
	}

	@Override
	public String toString() {
		String toString = "Libro [titulo=" + title + ", autor=" + author + ", año de publicación=" + releaseYear;
		if(isLoan) {
			toString+=", Esta prestado]";
		}else {
			toString+=", No está prestado]";
		}
		return toString;
		
	}
	
}
