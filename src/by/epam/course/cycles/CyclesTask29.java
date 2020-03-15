package by.epam.course.cycles;

/*Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. */

public class CyclesTask29 {

	public static void solution() {
		int a;
		int b;

		a = 5429;
		b = 9820;

		int copyA;
		int copyB;

		int temp1;
		int temp2;

		copyA = a;
		copyB = b;

		System.out.print("цифры числа a = ");

		while (copyA > 0) {

			temp1 = copyA % 10;
			copyA = copyA / 10;

			System.out.print(temp1 + " ");
		}

		System.out.println();

		System.out.print("цифры числа b = ");

		while (copyB > 0) {

			temp2 = copyB % 10;
			copyB = copyB / 10;
			System.out.print(temp2 + " ");
		}
	}

}
