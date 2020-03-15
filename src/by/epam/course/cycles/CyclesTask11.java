package by.epam.course.cycles;

/* Составить программу нахождения разности кубов первых двухсот чисел*/

public class CyclesTask11 {

	public static void solution() {
		
		double x;
		double y;
		double i;
		
		y = 1;
		i = 1;
		
		for (int k = 1; k <= 200; k++) {
			x = Math.pow(i, 3);
			y = x - y;
			i++;
		
			
		} System.out.println("Разность кубов первых двухсот чисел = " + y );
		
		
	}
}
