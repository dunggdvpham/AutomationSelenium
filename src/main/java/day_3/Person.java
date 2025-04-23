package day_3;

import java.util.Scanner;

public class Person {
	public static void main(String[] args) {
//		System.out.println("Name: Pham Do Viet Dung");
//		System.out.println("Phone number: 03463348xx");
//
//		System.out.println("Nhap number 1: ");
//		Scanner sc = new Scanner(System.in);
//
//		float number1 = sc.nextFloat();
//		System.out.println("Nhap number 2: ");
//		float number2 = sc.nextFloat();
//		printLargerNumber(number1, number2);
		
		
		int[] arr_1 = {1,2,3,4,5};
		
		int[] arr_2 = new int[10];
		for (int i = 0; i < 10; i++) {
			arr_2[i] = i++;
		}
		
		
	}
	public static void printLargerNumber(float number1, float number2) {
		if (number1 > number2) {
			System.out.println("so lon hon la " + number1);
		} else {
			System.out.println("so lon hon la " + number2);
		}
	}
	public static void printLargerNumber(double number1, double number2) {
		if (number1 > number2) {
			System.out.println("so lon hon la " + number1);
		} else {
			System.out.println("so lon hon la " + number2);
		}
	}
}
