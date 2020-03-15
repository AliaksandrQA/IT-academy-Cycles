package by.epam.course.cycles;

import java.util.Scanner;

/*Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя. */

public class CyclesTask31 {

	public static void solution() {

		int a = 1 + (int)(Math.random() * 15); // нижняя и вверхняя граница
		int b = 1 + (int)(Math.random() * 15); // нижняя и вверхняя граница
		int c = 1 + (int)(Math.random() * 15); // нижняя и вверхняя граница
		int d = 1 + (int)(Math.random() * 15); // нижняя и вверхняя граница
		int e = 1 + (int)(Math.random() * 15); // нижняя и вверхняя граница
		
		
		int myarray [] = new int[5]; // 
		
		int i = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Угадайте 5 цифр в диапозоне от 1 до 15: ");
		
		while(i <= 4) { // цикл для попыток ввода от 0 до 4
			
			int x = sc.nextInt(); // значение введенной цифры присвой переменной x; 
				
			if(x == a) {
				
				System.out.println("Вы угадали цифру " + a);
			}
			
			if(x == b) {
				
				System.out.println("Вы угадали цифру " + b);
			}
			
			if(x == c) {
				
				System.out.println("Вы угадали цифру " + c);
			}
			
			if(x == d) {
				
				System.out.println("Вы угадали цифру " + d);
			}
			
			if(x == e) {
				
				System.out.println("Вы угадали цифру " + e);
			}
			
			myarray [i] = x; // значение x присвой индексам массива ( если было отгадано?) 
			
			i++;
			
		}
			System.out.println("Числа введенные игроком " );
		

			for(i = 0; i < 5; i++) {
			
				System.out.print(myarray[i] + " \\ ");
			}
			
			
			
		System.out.println("\nЧисла загаданные компьютером \n" + a + " \\ " + b + " \\ " + c + " \\ " + d + " \\ " + e + " \\ ");
		System.out.println();
}
}