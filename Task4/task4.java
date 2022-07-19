package Task4;

import java.util.Random;

public class task4 {

	public static void main(String[] args) {
		int[][] mass = new int[5][5];
		Random random = new Random();

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = random.nextInt(40);
		}		}
		System.out.println("first ");
		for (int i = 0; i < mass.length; i++) {
			System.out.println( mass[i][0]);
		}
		System.out.println("second ");
		for (int i = 0; i < mass.length; i++) {
			System.out.println( mass[i] [mass[i].length - 1]);

	}

}}
