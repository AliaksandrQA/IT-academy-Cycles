package by.epam.course.cycles;

/* Найдите количество четных цифр данного натурального числа.*/

public class CyclesTask35 {

	public static void solution() {

		int x;
		int temp;
		int even; // чётное
		int odd; // нечётное
		int dig;

		x = 987456321;
		temp = x;
		even = 0;
		odd = 0;

		while (temp > 0) {

			dig = temp % 10;
			if (dig % 2 == 0) {
				even++;
			} else {
				odd++;
			} temp = temp /10;
			
		} System.out.println("Количество четных цифр числа " + x + " = " + even);
		
		System.out.println("Количество нечетных цифр числа " + x + " = " + odd);
	}

}
