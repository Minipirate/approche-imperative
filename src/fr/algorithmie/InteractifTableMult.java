/**
 * 
 */
package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Ness'ti
 *
 */
public class InteractifTableMult {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("------------- Programme qui demande à l'utilisateur un nombre compris entre 1 et 10 et qui affiche la table de multiplication correspondante ------------- ");
		System.out.println(" ");

		int number;

		do {
			System.out.println("Veuillez saisir un nombre compris entre 1 et 10 svp !");
			Scanner scan = new Scanner(System.in);
			number = scan.nextInt();
			System.out.println("Voici la table de multiplication du nombre " + number + " :");
			
			if (number < 1 || number > 10) {
				System.out.println(number + " n'est pas un nombre compris entre 1 et 10 !");
			}

		} while (number < 1 || number > 10);
		
			for (int i = 1; i <= 10; i++) {
				System.out.println(number + "X" + i + "=" + (number * i));
		}
	}
}
