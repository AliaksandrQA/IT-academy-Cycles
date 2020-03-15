package by.epam.course.cycles;

/* // Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15. */

public class CyclesTask34 {

	public static void solution() {

		
		int sum;
		sum = 0;
		
		int digit;
		int temp;
		
		for(int i = 1000; i < 10000; i++) {
			
			temp = i;
			
			while(temp > 0) {
				
				digit = temp % 10; // берём крайнее число 
				
				sum = sum + digit; // суммируем крайнее число с sum
				
				temp = temp / 10; // избавляемся от крайнего числа
				

				}
			
			if (sum == 15) { // 
				
				System.out.println(i);
			}
			
			else {
				sum = 0;
				}
		}
	}

}
