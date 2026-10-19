package Lab_01;

import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		double avg;
		
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		if (n > 1000) {
			System.out.println("Please enter a number less than or equal to 1000.");
		}
		else {
			for(int k=1000; k>=n; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
			
			for(int k = 1000; k >= n; k--) {
				sum += k;
			}
			
			System.out.println("Sum is: " + sum);
			
			avg = sum/(1000 - n + 1);
			
			System.out.println("Average is: " + avg);
		}
	}
}