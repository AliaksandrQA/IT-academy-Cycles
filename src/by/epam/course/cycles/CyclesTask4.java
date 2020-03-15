package by.epam.course.cycles;

/*С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
включительно.*/

public class CyclesTask4 {

	public static void solution() {

		int i = 2;
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.print(i +" ");
			}
			i++;
		}
	}
}

/* for (int i = 2; i = <=100;  i++;) {
 * if (i % 2 == 0) {
 * sout(System.out.print(i +" ");
 * }
 * }
 * */
 