/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;

/**
 * @author Ness'ti
 *
 */
public class SommeDeTableauxDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Affichage de la somme des deux précédents tableaux ------------- ");

		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		int[] array3 = new int[array1.length];

		for (int i = 0; i < array3.length; i++) {
			if (i > array2.length - 1) { // -1 car index 0
				array3[i] = array1[i];
			} else {
				array3[i] = array1[i] + array2[i];
			}
		}
		System.out.println(Arrays.toString(array3));
	}
}
