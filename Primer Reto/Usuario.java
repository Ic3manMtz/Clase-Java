package PrimerReto;

import java.util.*;

public class Usuario {
	private String name;
	private int id;
	private List<Libro> loanedBooks;
	private static int userCounter;
	
	public Usuario(String name) {
		this.name = name;
		loanedBooks = new ArrayList<>();
		Usuario.userCounter++;
		this.id = Usuario.userCounter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Libro> getLoanBooks() {
		return loanedBooks;
	}
	public void setLoanBooks(List<Libro> loanBooks) {
		this.loanedBooks = loanBooks;
	}
	
	public void addBook(Libro newBook) {
		loanedBooks.add(newBook);
	}
	
	public void returnBook(Libro book) {
		if(loanedBooks.remove(book)) {
			System.out.println("Estas devolviendo el libro "+book.getTitle());
		}else {
			System.out.println("No posees el libro "+book.getTitle());
		}
	}

	@Override
	public String toString() {
		return "Usuario [Nombre=" + name + ", id=" + id + "]";
	}
}
