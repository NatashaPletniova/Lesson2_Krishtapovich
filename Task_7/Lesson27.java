package by.epam.lesson2.homework;

import java.util.Scanner;

public class Lesson27 {
	/*
	Программа вводит два числа a и b, если а > b, то программа вводит третье число с и 
	находит сумму  b+c. Если а=b, то программа печатает слово «Конец». Если а<b, то 
	программа вводит третье число с, находит сумму  a+b+c, выводит на экран сумму 
	a+b+c и слова «Новый год!».*/
	
	
	public static void main(String[] args){
		//@SuppressWarnings("resource")
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
        if (a>b) {
        
		        	System.out.print("Введите слагаемое c: "); 
		            if (sc.hasNextDouble()){
		    		c = sc.nextDouble();
		    		
		    		System.out.println("Вы ввели "+c);
		            }else
		            {
		            sc.next();
		            System.out.println("Вы ввели не число! В подсчете отказано!!!");
		            sc.close();
		            return;
		            }
		            rez = b + c;
		            System.out.println("Сумма = "+rez );
        	
        }
        else
        {
        	if (a == b){
        		System.out.println("Конец!!!");	
        		}
        	else
        	{System.out.print("Введите слагаемое c: "); 
            if (sc.hasNextDouble()){
    		c = sc.nextDouble();
    		
    		System.out.println("Вы ввели "+c);
            }else
            {
            sc.next();
            System.out.println("Вы ввели не число! В подсчете отказано!!!");
            sc.close();
            return;
            }
        	System.out.println("Третье число "+c);
        	rez = a+ b + c;
            System.out.println("Сумма = "+rez +" " +"Новый год!");
        		
        	}
        }
        
		sc.close();
		
	}
	

}
