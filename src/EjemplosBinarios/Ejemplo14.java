package EjemplosBinarios;
//***********************************************************************************************************************
//*		14.	Crear un fichero de alumnos con los datos de los alumnos de un curso: nombre, direcci�n, edad y nota media.	* 
//*			Crear los m�todos para crear el archivo y mostrar datos. Leer desde el teclado y escribir por pantalla los 	*
//*			datos de cada uno de los alumnos 																			*
//***********************************************************************************************************************

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Utilidades.Entrada;

public class Ejemplo14 {

	public static void main(String[] args) {
		//sin comprobaciones
		File fichero=new File("C:"+File.separator+"Ficheros"+File.separator+"Binarios","Alumnos.dat");
		
		String nombre, direccion;
		int edad;
		double media;
		
		//escribimos en el fichero de texto
		try(BufferedWriter flujoSalida=new BufferedWriter(new FileWriter(fichero))){
			System.out.println("INTRODUCE NOMBRE DEL ALUMNO. FIN PARA TERMINAR");
			nombre=Entrada.cadena();
			while(!nombre.equalsIgnoreCase("fin")) {
				System.out.println("INTRODUCE DIRECCI�N");
				direccion=Entrada.cadena();
						
				System.out.println("INTRODUCE EDAD ENTRE 6 Y 16");// EDAD DE ENSE�ANZA OBlIGATORIA
				edad=Entrada.entero();
				while(edad<6 || edad>16) {
					System.out.println("VALOR NO V�LIDO");
					System.out.println("INTRODUCE EDAD ENTRE 6 Y 16");
					edad=Entrada.entero();
				}
				
				System.out.println("INTRODUCE NOTA ENTRE 0 Y 10");
				media=Entrada.realDoble();
				while(media<0 || media>10) {
					System.out.println("VALOR NO V�LIDO");
					System.out.println("INTRODUCE NOTA ENTRE 0 Y 10");
					media=Entrada.realDoble();
				}
				
				//grabamos los datos en el fichero
				flujoSalida.write(nombre+" ");
				flujoSalida.write(direccion+" ");
				flujoSalida.write(String.valueOf(edad)+" ");// lo convertimos a cadena de caracteres para guardalo en el flujo
				flujoSalida.write(String.valueOf(media)+"\n");// lo convertimos a cadena de caracteres para guardalo en el flujo
				System.out.println("INTRODUCE NOMBRE DEL ALUMNO. FIN PARA TERMINAR");
				nombre=Entrada.cadena();
			}			
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
	//Lectura del fichero de texto
		try (BufferedReader flujoEntrada=new BufferedReader(new FileReader(fichero))){
			String cadena;
			System.out.println("NOMBRE//DIRECCI�N//EDAD//NOTA MEDIA");
			while((cadena=flujoEntrada.readLine())!=null) {// lee una l�nea completa
				System.out.println(cadena+"\n");
			}
			
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}