package PrimerReto;

import java.io.IOException;
import java.util.Scanner;

public class PruebaReto {
	public static void main(String[] args) {
		Biblioteca library = new Biblioteca();
		Scanner scanner = new Scanner(System.in);
		
		Libro book1 = new Libro("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997);
		Libro book2 = new Libro("To Kill a Mockingbird", "Harper Lee", 1960);
		Libro book3 = new Libro("The Great Gatsby", "F. Scott Fitzgerald", 1925);
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		Usuario customer1 =  new Usuario("Jorge");
		Usuario customer2 = new Usuario("Karla");
		
		library.addCustomer(customer1);
		library.addCustomer(customer1);
		
		while(true) {
            System.out.println("Elige una opción:");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Agregar un cliente");
            System.out.println("3. Solicitar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            int option = scanner.nextInt();
            
            switch(option) {
	            case 1:
	                System.out.print("Ingresa el título del libro: ");
	                scanner.nextLine();
	                String bookTitle = scanner.nextLine();
	                
	                System.out.print("Ingresa el autor del libro: ");
	                String bookAuthor = scanner.nextLine();
	                
	                System.out.print("Ingresa el año de publicación del libro ");
	                int bookReleaseYear = scanner.nextInt();
	                
	                Libro newBook =  new Libro(bookTitle, bookAuthor, bookReleaseYear);
	                library.addBook(newBook);
	                System.out.println("\n\nLibro agregado correctamente\n\n");
	                break;
	                
	            case 2:
	                System.out.println("Ingresa el nombre del cliente:");
	                scanner.nextLine(); 
	                String customerName = scanner.nextLine();
	                Usuario customer = new Usuario(customerName);
	                library.addCustomer(customer);
	                System.out.println(customer.toString());
	                System.out.println("\n\nCliente agregado correctamente\n\n");
	                break;
	                
	            case 3:
	                System.out.println("Ingresa el nombre del libro a prestar");
	                scanner.nextLine(); 
	                String loanBookTitle = scanner.nextLine();
	                Libro loanedBook = new Libro();
	                loanedBook.setTitle(loanBookTitle);
	                loanedBook = library.requestBook(loanedBook);
	                if(loanedBook == null) {
	                	break;
	                }
	                System.out.println("\n\nLibro prestado correctamente\n\n");
	                break;
	                
	            case 4:
	                System.out.println("Ingresa el nombre del libro a devolver");
	                scanner.nextLine();
	                String returnBookTitle = scanner.nextLine();
	                Libro returnedBook = new Libro();
	                returnedBook.setTitle(returnBookTitle);
	                library.returnBook(returnedBook);
	                System.out.println("\n\nLibro devuelto correctamente\n\n");
	                break;
	            case 5:
	                System.exit(0);
	            default:
	                System.out.println("Opción inválida");
	                break;
            }
		}
	}
}
