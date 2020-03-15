package by.epam.course.cycles;

/*С помощью оператора while напишите программу определения суммы всех нечетных чисел в
диапазоне от 1 до 99 включительно.*/

public class CyclesTask5 {
	
	public static void solution() {
		
		int i = 1;
		int sum = 0;
		
		while(i <= 99) {
			
			if(i % 2 != 0) {
				sum = sum + i;
			}
						
			i++;
		} System.out.println("Cуммы всех нечетных чисел в диапазоне от 1 до 99 включительно = " + " "+sum);
		
	} 

}
