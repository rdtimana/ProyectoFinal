package ProyectoFinal;

import java.util.Scanner;

public class ParqueaderoABC {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Seleccione la opción deseada");
		System.out.println("(1) Registrar Entrada");
		System.out.println("(2) Registrar Salida");
		System.out.println("(2) Registrar Salida");
		int opcion = teclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Inicia");
			break;
		case 2:
			System.out.println("Salio");
			break;
		}
	}

}
