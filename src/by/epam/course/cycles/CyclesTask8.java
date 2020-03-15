package by.epam.course.cycles;

/*Вычислить значения функции на отрезке [а,b] c шагом h: */

public class CyclesTask8 {

	public static void solution() {

		double a;// начальная точка отрезка
		double b;// конечная точка отрезка
		double h;// шаг
		double c;
		double y;

		a = -15;
		b = 45;
		c = 2;
		h = 5;

		System.out.println("Введен отрезок [ " + a + " , " + b + " ] с шагом " + h);

		double i = a;

		while (i <= b) {

			if (i != 15) {

				y = (i - c) + 6;

				System.out.println("значение функции y в точке " + i + " равно " + y);
			}

			else {

				y = (i + c) * 2;

				System.out.println("значение функции y в точке " + i + " равно " + y);

			}

			i = i + h;

		}

		System.out.println();
	}

}
