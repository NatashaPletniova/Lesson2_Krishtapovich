package by.epam.lesson2.homework;

import java.util.Scanner;

public class Lesson215 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double a, b, f = 0, x, h;
		
		System.out.print("Введите значение a: "); 
        if (sc.hasNextDouble()){
		a = sc.nextDouble();
		
		System.out.println("Вы ввели "+a);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете суммы отказано!!!");
        return;
        }
        System.out.print("Введите значение b > a: "); 
        if (sc.hasNextDouble()){
		b = sc.nextDouble();
		
		System.out.println("Вы ввели "+b);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете суммы отказано!!!");
        return;
        }
        System.out.print("Введите значение h: "); 
        if (sc.hasNextDouble()){
		h = sc.nextDouble();
		
		System.out.println("Вы ввели "+h);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете суммы отказано!!!");
        return;
        }
        
        System.out.println("                  X           |                  F(X)");
        System.out.println("----------------------------------------------------");
        while (a<=b) 
        {   x = a;
        	f = 2 * Math.tan(x/2)+1;
        	
        System.out.println(" "+x+"                          "+f);
        	
        
        	a = a + h;
        	f = 0;
        }
		
		
	}

}
