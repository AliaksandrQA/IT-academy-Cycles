package by.epam.course.cycles;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е. */

public class CyclesTask18 {

	public static void solution() {

		double x;
		double a; // An
		double e = - 10;// некоторое число е
		double y = 0;

		for (int i = 1; i <= 10; i++) {
			
			a = Math.pow(-1, i - 1) / i;

			if (Math.abs(a) >= e) {

				x = a;

				y = y + x;

			} System.out.println("Результат вычислений ="+" "+y);

		}

	}
}