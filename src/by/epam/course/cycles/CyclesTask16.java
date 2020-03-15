package by.epam.course.cycles;

/* Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). */

public class CyclesTask16 {

	public static void solution() {

		int i = 3;
		int x = 3;
		double y = 3;

		while (i <= 10) {

			x = x + i;

			y = y * x;

			i++;
		} System.out.println(y);

	}

}
