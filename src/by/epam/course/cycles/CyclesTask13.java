package by.epam.course.cycles;
/*Составить таблицу значений функции y = 5 - x2 /2 на отрезке [-5; 5] с шагом 0.5. */

public class CyclesTask13 {

	public static void solution() {

		double a;// начальная точка отрезка
		double b;// конечная точка отрезка
		double h;// шаг
		double y;

		a = -9;
		b = 6;
		h = 1;

		double i = a;

		while (i <= b) {

			y = 5 - (Math.pow(i, 2) / 2);

			System.out.println("значение функции y в точке " + i + " равно " + y);

			i = i + h;

		}

	}

}
