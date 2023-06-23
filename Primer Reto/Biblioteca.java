package PrimerReto;

import java.util.*;
import java.util.List;

public class Biblioteca {
	private List<Libro> availableBooks;
	private List<Usuario> customers;
	
	public Biblioteca() {
		availableBooks = new ArrayList<>();
		customers = new ArrayList<>();
	}
	
	public void addBook(Libro newBook) {
		availableBooks.add(newBook);
	}
	
	public void removeBook(Libro book) {
		if(availableBooks.remove(book)) {
			System.out.println("Estas quitando el libro "+book.getTitle()+" del inevntario");
		}else {
			System.out.println("El libro "+book.getTitle()+" no existe en la base");
		}
	}
	
	public void addCustomer(Usuario newCustomer) {
		customers.add(newCustomer);
	}
	
	public void removeCustomer(Usuario customer) {
		if(customers.remove(customer)) {
			System.out.println("Eliminando usuario "+customer.getName());
		}else {
			System.out.println("El usuario "+customer.getName()+" no existe en la base");
		}
	}
	
	public Libro searchBookByTitle(String title) {
		for(Libro libro:availableBooks) {
			if(libro.getTitle().equals(title)) {
				return libro;
			}
		}
		return null;
	}
	
	public Libro searchBookByAuthor(String author) {
		for(Libro libro : availableBooks) {
			if(libro.getAuthor().equals(author)) {
				return libro;
			}
		}
		return null;
	}
	
	public Libro requestBook(Libro book) {
		Libro requestedBook = new Libro();
		requestedBook = searchBookByTitle(book.getTitle());
		if(requestedBook==null) {
			System.out.println("El libro que solicitaste no existe en la base");
			return null;
		}
		
		if(requestedBook.getIsLoan()) {
			System.out.println("El libro ya está prestado");
			return null;
		}
		
		requestedBook.changeLoanStatus();
		return requestedBook;
		
	}
	
	public void returnBook(Libro book) {
		availableBooks.add(book);
		book.setIsLoan(false);
	}
 }
