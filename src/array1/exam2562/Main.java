package array1.exam2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] number = new int[9];
		for (int i = 0; i < number.length; i++) {
			number[i] = scanner.nextInt();
		}
		
		int max = 0;
		
		for (int i = 0; i < number.length; i++) {
			if (max < number[i]) {
				max = number[i];
			}
		}
		
		System.out.println(max);
	}
}
