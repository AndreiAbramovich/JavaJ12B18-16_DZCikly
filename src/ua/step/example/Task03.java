package ua.step.example;

import java.util.Scanner;

/**
 * Цикл do while - пока НЕ (постусловие) ы *
 */

/// Купи слона и введи 5

	//повторил 
	
public class Task03 {
	public static void main(String[] args) {
		Scanner kupi = new Scanner(System.in);
		System.out.println("Купи слона");
		String input = kupi.nextLine();
		while (!input.equals("Куплю")){
			;
		System.out.println("Купи слона");
		input = kupi.nextLine();
		}
		System.out.println("Тогда гони money");
		
		// FIXME измени условие цикла,
		// чтобы выводился только 1
		
		
		//введи 5
		Scanner five = new Scanner(System.in);
		System.out.println("Введи 5");
		int input5 = five.nextInt();
		 while(input5!=5){
			System.out.println("Введи 5");
			input5 = five.nextInt();
		 }
		 System.out.println("Наконец-то");
		 System.out.println("Хороший мальчик/девочка!");
	}
}
