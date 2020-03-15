package by.epam.course.cycles;
/*Вычислить : 1+2+4+8+...+ 2 в 10 степени. */

public class CyclesTask15 {
	
public static void solution () {
	
	double x;
	double y;
	
	x = 0;
	
	
	for ( int i = 1; i <= 32; i++) {
		
		x = x + i;
		
		i = i *2; 
	}
	y = Math.pow(x, 10);
	System.out.println("Значение выражения в степени 10 ="+" "+y);
	
}
}
