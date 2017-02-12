package by.epam.lesson2.homework;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.log;


public class Lesson26 {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double a = 0;
		double b = 0;
		double c = 0;
		double rez;
	
		System.out.print("Введите слагаемое a: "); 
        if (sc.hasNextDouble()){
		a = sc.nextDouble();
		
		System.out.println("Вы ввели "+a);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете отказано!!!");
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
        return;
        }
        System.out.print("Введите слагаемое c: "); 
        if (sc.hasNextDouble()){
		c = sc.nextDouble();
		
		System.out.println("Вы ввели "+c);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете отказано!!!");
        return;        }
        
        
        
        rez = a * a - pow((b - c), 2) + log(b *b + 1);
        System.out.println("Ответ = "+rez );
 
		
		//sc.close();
		
	}

}
