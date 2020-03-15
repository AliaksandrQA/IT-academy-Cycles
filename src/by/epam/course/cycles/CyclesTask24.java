package by.epam.course.cycles;

import java.util.Scanner;

/* Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
числом.*/

public class CyclesTask24 {

	public static void solution() {

		System.out.println("Введите число");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		double x;
		int z = number;
		double sum = 0;
		
		System.out.println("Вы ввели : " + number);
		
		while (number != 0) {
			
			x = number % 10;
			
			if(x % 2 == 0) {
				
				sum = sum + x; // сумма четных цифр, входящих в его состав.
			}
			
			number = number / 10;
				
		} 
		
		String s = String.valueOf(z); // Преобразует в строку число или другой параметр.
		StringBuffer rev =  new StringBuffer(s).reverse(); // В Java reverse() возвращает объект StringBuffer с обратной последовательностью
		
		
		System.out.println("Сумма четных цифр введенного числа = " + sum);
		System.out.println("Число в обратном порядке равно " + rev);

}
}