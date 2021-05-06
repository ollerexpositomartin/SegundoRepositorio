package ejemploFicheroAccesoAleatorio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Producto implements Serializable {
	public double precio;// 10B
	public String nombre;// 8B
	private static final int tamanyo = 18;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	public static int getTamanyo() {
		return tamanyo;
	}

	public static void productosFichero(Producto p, File f) {
		try (RandomAccessFile fWRa = new RandomAccessFile(f, "wr")) {

			fWRa.writeDouble(p.getPrecio());

			StringBuffer buffer = new StringBuffer(getTamanyo());
			buffer = new StringBuffer(p.getNombre());

			fWRa.writeChars(buffer.toString());

		} catch (IOException ioe) {
			System.out.println("Error E/S");
		}

	}

	public static void productoLeer(File f) {
		if (f.exists())
			try (RandomAccessFile fLRac = new RandomAccessFile(f, "rw")) {
				while (true) {
					System.out.println(fLRac.readLine());
				}
			} catch (IOException ioe) {
				System.out.println("Error E/S");
			}
		else
			System.out.println("NO SE PUEDE LEER EL FICHERO NO EXISTE");
	}

	public static void contenidoPosicion(int posicion, File f) {

		try (RandomAccessFile fLArc = new RandomAccessFile(f, "rw")) {

			fLArc.seek(posicion);

			while (fLArc.getFilePointer() == posicion)
				System.out.println(fLArc.readLine());

		} catch (IOException ioe) {
			System.out.println("Error E/S");
		}

	}

	public static boolean borrarReferenciaLogico(File f) {
		try (RandomAccessFile fLArc = new RandomAccessFile(f, "rw")) {
			fLArc.seek(0);

			for (int i = 0; i < 8; i++) {

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return true;
	}

	public static void borrarLogico(File f) {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		String cadena;
		String referencia;
		try (RandomAccessFile fAl = new RandomAccessFile(f, "r")) {
			fAl.seek(0);

			while (true) {
				referencia = "";
				for (int i = 0; i < 10; i++) {
					referencia += fAl.readChar();
				}
				productos.add(new Producto(referencia, fAl.readDouble()));
			}

		} catch (IOException ioe) {

			System.out.println("Error E/S");
		}

	}
	
	
	public static void actualizarPrecios(File f) {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		String referencia = "";
		try(RandomAccessFile fAr = new RandomAccessFile(f,"r")){
			fAr.seek(0);
			while(true) {
				for (int i = 0; i < 10; i++) {
					referencia += fAr.readChar();
				}
				productos.add(new Producto(referencia,fAr.readDouble()));
			}
			
		} catch (IOException ioe) {
			System.out.println("Error entrada salida");
		}
		
		
		for (Producto producto : productos) {
			if(producto.getPrecio()<150)
				producto.setPrecio(producto.getPrecio()*2);
			if(producto.getPrecio()>150)
				producto.setPrecio(producto.getPrecio()/2);
		}
		
		
		
	}

	@Override
	public String toString() {
		return "Producto Precio: " + precio + ", Nombre: " + nombre;
	}

}
