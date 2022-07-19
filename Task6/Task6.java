package Task6;

import java.util.Random;

public class Task6 {
	public static void main(String[] args) {
		int[][] mas;
		mas = new int[4][4];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(40);
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j = j + 2) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
					System.out.printf("{%1d} ", mas[i][j]);
				}
			}
			System.out.println();
		}
	}
}
