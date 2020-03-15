package by.epam.course.cycles;
/*Вычислить значения функции на отрезке [а,b] c шагом h: */

public class CyclesTask7 {
	public static void solution() {

		int a,b;
        double y,x,dx;
        
        a = 0;
        b = 5;
        dx = 0.5;
         for (x = a; x<=b-dx; x+=dx )
         {
            System.out.print("x ="+" " +x+",");
            if (x<0.5){
            y = Math.sqrt(x) *dx;
            System.out.println("y ="+" "+y);
            }
            else if (x>=0){
                y =Math.exp(x);
                System.out.println("y ="+" "+y);
 
            }   
         }
}
}