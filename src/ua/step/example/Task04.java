package ua.step.example;

/**
 * Цикл for - повторить n раз
 *
 */
public class Task04 {
	public static void main(String[] args) {
		for (int i = 9; i >= 3; i--) {
			System.out.println(i);
		}
		// i++; // видимость переменной i ограничена телом цикла

		// FIXME Напишите цикл который выведет цифры от 9 до 3

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		// FIXME Выведите одной строкой все буквы латинского алфавита от A до Z
	}
}