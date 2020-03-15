package by.epam.course.cycles;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции: F(x) = x −sin(x)*/

public class CyclesTask21 {
	
	public static void solution() {
		
		double a;//начальная точка 
		double b;//конечная точка 
		double h;// шаг
		double y;
		
		a = -2;
		b = 5;
		h = 0.5;
		
				
		double i = a;
						
		while(i <= b) {
			
			y = i - Math.sin(i);
				
			System.out.println("Значение аргумента x ="+" " + i +" "+"Значение функции: F(x) = x − sin(x) "+ y);	
	
			i = i + h;
			
		}
		
		
		
	}

}
