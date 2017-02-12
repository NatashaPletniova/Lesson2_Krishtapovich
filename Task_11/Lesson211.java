package by.epam.lesson2.homework;
import java.util.Scanner;

public class Lesson211 {
	/*
	 Программа  запрашивает  количество  чисел,  вводит  целые  числа  в  соответствии  с 
	 заявленным количеством, определяет, сколько чисел больше 15 или <2, чему равна 
	 сумма чисел, которые делятся на 5 с остатком 4. Результат вывести на экран.
	 */
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a = 0, i = 1, c = 0;
		int sign = 1;
		int k1 = 0;   //сколько чисел больше 15 или <2
		int k2 = 0;  //чему равна сумма чисел, которые делятся на 5 с остатком 4


	
		System.out.print("Введите желаемое количество целых чисел: "); 
        if (sc.hasNextInt()){
		a = sc.nextInt();
		if (a>0){
		System.out.println("Вы ввели "+a);
		}
		else
		{
		System.out.println("Введенное число <= 0! В подсчете отказано!!!");	
		return;
		}
        }else
        {
        sc.next();
        System.out.println("Вы ввели не целое число! В подсчете отказано!!!");
        return;
        }
        while (i<=a){
		        	System.out.print("Введите целое число: "); 
		            if (sc.hasNextInt()){
		    		c = sc.nextInt();
		    		
		    		System.out.println("Вы ввели число[" +i+"]= "+c);
		    		
		    		if (( c > 15 )||( c < 2 )) {k1++;}
		    		if (c%5 == 4) {k2 = k2 + c;}

		    		
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
        	 System.out.println("Количество чисел больше 15 или <2: "+ k1);
        	 System.out.println("Сумма чисел, которые делятся на 5 с остатком 4: "+ k2);

        }
        else
        System.out.println("Аварийное завершение работы программы!!!");

		
		//sc.close();
		
	}

}
