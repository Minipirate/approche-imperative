/**
 * 
 */
package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Ness'ti
 *
 */
public class InteractifStockageNombre {

	public static void main(String[] args) {
		System.out.println(
				"------------- Programme qui affiche un nombre ainsi que les nombres existants ------------- ");
		System.out.println(" ");

		int choixOption;
		int[] numberTab = { 1, 2, 3, 4, 5 };

		System.out.println("Option 1 -> [Ajouter un nombre]");
		System.out.println("Option 2 -> [Afficher les nombres existants]");
		System.out.println(" ");
		System.out.println("Veuillez choisir une option svp ! : ");

		Scanner scan = new Scanner(System.in);
		choixOption = scan.nextInt();

		switch (choixOption) {
		case 1:
			System.out.println("Veuillez choisir un nombre svp :");
			Scanner scanNumber = new Scanner(System.in);

			int number = scanNumber.nextInt();
			System.out.println(number);
			for (int i = 0; i < numberTab.length - 1; i++) {
				if (numberTab[i] == 0) {
					numberTab[i] = number;
				}
				if (numberTab[i] == numberTab.length - 1) {
					System.out.println(numberTab[i]);
					numberTab = Arrays.copyOf(numberTab, numberTab.length + 1);
					numberTab[i + 2] = number;
					System.out.println(Arrays.toString(numberTab));
					break;
				}
			}
			break;

		case 2:
			System.out.println("Voici le contenu du tableau contenant les nombres existants : ");
			System.out.println(Arrays.toString(numberTab));
			break;
		default:
			choixOption = 0;
		}
	}
}
