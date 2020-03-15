package by.epam.course.cycles;

import java.util.Scanner;

/*Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’.*/

public class CyclesTask28 {

	public static void solution() {

		double x;
		double y;
		String str;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Введите значение Х: ");

			while (!scan.hasNextDouble()) {
				System.out.println("Вы ввели не число. Введите число: ");

				scan.next();

			}

			x = scan.nextDouble();

			System.out.println("Введите значение Y: ");

			while (!scan.hasNextDouble()) {
				System.out.println("Вы ввели не число. Введите число: ");

				scan.next();

			}

			y = scan.nextDouble();
			
			////////////////////////////////////////////////////////////////////////////////////////////////////////////
			

			System.out.println("Введите символ операции (+, -, /, *) ");

			char c = scan.next().charAt(0);

			while (!(c == '/' || c == '*' || c == '+' || c == '-')) {

				System.out.println("Неверный знак арифметической операции. Введите + или - или / или * : ");

				c = scan.next().charAt(0);

				str = scan.next();

				System.out.println("Вы ввели " + x + " " + str + " " + y);

				double operation = 0;

				switch (str) {

				case "+":

					operation = x + y;

					break;

				case "-":

					operation = x - y;

					break;

				case "/":
					if (y == 0) {
						System.out.println("На ноль делить нельзя!");
						operation = 0;
					} else {

						operation = x / y;

					}
					break;

				case "*":
					operation = x * y;

					break;

				default:

					System.out.println("Вы ввели не существующую операцию. Попробуйте еще раз!");
				}
				System.out.println("Значение выражения равно \n " + operation);
			}
		}
	}
}