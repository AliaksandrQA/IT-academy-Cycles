package by.epam.course.cycles;
/*Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
нахождения произведения первых 10 членов этой последовательности. */

public class CyclesTask12 {
	public static void solution() {

		double x;
		double y;
		double i;

		x = 1.0;
		y = 1.0;
		i = 2.0;

		while (i <= 10) {

			x = 6 + x;

			y = x * y;

			i++;
		}

		System.out.println("Произведение первых 10 членов = " + y);
	}
}