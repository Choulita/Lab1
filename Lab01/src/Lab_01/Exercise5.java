package Lab_01;

import java.util.Scanner;

public class Exercise5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please input a number: ");
		int n = sc.nextInt();

		System.out.print("All prime numbers from 2 to " + n + ": ");

		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
	}
}