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
public class InteractifFibonacci {

	public static void main(String[] args) {
		System.out.println("------------- Programme suite de Fibonacci ------------- ");
		System.out.println(" ");

		System.out.println("Veuillez choisir un rang svp : ");
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();

		int[] rangTab = new int[Num];

		rangTab[0] = 0;
		rangTab[1] = 1;

		for (int i = 2; i <= rangTab.length - 1; i++) {
			rangTab[i] = rangTab[i - 1] + rangTab[i - 2];
		}
		System.out.println(rangTab[rangTab.length - 1]);

		System.out.println(Arrays.toString(rangTab));
	}
}