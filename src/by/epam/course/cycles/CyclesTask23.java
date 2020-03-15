package by.epam.course.cycles;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции: F(x) = ctg(x/3) + 1/2sin(x).")*/

public class CyclesTask23 {
	
	public static void solution() {
		
		double a;
		double b;
		double h;
		double y;
		
		a = -5;
		b = 5;
		h = 0.5;
		
				
		double i = a;
		
	
		while(i <= b) {
			
			y = (1 / Math.tan(i / 3)) + (1 /(2 * Math.sin(a)));
				
			System.out.println("Значение аргумента x ="+" " + i +" "+"Значение функции: F(x) = x − sin(x) "+ y);

			i = i + h;
	}
	
		
	}
	
}
