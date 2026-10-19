package Lab_01;

import java.util.Scanner;

public class Exercise6 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double math, english, physics, program;
		double max = 0;
		double min = 0;
		double avg = 0;
		String maxSub, minSub;
		
		System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");
		
		math = sc.nextDouble();
		max = min = math;
		maxSub = "Math";
		minSub = "Math";
		
		english = sc.nextDouble();
		
		if (english > max) {max = english; maxSub = "English";}
		else if (english == max) { maxSub = maxSub + " and English"; }
		if (english < min) {min = english; minSub = "English";}
		else if (english == min) { minSub = minSub + " and English"; }
		
		physics = sc.nextDouble();
		
		if (physics > max) {max = physics; maxSub = "Physics";}
		else if (physics == max) { maxSub = maxSub + " and Physics"; }
		if (physics < min) {min = physics; minSub = "Physics";}
		else if (physics == min) { minSub = minSub + " and Physics"; }
		
		program = sc.nextDouble();
		
		if (program > max) {max = program; maxSub = "Programming";}
		else if (program == max) { maxSub = maxSub + " and Programming"; }
		if (program < min) {min = program; minSub = "Programming";}
		else if (program == min) { minSub = minSub + " and Programming"; }
		
		avg = (math + english + physics + program)/4;
			
		System.out.println("Max score is: " + max + " (" + maxSub + " course)");
		System.out.println("Min score is: " + min + " (" + minSub + " course)");
		System.out.println("Average score of this student is: " + avg);
	}
	}
