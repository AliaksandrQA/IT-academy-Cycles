package by.epam.course.cycles;

/* Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. 
Найти эти числа */

public class CyclesTask36 {

	public static void solution() {

		int num1;
		int num2;
		int res;

		for (num1 = 10; num1 <= 99; num1++) {

			for (num2 = 10; num2 <= 99; num2++) {

				res = num1 * 100 + num2;

				if (res % (num1 * num2) == 0) {

					System.out.println("Число " + num1 + " и " + num2);
				}
			}
		}
	}
}