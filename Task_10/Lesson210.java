package by.epam.lesson2.homework;
import java.util.Scanner;

public class Lesson210 {
	
	/*
	 Программа вводит количество чисел N, а затем N  вещественных чисел. 
	 Программа усекает вещественные числа и определяет, сколько среди усеченных чисел четных и >15.
	 */
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a = 0, i = 1;
		double c = 0;
		int sign = 1;
		int k1 = 0, k2 = 0, cc;   


	
		System.out.print("Введите желаемое количество чисел: "); 
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
		        	System.out.print("Введите число: "); 
		            if (sc.hasNextDouble()){
		    		c = sc.nextDouble();
		    		cc = (int)c;
		    		System.out.println("Усеченное число[" +i+"]= "+cc);
		    		
		    		
		    		if (cc%2 == 0) {k1++;}
		    		if (cc > 15)   {k2++;}
		    		
		            }
		            else
		            {
		            sc.next();
		            System.out.println("Вы ввели не число! В подсчете отказано!!!");
		            
		            sign = 0;
		            break;


		            }
		            
		            i++;
        	
        }
        
        if (sign == 1)
        {
        	 System.out.println("Количество четных чисел: "+ k1);
        	 System.out.println("Количество чисел > 15: "+ k2);

        }
        else
        System.out.println("Аварийное завершение работы программы!!!");

		
		//sc.close();
		
	}

}
