/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author Ness'ti
 *
 */
public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Affichage de la rotation à droite des éléments ------------- ");

		int[] arrayA = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int rotation = arrayA[arrayA.length - 1];

		for (int i = arrayA.length - 2; i >= 0; i--)
			arrayA[i + 1] = arrayA[i];

		arrayA[0] = rotation;

		System.out.print(Arrays.toString(arrayA));
	}
}