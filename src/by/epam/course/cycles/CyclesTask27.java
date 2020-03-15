package by.epam.course.cycles;

import java.util.Scanner;

/*Для каждого натурального числа в промежутке от m до n вывести все делители,
 *  кроме единицы и самого числа. m и n вводятся с клавиатуры. */

public class CyclesTask27 {

	public static void solution() {

		int x, y;

		@SuppressWarnings("resource")

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Введите первое натуральное число: ");

		while (!sc1.hasNextInt()) {

			System.out.println("Вы ввели не натуральное число. Введите число: ");

			sc1.next();
		}
		x = sc1.nextInt();

		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Введите второе натуральное число: ");
		while (!sc2.hasNextInt()) {

			System.out.println("Вы ввели не натуральное число. Введите число: ");

			sc2.next();
		}

		y = sc2.nextInt();

		for (int i = x; i <= y; i++) { // i равно первому введенному числу; i <= второму введенному числу; увеличиваем i до значения <= y;

			System.out.print("Делители числа " + i + ": ");

			for (int j = 2; j < i; j++) { // 

				if (i % j == 0) { // если деление значения i от j равно значению деления без остатка
					
					System.out.print(j + " "); // выводи 
				}
			}

		}

	}
}

/*
 * hasNextInt() — метод проверяет, является ли следующая порция введенных данных
 * числом, или нет (возвращает, соответственно, true или false
 */
