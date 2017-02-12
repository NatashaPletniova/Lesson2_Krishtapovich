package by.epam.lesson2.homework;

import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Lesson25 {

	// Напишите программу вычисления суммы четырёх слагаемых.
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double a = 0, b = 0;
		double c = 0, d = 0;
		double rez;
	
		System.out.print("Введите слагаемое a: "); 
        if (sc.hasNextDouble()){
		a = sc.nextDouble();
		
		System.out.println("Вы ввели "+a);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете суммы отказано!!!");
        return;
        }
        System.out.print("Введите слагаемое b: "); 
        if (sc.hasNextDouble()){
		b = sc.nextDouble();
		
		System.out.println("Вы ввели "+b);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете суммы отказано!!!");
        return;
        }
        System.out.print("Введите слагаемое c: "); 
        if (sc.hasNextDouble()){
		c = sc.nextDouble();
		
		System.out.println("Вы ввели "+c);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете суммы отказано!!!");
        return;
        }
        
        System.out.print("Введите слагаемое d: "); 
        if (sc.hasNextDouble()){
		d = sc.nextDouble();
		
		System.out.println("Вы ввели "+d);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете суммы отказано!!!");
        return;
        }
        
        rez = a + b + c+ d;
        System.out.println("Сумма = "+rez );
 
		
		//sc.close();
		
	}
	

}
