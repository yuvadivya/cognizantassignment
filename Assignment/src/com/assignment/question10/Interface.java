package com.assignment.question10;

public class Interface {
	public static void main(String[] args) {
		Shape shape = ()->{
			int a = 7;
			return a*a;
		};
		double[] param = {1.0,2.0};
		Operation operation = (st,params)->{
			switch(st) {
			case "Addition" -> System.out.println("Addition: "+(params[0]+params[1]));
			case "Subtraction" -> System.out.println("Subtraction: "+(params[0]-params[1]));
			case "Multiplication" -> System.out.println("Multiplication: "+(params[0]*params[1]));
			case "Division" -> System.out.println("Division: "+(params[0]/params[1]));
			default -> System.out.println("Operation doesn't match");
			}
		};
		System.out.println("Interface Shape's method: "+shape.ComputeArea());
		System.out.println("Interface Operation's method: ");
		operation.Operate("Multiplication",param);
	}
}
