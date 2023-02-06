package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you want to start with?");
		double startAmount = in.nextDouble();
		System.out.println("What is the probability of you winning, as a decimal?");
		double winChance = in.nextDouble();
		System.out.println("At what point do you want to stop playing?");
		double winLimit = in.nextDouble();
		System.out.println("How many days do you want to play?");
		int totalSimulations = in.nextInt();
		
		for (int i = 0; i < totalSimulations; i++) {
		int iterations = 0;
		double currentAmount = startAmount;
		while (currentAmount > 0.0 && currentAmount<winLimit) {
			if (Math.random()>winChance) {
				currentAmount = currentAmount - 1;
				iterations++;
			} else {
				currentAmount = currentAmount + 1;
				iterations++;
			}
			
		} 
		if (currentAmount==winLimit) {
			System.out.println("Simulation " + (i + 1) + ": " + iterations + " Win");
			System.out.println(currentAmount);
		} else {
			System.out.println("Simulation " + (i + 1) + ": " + iterations + " Lose");
				System.out.println(currentAmount);
		
		}
		}
		double expectedRuin = 0;
		if (winChance == .5) {
			expectedRuin = 1-(startAmount/winLimit);
		
			
		}else ((((((1-winChance)/winChance))^startAmount)-(((1-winChance)/winChance))^winLimit)
	}

}
