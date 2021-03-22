package com.assignment.question8;

public class Strings {
	public static void main(String[] args) {
		String[][] names = new String[2][3];
		names[0][0]="1";
		names[0][1]="2";
		names[0][2]="3";
		names[1][0]="4";
		names[1][1]="5";
		names[1][2]="6";
		System.out.println("Without Loop");
		System.out.println(names[0][0]+" "+names[0][1]+" "+names[0][2]+"\n"+names[1][0]+" "+names[1][1]+" "+names[1][2]);
		System.out.println("With Loop");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
