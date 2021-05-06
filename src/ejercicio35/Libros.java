package ejercicio35;


public class Libros extends Publicaciones {
	private String isbn;
	private String autor;
	
	public Libros() {
		
	}
	
	public Libros(String titulo, String editor, int anyo, String isbn, String autor) {
		super(titulo,editor,anyo);
		this.isbn = isbn;
		this.autor = autor;
		
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libros [isbn=" + isbn + ", autor=" + autor + "]";
	}
	
	

}
