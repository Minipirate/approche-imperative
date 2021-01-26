/**
 * 
 */
package fr.algorithmie;

/**
 * @author Ness'ti
 *
 */
public class FirstLast6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Affichage de l'algo de valorisation de la variable /FirstLast6 ------------- ");

		int[] arrayA = { 6, -10, 8, 15, 24, 3, 5, 11, 29, -2, 2 };

		if (arrayA.length > 0 && arrayA[0] == 6 || arrayA[arrayA.length - 1] == 6) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}