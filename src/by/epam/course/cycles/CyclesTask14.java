package by.epam.course.cycles;

/*Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n. */


public class CyclesTask14 {
	public static void solution() {
		
		int n;
		double x;
		double i;
		
		x = 1.0;
		n = 8;
		
		
		
		for ( i = 2; i <= n; i++){
			
			x = x + (1 / i);
			
			i++;
		}
		
		System.out.println("Если n = " + n + " выражение равно " + x);
	}

}
