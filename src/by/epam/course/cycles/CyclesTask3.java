package by.epam.course.cycles;

// Необходимо вывести на экран таблицу умножения на 3:

public class CyclesTask3 {

	public static void solution() {

		for (int i = 1; i <= 3; i++) {
			for (int k = 1; k <= 10; k++) {
				System.out.print(i * k + "  ");
			}
			System.out.println("");
		}
	}
}

/*
 * int i;
 * int x;
 * 
 * i = 1;
 * 
 * while(i <= 9) {
 * 
 * x = i * 3;
 * System.out.print(i * k + "  ");
 * i++;
 *
 *
 */ 

/* for (int i=1; i<=10; i++) {
System.out.println ("3*" + i + "=" + 3*i);*/