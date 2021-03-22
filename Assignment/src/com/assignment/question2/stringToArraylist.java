package com.assignment.question2;

import java.util.ArrayList;
import java.util.List;

public class stringToArraylist {
	public static ArrayList<String> stringToArraylist(String arr[]) {
		ArrayList<String> arraylist = new ArrayList<String>(List.of(arr));
		//Q1
		System.out.println("String to Array List" + arraylist);
		ArrayList<String> arraylist1 = new ArrayList<String>();
		for (String element : arraylist) {
			if (!arraylist1.contains(element)) {
				arraylist1.add(element);
			}
		}
		return arraylist1;
	}
	
	public static ArrayList<java.lang.String> switchIt(List<String> aOne, int a, int b) {
	    String e = aOne.get(a);
	    aOne.set(a, aOne.get(b));
	    aOne.set(b, e);
	    return (ArrayList<String>) aOne;
	}

	public static void main(String[] args) {
		String array[] = { "a", "z", "d", "e", "z" };
		//Q3
		ArrayList<String> newList = stringToArraylist(array);
		System.out.println("Removed duplicates: " + newList);
		//Q4
		ArrayList<String> newList1 = switchIt(newList,0,1);
		System.out.println("After swapping: " + newList1);
		

	}
}
