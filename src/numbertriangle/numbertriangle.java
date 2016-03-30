package numbertriangle;

import java.util.Scanner;

public class numbertriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input:");
		int input = scanner.nextInt();
		
		for (int count = input; count > 0; count--) {
			for (int spaceTopTriangle = 1; spaceTopTriangle < count; spaceTopTriangle++) {
				System.out.print(" ");
			}
			if (input - count >= 1) {
				for (int i = 1; i <= input - count + 1; i++) {
					System.out.print(i);
				}
			}
				for (int j = input - count; j > 1; j--) {
					System.out.print(j);
				}
			System.out.println("1");
		}
	}
}
