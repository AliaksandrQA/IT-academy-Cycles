package by.epam.course.cycles;

/* Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры. */

public class CyclesTask40 {

	public static void solution() {

		int x;
		int temp;
		int digit;
		int count;

		x = 4567;
		count = 0;

		for (int i = 1; i < x; i++) {

			temp = i; // 

			while (temp > 0) {

				digit = temp % 10; 
				temp = temp / 10;

				if (digit != 0) {

					if (i % digit != 0) {
						count++;
					} else {
					}
				} else {
				}
			}

			if (count == 0) {

				System.out.print(i + " ");
			}

			else {
				count = 0;
			}

		}
	}
}
