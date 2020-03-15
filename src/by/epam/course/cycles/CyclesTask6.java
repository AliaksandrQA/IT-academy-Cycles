package by.epam.course.cycles;

import java.util.Scanner;

/* Напишите программу, где пользователь вводит любое целое положительное число. А программа
суммирует все числа от 1 до введенного пользователем числа.*/

public class CyclesTask6 {

	public static void solution() {

		int n;
		int sum;

		System.out.print("Введите любое целое положительное число: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}