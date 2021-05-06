package ejercicio35;



public class Revistas extends Publicaciones {
	private int numerosPorAnyo;
	private long circulacion;
	
	public Revistas() {
		
	}
	
	public Revistas(String titulo,String editor,int anyo, int nAnyo, long circulacion) {
		super(titulo,editor,anyo);
		numerosPorAnyo = nAnyo;
		this.circulacion = circulacion;
	}

	public int getNumerosPorAnyo() {
		return numerosPorAnyo;
	}

	public long getCirculacion() {
		return circulacion;
	}

	public void setNumerosPorAnyo(int numerosPorAnyo) {
		this.numerosPorAnyo = numerosPorAnyo;
	}

	public void setCirculacion(long circulacion) {
		this.circulacion = circulacion;
	}

	@Override
	public String toString() {
		return "Revistas [numerosPorAnyo=" + numerosPorAnyo + ", circulacion=" + circulacion + "]";
	}
	
	

}
