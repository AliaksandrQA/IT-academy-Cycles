package by.epam.course.cycles;

import java.util.Scanner;

/*Требуется определить факториал числа, которое ввел пользователь */

// Факториал числа — это произведение натуральных чисел от 1 до самого числа (включая данное число).


public class CyclesTask25 {
	public static void solution() {
		

		System.out.println("Введите число");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		double multy;
		int i;
		
		
		i = 1;
		multy = 1;
		
		while(i <= number) {
			multy = multy * i;
			i++;
		} System.out.println("Факториал числа " + number + " равен " + multy);
		
	}
}
