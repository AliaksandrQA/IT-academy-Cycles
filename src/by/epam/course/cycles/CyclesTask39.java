package by.epam.course.cycles;

/* В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. 
Найти это число*/

public class CyclesTask39 {

	public static void solution() {

		int digit;

		for (int i = 101; i < 1000; i++) {

			digit = i % 100;

			if (digit * 7 == i) { // Когда полученное число умножили на 7, то получили исходное число

				System.out.println("Число = " + i);
			}

		}
	}

}
