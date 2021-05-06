package ejercicio35;



public class Publicaciones {
	private String titulo;
	private String editor;
	private int anyo;
	
	
	public Publicaciones() {
		
	}
	
	public Publicaciones(String titulo, String editor,int anyo) {
		
		this.titulo = titulo;
		this.editor = editor;
		this.anyo = anyo;
		
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditor() {
		return editor;
	}

	public int getAnyo() {
		return anyo;
	}

	@Override
	public String toString() {
		return "Publicaciones [titulo=" + titulo + ", editor=" + editor + ", Año=" + anyo + "]";
	}
	
	
	
	
	
}
