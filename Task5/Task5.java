package Task5;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {

		int mas[][];
		Random rand = new Random();

		mas = new int[5][5];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(40);
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%1d] ", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i < mas.length; i = i + 2) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf(" [%1d] ", mas[i][j]);
			}
			System.out.println();
		}

	}

}
