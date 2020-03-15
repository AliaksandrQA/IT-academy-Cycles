package by.epam.course.cycles;

/*Составить программу нахождения произведения квадратов первых двухсот чисел. */

public class CyclesTask10 {
	
	
public static void solution() {
	
	double a;
	double multy;
	double temp;
	
	a = 1;
	multy = 1;
	
	for ( int i = 1; i < 200; i++) {
		
		temp = Math.pow(i, 2);
		
		multy = temp * a;

		
	} System.out.println("Произведение квадратов первых двухсот чисел = " + multy );
} 
}
