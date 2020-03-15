package by.epam.course.cycles;

import java.util.Scanner;

/*Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
буквами, цифрами и знаком подчеркивания. */

public class CyclesTask32 {

	public static void solution() {

		String inputData;

		boolean isOK;
		isOK = true;

		@SuppressWarnings("resource")

		Scanner scan = new Scanner(System.in); // reader

		System.out.println("Введите строку: "); // start phrase

		while (!scan.hasNextLine()) { // собирает и извлекает лексему из потока стрингов // пока не ввели строку

			System.out.println("Некорректный ввод. Допустима только строка. Введите строку: "); // ругай т.к. вводят не
																								// стринг

			scan.next(); // вызывай опять reader
		}

		inputData = scan.nextLine(); //присвоить стринге значение введенной строки // если была введена строка конечно же

		char[] masChars = inputData.toCharArray();  //Метод toCharArray() создает из строки массив чаров (от англ. - char).// см выше // inputData присваевается новому массиву. 


		if (Character.isLetter(masChars[0]) || (masChars[0] == '_')) { //В качестве  первого символа допустимы только буквы и знак подчеркивания - > условие задачи ! 


			 for (int i = 1; i < masChars.length - 1; i++) {
				 
				 if(Character.isLetter(masChars[i]) || Character.isDigit(masChars[i]) || masChars[i] == '_') { // Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
				
					 
				 }
				 
				 else {
					 isOK = false;
				 }
				 
			 }
			 
			
			if (isOK) {
				
				System.out.println("Валидация прошла успешно");
			}
			
			else {
				System.out.println("Ввод некорректный");
			}
			
			
		 }
		 else {
				System.out.println("Ввод некорректный");
			}
	 }
	 
	 
	 
}
