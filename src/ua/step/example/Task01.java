package ua.step.example;

/**
 * Цикл while - пока НЕ
 *
 */
public class Task01 {
	public static void main(String[] args) {
		/*int i = 1;
		while (++i <= 10) {
			System.out.println(i++);*/
			
	
		

		/*long money = 320000000;
		long travel = 200000;
		int vizit = 0;
		while (money > 0){
			System.out.println("Ура, я в Кировске");
			vizit++;
			money = money - travel;
		}
		System.out.println(vizit);*/
		
		/*int i = 0;
		while (i <= 10){
			System.out.println(i);
			i+=2;
		}*/

		/*int number = 0;
		while (number<=10){
			System.out.print(number++);
			number++;
			System.out.print(", ");
		}*/
		
		long money = 320000000;
		long travel = 200000;
		int vizit = 0;
		do {
		System.out.println("Ура, я в Кировске");
		vizit++;
		money = money - travel;
		}
		while (money > 0);
		System.out.println(vizit);
		
		
		
	}
}