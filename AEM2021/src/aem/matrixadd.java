package aem;

import java.util.Scanner;

public class matrixadd {

	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows and columns");
		a = sc.nextInt();
		b = sc.nextInt();

		int first[][] = new int[a][b];
		int second[][] = new int[a][b];
		int sum[][] = new int[a][b];

		System.out.println("Enter the elements of first matrix");

		for (int c = 0; c < a; c++)
			for (int d = 0; d < b; d++)
				first[c][d] = sc.nextInt();

		System.out.println("Enter the elements of second matrix");

		for (int c = 0; c < a; c++)
			for (int d = 0; d < b; d++)
				second[c][d] = sc.nextInt();

		for (int c = 0; c < a; c++)
			for (int d = 0; d < b; d++)
				sum[c][d] = first[c][d] + second[c][d];

		System.out.println("Sum of the matrices:");

		for (int c = 0; c < a; c++) {
			for (int d = 0; d < b; d++)
				System.out.print(sum[c][d] + "\t");

			System.out.println();
		}
	}
}
