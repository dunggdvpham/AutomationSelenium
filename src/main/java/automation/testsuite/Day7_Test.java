package automation.testsuite;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.*;

public class Day7_Test {
	@Test
	public void inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của mảng:");
		int index = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[index];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhập phần tử thứ " + (i +1));
			arr[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Mảng bạn nhập vào: " + Arrays.toString(arr));
		System.out.println("Tổng của mảng: " + calculateSum(arr));
	}
	@Test
	public int calculateSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
