package by.epam.course.cycles;

/* Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
Предполагается, что в числе не менее трёх цифр. Например: 1357, 963 */

public class CyclesTask38 {

	public static void solution() {

		int x;
		int y;

		int a1;
		int a2;
		int digit;
		int temp;
		int check;

		x = 86420;
		y = 0;

		a1 = x % 10;

		a2 = x / 10 % 10;

		y = a2 - a1;

		temp = x / 100;

		check = 0;

		while (temp > 0) {

			digit = temp % 10;

			temp /= 10;

			if (digit == a2 + y) {

			}

			else {
				check++;
			}
			a2 = digit;

		}

		if (check > 0) {
			System.out.print("Цифры не образуют прогрессию");
		} else {
			System.out.print("Цифры образуют прогрессию");
		}

	}

}