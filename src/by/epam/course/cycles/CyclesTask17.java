package by.epam.course.cycles;

/*Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1) */

public class CyclesTask17 {

	public static void solution() {
		double a;
		double n;
		double x;
		double y;

		a = 1;
		n = 5;
		y = 1;
		
		
		for ( int i = 0; i <=(n - 1); i++) {
			
            x = a + i;
			
			y = y * x;
			
			
		} System.out.println("Результат вычислений ="+" "+y);
		
	}

}
