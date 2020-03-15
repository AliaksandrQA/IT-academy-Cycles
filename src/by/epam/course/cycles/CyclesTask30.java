package by.epam.course.cycles;

import java.util.Scanner;

/*Написать программу, переводящую римские цифры в арабские. */

public class CyclesTask30 {

	public static void solution() {
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); // создаем ридер

		System.out.println("Введите желаемую римскую цифру: "); // приглашение на ввод

		String digit = scan.nextLine(); // преобразование того что вводим в строку

		switch (digit) {

		case "I":
			System.out.println(1);
			break;
		case "II":
			System.out.println(2);
			break;
		case "III":
			System.out.println(3);
			break;
		case "IV":
			System.out.println(4);
			break;
		case "V":
			System.out.println(5);
			break;
		case "VI":
			System.out.println(6);
			break;
		case "VII":
			System.out.println(7);
			break;
		case "VIII":
			System.out.println(8);
			break;
		case "IX":
			System.out.println(9);
			break;
		default:
			System.out.println("Введенной Вами римской цифры не существует");

		}

	}

}
