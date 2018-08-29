package ua.step.example;

/**
 * 
 * Оператор прерывания одной итерации цикла
 * 
 */
public class Task09 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 != 0)
				continue; // программа перейдет в строку 11
			System.out.println(i);
		}

		// FIXME вывести все четные числа
		one: for (i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j)
					continue one; // программа перейдет в строку 19, а не 20
				System.out.printf("i=%d j=%d \n", i, j);
			}
		}
	}
}
