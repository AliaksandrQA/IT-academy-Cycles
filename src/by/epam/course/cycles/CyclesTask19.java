package by.epam.course.cycles;

/*"19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.*/

public class CyclesTask19 {
	public static void solution() {
		double x;
		double a;// член ряда An
		double e = -5;// некоторое число е
		double y = 0;

		for (int i = 1; i <= 5; i++) {

			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

			if (Math.abs(a) >= e) {

				x = a;

				y = y + x;
			}  System.out.println("Результат вычислений ="+" "+y);

		} 

	}
}
