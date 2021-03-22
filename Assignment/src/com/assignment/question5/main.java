package com.assignment.question5;

import java.util.Scanner;

public class main {
	public static int fetchCalories(int pizza) {
		int calories;

		switch (pizza) {
		case 1:
			MargheritaPizza mp = new MargheritaPizza();
			calories = mp.makePizza();
			return calories;
		case 2:
			CheesePizza cp = new CheesePizza();
			calories = cp.makePizza();
			return calories;

		default:
			System.out.println("Invalid");
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select to know the calories\n1.Margherita Pizza\n2.Cheese Pizza");
		int pizza = sc.nextInt();
		main m = new main();
		int cal = m.fetchCalories(pizza);
		Nutritionist n = new Nutritionist();
		n.printCalories(cal);
	}
}
