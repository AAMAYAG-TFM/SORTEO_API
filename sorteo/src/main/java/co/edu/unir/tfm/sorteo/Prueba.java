package co.edu.unir.tfm.sorteo;

import java.util.HashMap;
import java.util.Map;

public class Prueba {

	static int[] myArray = { 1, 2, 1, 3, 3, 1, 2, 1, 5, 1 };

	public static void main(String args[]) {
		int mayorValor = 0;
		
		for (int i = 0; i <= myArray.length - 1; i++) {
			mayorValor = myArray[i] > mayorValor ? myArray[i] : mayorValor;

		}

		Map<Integer, String> histograma = new HashMap<>();
		
		String barra;

		for (int i = 0; i <= mayorValor; i++) {
			barra = "";

			histograma.put(i, "");

			for (int j = 0; j <= myArray.length - 1; j++) {

				if (i == myArray[j]) {
					barra = barra.concat("*");
				}
			}
			
			System.out.println(i+": "+barra);
		}

	}

}
