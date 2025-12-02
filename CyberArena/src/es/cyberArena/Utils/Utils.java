package es.cyberArena.Utils;

import java.util.Scanner;

public class Utils {

	public static String leerCadena(String mensaje, int min, int max, Scanner sc)
	{
		
		String cadenaString;
		
		do {
		System.out.println(mensaje);
		cadenaString = sc.nextLine();
		
		}while(!(cadenaString.length()>=0 && (max==0 || cadenaString.length()<=max)));
		
		return cadenaString;
	}
}
