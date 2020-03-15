package by.epam.course.cycles;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
равен заданному е.*/

public class CyclesTask20 {
	public static void solution() {

		double x;
		double a;//член ряда An
		double e = - 20;//некоторое число е
		double y = 0;
		double g = 1;
		
		for ( int i = 1; i <= 50; i++) {
			
		}
			a = (1 / ((3 * g - 2) * (3 * g + 1)));
			
			if(Math.abs(a) >= e) {
				
				x = a;
				
				y = y + x;
		} System.out.println("Результат вычислений ="+" "+y);
	}

}