package edu.ejercicio1Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Que desea escribir:");
		String texto = sc.next();
		FileWriter escri;
		
		File archivo = new File("Archivo.txt");
		try {
			
			escri = new FileWriter(archivo);
			escri.write(texto);
			escri.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	
