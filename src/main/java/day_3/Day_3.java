package day_3;

import java.util.Scanner;

public class Day_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Nhập vào 1 số nguyên");
//		int n = sc.nextInt();
//		soChanLe(n);
//		sc.close();
//		int sum = 0;
//		for (int i = 0; i <= 100; i += 2) {
//			System.out.print(i + ", ");
//			sum += i;
//		}
//		System.out.println("\n" + sum);
		
//		for (int i = 0; i <= 100; i++) {
//			if(i%5 == 0) {
//				System.out.print(i + ", ");
//			}
//		}
//		System.out.println("Nhập vào số thứ nhất: ");
//		int x = sc.nextInt();
//		System.out.println("Nhập vào số thứ hai: ");
//		int y = sc.nextInt();
//		System.out.println("Số lớn hơn là: " + inLargerNumber(x, y));
//		System.out.println("Số lớn hơn là: " + inLargerNumber(99, 9));
//		System.out.println("Nhập số phần tử của mảng: ");
//		int count = sc.nextInt();
//		int[] arr = new int[count];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Nhập phần tử thứ " + i);
//			arr[i] = sc.nextInt();
//		}
		int[] arr2 = {1,5,6,8,7,2};
//		sapXepMang(arr2);
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		System.out.println(sapXepMang_2(arr2).toString());
		
	}
	public static void soChanLe(int n) {
		String result;
		if(n%2 == 0) {
			result = "Số chẵn";
			
		} else {
			result = "Số lẻ";
		}
		System.out.println(result);
	}
	
	public static int inLargerNumber (int x, int y) {
		if(x > y) {
			return x;
		}else {
			return y;
		}
	}
	public static void sapXepMang(int[] arr) {
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0; j < arr.length - i -1; j++) {

				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		
	}
	public static int[] sapXepMang_2(int[] arr) {
		for (int i = 0; i < arr.length; i++) 
			for (int j = 0; j < arr.length -1; j++) {

				if(arr[i] > arr[j]
						) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		return arr;
		
	}

}
