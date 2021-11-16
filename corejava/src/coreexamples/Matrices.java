package coreexamples;

import java.util.Scanner;

class Matrix {
	public int[][] addMatrices(int first[][], int second[][]) {
		// code to add the given two matrices;
		int result[][] = new int[2][2];
		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				result[row][column] = first[row][column] + second[row][column];
			}
		}

		return result;
	}

	public void printMatrix(int first[][]) {
		System.out.println("The sum of the matirces is");
		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				System.out.print(first[row][column] + " ");
			}
			System.out.println(" ");
		}
	}
}

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrix matrix = new Matrix();
		Scanner scanner = new Scanner(System.in);

		int first[][] = new int[2][2];
		int second[][] = new int[2][2];
		int result[][] = new int[2][2];

		System.out.println("Enter first matrix data");

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				first[row][column] = scanner.nextInt();
			}
		}

		System.out.println("Enter second matrix data");

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				second[row][column] = scanner.nextInt();
			}
		}

		result = matrix.addMatrices(first, second);
		matrix.printMatrix(result);

	}

}
