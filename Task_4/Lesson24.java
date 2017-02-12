package by.epam.lesson2.homework;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Lesson24 {
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double a = 0, b = 0;
		double s, g;
		
		//Напишите  программу  нахождения  гипотенузы  и  площади  прямоугольного 
		//треугольника по двум катетам.
		
		System.out.print("Введите катет a: "); 
        if (sc.hasNextDouble()){
		a = sc.nextDouble();
		
		System.out.println("Вы ввели "+a);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число!");
        }
        System.out.print("Введите катет b: "); 
        if (sc.hasNextDouble()){
		b = sc.nextDouble();
		
		System.out.println("Вы ввели "+b);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число!");
        }
        
        if ((a>0)&&(b>0)){
        
        g = sqrt(a * a + b * b);
        System.out.println(" = "+ g);
        s = 0.5 * a * b;
        System.out.println("Площадь = "+ s);
        	
        }else
        {System.out.println("Ошибочный ввод!");
        }
        
	
		
		//sc.close();
		
	}


}
