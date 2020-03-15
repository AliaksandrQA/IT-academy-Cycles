package by.epam.course.cycles;
/*Найти сумму квадратов первых ста чисел. */

public class CyclesTask9 {
	
	
public static void solution() {
	
	double a;
	double sum;
	
	a = 100;
	sum = 0;
	
	for( int i = 1; i <=a; i++) {
		sum = sum + Math.pow(i, 2);
		
	} System.out.println("Cумма квадратов первых 100 чисел = " + sum);
	
	
	
}
}
