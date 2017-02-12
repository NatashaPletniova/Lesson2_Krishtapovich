package by.epam.lesson2.homework;

import java.util.Scanner;

public class Lesson217 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
		
		double f, x;
		

			System.out.print("Введите число x: "); 
			if (sc.hasNextDouble()){
			    x = sc.nextDouble();
			}
			  
			else{
			     sc.next();
			     System.out.println("Вы ввели не число! В подсчете отказано!!!");
			     return;
			     }
			
			  if (x <= -3) {
			    	f = 9; 
			    	System.out.println("Результат: "+f);
			    	System.out.println();
			    	
			    }else
			    {
			    	if (x > 3){
				    	f = 1 / (x * x + 1); 
				    	System.out.println("Результат: "+f);
				    	System.out.println();
				    	}
			    	else{
			    		System.out.println("Результат не определен. ");	
			    	}
			  
			  
			    }
	
			}
	
		
		
		
		
	}


