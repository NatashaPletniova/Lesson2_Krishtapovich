package by.epam.lesson2.homework;

import java.util.Scanner;

/*
	 Даны три действительных числа. Возвести в квадрат те из них, значения которых 
	неотрицательны, и в четвертую степень — отрицательные. 
 */

public class Lesson214 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		
		double a;
		
		for(int i = 1; i<=3; i++){
			System.out.print("Введите число a: "); 
			if (sc.hasNextDouble()){
			    a = sc.nextDouble();
			    if (a >= 0) {
			    	a = a * a;
			    	System.out.println("Результат: "+a);
			    	System.out.println();
			    	
			    }else
			    {
			    	a = Math.pow(a, 4);
			    	System.out.println("Результат: "+a);	
			    	System.out.println();
			    }
			    }
			else{
			     sc.next();
			     System.out.println("Вы ввели не число! В подсчете отказано!!!");
			     return;
			     }
			
		}
		
		
		
		
	}

}
