/**
 * 
 */
package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Ness'ti
 *
 */

public class Interactif21Batons {

	public static void main(String[] args) {

		System.out.println("------------- Programme jeu des batônnets -------------\n");

		int batonnets = 21;

		System.out.println("Bonjour, vous disposez de 21 bâtonnets pour débuter la partie !");
		System.out.println("| | | | | | | | | | | | | | | | | | | | |");

		while (batonnets > 1) {

			System.out.println(" ");
			System.out.println("\nVeuillez choisir | , || ou ||| bâtonnets ");

			Scanner scan = new Scanner(System.in);
			int b = scan.nextInt();
			batonnets -= b;
			if (batonnets < 1) {
				System.out.println("L'ordinateur a gagné !");
				break;
			}
			for (int i = 0; i < batonnets; i++) {
				System.out.print(" | ");
			}

			System.out.println(" -> Il reste à présent " + (batonnets) + " bâtonnet(s), au tour de l'ordinateur !\n");

			Random obj = new Random();
			int nbrRandom = obj.nextInt(3) + 1;
			batonnets -= nbrRandom;
			if (batonnets > 0) {
				System.out.println("L'ordinateur a pris " + (nbrRandom) + " bâtonnet(s), il en reste donc "
						+ (batonnets) + " au tour du joueur suivant !\n");
				for (int i = 0; i < batonnets; i++) {
					System.out.print(" | ");
				}
			} else {
				System.out.println("Bravo ! Vous avez gagné !");
			}
		}
	}
}
