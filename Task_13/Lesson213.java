package by.epam.lesson2.homework;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

import java.util.Scanner;

public class Lesson213 {
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double a, b, c, d;
		double f1, f2;
 


		System.out.print("Введите число a: "); 
		if (sc.hasNextDouble()){
		    a = sc.nextDouble();
		    }
		else{
		     sc.next();
		     System.out.println("Вы ввели не число! В подсчете отказано!!!");
		     return;
		     }
		System.out.print("Введите число b: "); 
		if (sc.hasNextDouble()){
		    b = sc.nextDouble();
		    }
		else{
		     sc.next();
		     System.out.println("Вы ввели не число! В подсчете отказано!!!");
		     return;
		     }
		System.out.print("Введите число c: "); 
		if (sc.hasNextDouble()){
		    c = sc.nextDouble();
		    }
		else{
		     sc.next();
		     System.out.println("Вы ввели не число! В подсчете отказано!!!");
		     return;
		     }
		System.out.print("Введите число d: "); 
		if (sc.hasNextDouble()){
		    d = sc.nextDouble();
		    }
		else{
		     sc.next();
		     System.out.println("Вы ввели не число! В подсчете отказано!!!");
		     return;
		     }
		if ((a == 0)||(c == 0)||(d == 0)||((b * b + 4 * a * c) < 0)) {
		    System.out.println("Неверная область определения! В подсчете отказано!!!");
		    return;
			
		}
		
		f1 = (b + sqrt(b * b + 4 * a * c))/(2*a) - pow(a, 3) * c;
		f2 = a/c * b/d - (a * b - c)/(c*d);
		            
	
        System.out.println("Формула1: "+ f1);
        System.out.println("Формула2: "+ f2);

		//sc.close();
		
	}

}
