/**
 * 
 */
package fr.algorithmie;

/**
 * @author Ness'ti
 *
 */
public class FirstLast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Affichage de l'algo de valorisation de la variable /FirstLast ------------- ");
		int[] arrayA = {8, -10, 8, 20, 24, 1, 5, 32, 29, -2, 8};

		if (arrayA.length >= 1 && arrayA[0] == arrayA[arrayA.length - 1]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}