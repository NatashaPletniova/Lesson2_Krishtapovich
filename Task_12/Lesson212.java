package by.epam.lesson2.homework;


public class Lesson212 {
/*
 * Создать программу ввода целых чисел как аргументов командной строки, подсчета их суммы и вывода результата на консоль.
 */
	public static void main(String[] args) {
		int x = 0, summa = 0;
		
		System.out.println("args.length: " + args.length );

		if (args.length <= 0){
			
		System.out.println("No arguments");
		return;
		}

		for(int i=0; i<args.length; i++){
			
		System.out.println("args[" + i + "]=" +args[i]);
		
		x = Integer.parseInt(args[i]);
		
		System.out.println("The Int value is: "+ x);
		summa = summa + x;

		}
		System.out.println("The summa is: "+ summa);
		}

	
	
}
