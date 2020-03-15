package by.epam.course.cycles;

/*// Найдите наибольшую цифру данного натурального числа. */ 

public class CyclesTask33 {
	
	public static void solution() {
		
		int x;
		
		int max;
		
		x = 98541368;
		max = 0;
		
		
		int tempDig;
		
		while(x > 0) {
			
			tempDig = x % 10;
			x = x /10;
			
			if (tempDig > max) {
				max = tempDig;
			}
		} System.out.println("Наибольшая цифра данного натурального числа"+" "+ max);
	}

}
