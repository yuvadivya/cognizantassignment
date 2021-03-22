package com.assignment.question9;

public class lambda {
	public static void main(String[] args) {
		Boolean b = ()->false;
		Parameter parameter = p->p<98;
		System.out.println("BooleanReturn Interface: "+b.returnmethod());
		
		//Testing Implemented ParameterReturn Interface result
		System.out.println("ParameterReturn Interface: "+parameter.lessthan98(70));
	}
}
