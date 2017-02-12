package by.epam.lesson2.homework;

import java.util.Scanner;

public class Lesson28 {
	/*Программа вводит два числа a  и  b, если  a=b,  то вывести на экран слова «скоро Новый Год!», 
	  в противном случае ввести третье число с и вывести на экран 3 строки :
		-значение выражения a+b+c
		-значение выражения a*a+b*b
		«моя любимая футбольная команда»
	*/
	
	
	public static void main(String[] args){
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double a = 0;
		double b = 0;
		double c = 0;
		double rez1, rez2;
	
		System.out.print("Введите слагаемое a: "); 
        if (sc.hasNextDouble()){
		a = sc.nextDouble();
		
		System.out.println("Вы ввели "+a);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете отказано!!!");

		sc.close();
        return;
        }
        System.out.print("Введите слагаемое b: "); 
        if (sc.hasNextDouble()){
		b = sc.nextDouble();
		
		System.out.println("Вы ввели "+b);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете отказано!!!");

		sc.close();
        return;
        }
        if (a==b) {
        	System.out.println("скоро Новый Год!");
        }
        else
        {
        	System.out.print("Введите слагаемое c: "); 
	        if (sc.hasNextDouble()){
			c = sc.nextDouble();
			
			System.out.println("Вы ввели "+c);
	        }else
	        {
	        sc.next();
	        System.out.println("Вы ввели не число! В продолжении работы отказано!!!");

			sc.close();
	        return;
	        }
	        rez1 = a + b + c;
	        rez2 = a *a + b * b;
	        
	        System.out.println("значение выражения a+b+c= "+rez1);
	        System.out.println("значение выражения a*a+b*b= "+rez2);
	        System.out.println("моя любимая футбольная команда");
        	
        }

		sc.close();
		
	}

}
