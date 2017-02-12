package by.epam.lesson2.homework;

import java.util.Scanner;

public class Lesson216 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double r;
		double s, l;
	
		System.out.print("Введите радиус: "); 
        if (sc.hasNextDouble()){
		r = sc.nextDouble();
		
		System.out.println("Вы ввели "+r);
        }else
        {
        sc.next();
        System.out.println("Вы ввели не число! В подсчете отказано!!!");
        return;
        }
        
        if (r > 0){
            l = 2 * Math.PI * r;
            System.out.println("Длина окружности = "+l );	
            s = Math.PI * r * r;
            System.out.println("Площадь круга = "+s );	
        }
        else
        {
            System.out.println("Радиус не может быть отрицательным или равным нулю! В подсчете отказано!!!");
            return;
        }

 
		
		//sc.close();
		
	}
}
