package by.epam.course.cycles;

/* Вывести  на  экран  соответствий  между  символами  и  их  численными обозначениями  в  памяти компьютера (Таблицу ASCII).")*/

public class CyclesTask26 {
	
	public static void solution() {
		
		double i;
		char ch;
		
		i = 0;
		
		while(i <= 255) {
			
			ch = (char) i;
			
			System.out.println("Знаки соответсвий:"+" "+ ch);
			i++;
		}
		
	}

}
