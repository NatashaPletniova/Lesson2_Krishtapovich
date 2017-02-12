package by.epam.lesson2.homework;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Lesson29 {
	/*
	 Программа запрашивает количество чисел, затем вводит целые числа в соответствии 
	 с  указанным  количеством.  Определяет  количество  четных,  сумму  кратных  3-м  и 
	 количество чисел, модуль которых <3
	 */
	
	public static void main(String[] args){
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a = 0, i = 1, c = 0;
		int sign = 1;
		int k1 = 0;   //количество  четных
		int k2 = 0;  //сумма  кратных  3-м
		int k3 = 0;  //модуль которых <3

	
		System.out.print("Введите желаемое количество целых чисел: "); 
        if (sc.hasNextInt()){
		a = sc.nextInt();
		if (a>0){
		System.out.println("Вы ввели "+a);
		}
		else
		{
		System.out.println("Введенное число <= 0! В подсчете отказано!!!");	
		sc.close();
		return;
		}
        }else
        {
        sc.next();
        System.out.println("Вы ввели не целое число! В подсчете отказано!!!");
    	sc.close();
        return;
        }
        while (i<=a){
		        	System.out.print("Введите целое число: "); 
		            if (sc.hasNextInt()){
		    		c = sc.nextInt();
		    		
		    		System.out.println("Вы ввели число[" +i+"]= "+c);
		    		
		    		if (c%2 == 0) {k1++;}
		    		if (c%3 == 0) {k2 = k2+c;}
		    		if (abs(c) < 3) {k3++;} 
		    		
		            }
		            else
		            {
		            sc.next();
		            System.out.println("Вы ввели не целое число! В подсчете отказано!!!");
		            
		            sign = 0;
		            break;


		            }
		            
		            i++;
        	
        }
        
        if (sign == 1)
        {
        	 System.out.println("Количество четных чисел: "+ k1);
        	 System.out.println("Сумма чисел кратных 3-м: "+ k2);
        	 System.out.println("Количество чисел модуль которых <3: "+ k3);
        }
        else
        System.out.println("Аварийное завершение работы программы!!!");

		
		sc.close();
		
	}


}
