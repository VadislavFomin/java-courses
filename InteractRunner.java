import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteractRunner {

	public InteractRunner() {
		super();
	}

	/**
	 * сканер для обработкии ввода пользователя
	 */
	private static Scanner		reader		= new Scanner(System.in);
	private static Calculator	calc		= new Calculator();
	private static String		clearResult	= "yes";

	public static void main(String[] args) {

		try {
			/**
			 * Хранит ответ пользователя на вопрос о выходе из приложения: yes / no
			 */
			String			exit	= "no";
			List<Integer>	list;

			while (!exit.equals("yes")) {
				System.out.println("Choose operation: +, -, *, /, ^");
				String operation = reader.next();
				switch (operation) {
				case "+":
					list = (ArrayList<Integer>) enterArgs(reader);
					calc.add(list.get(0), list.get(1));
					exit = showResult(reader);
					break;
				case "-":
					list = (ArrayList<Integer>) enterArgs(reader);
					calc.subtract(list.get(0), list.get(1));
					exit = showResult(reader);
					break;
				case "^":
					list = (ArrayList<Integer>) enterArgs(reader);
					calc.power(list.get(0), list.get(1));
					exit = showResult(reader);
					break;
				case "*":
					list = (ArrayList<Integer>) enterArgs(reader);
					calc.multipl(list.get(0), list.get(1));
					exit = showResult(reader);
					break;
				case "/":
					list = (ArrayList<Integer>) enterArgs(reader);
					calc.division(list.get(0), list.get(1));
					exit = showResult(reader);
					break;
				default:
					System.out.println("You entered wrong operation");
					break;
				}
			}
		} finally {
			reader.close();
		}

	}

	/**
	 * Запрос пользователю на ввод двух чисел в коммандную строку. Валидация чисел
	 * на Integer
	 * 
	 * @param reader сканер для обработки ввода пользователя
	 * @return ArrayList<Integer> список с числами
	 */
	private static List<Integer> enterArgs(Scanner reader) {
		List<Integer> list = new ArrayList<>();

		// Если предыдущий результат надо поместить в первый аргумент
		if (clearResult.equals("no")) {
			int firstNum = (int) calc.getResult();
			list.add(firstNum);
			
		// Если это первая операция или предыдущий результат был обнулен
		} else if (clearResult.equals("yes")) {
			System.out.println("Enter first number:");
			boolean check = false;
			while (!check) {
				try {
					int firstNum = Integer.parseInt(reader.next());
					list.add(firstNum);
					check = true;
				} catch (NumberFormatException e) {
					e.getMessage();
					System.out.println("You entered wrong Number.class Try again.");
				}
			}
		}

		System.out.println("Enter second number:");
		boolean check = false;
		while (!check) {
			try {
				int secondNum = Integer.parseInt(reader.next());
				list.add(secondNum);
				check = true;
			} catch (NumberFormatException e) {
				e.getMessage();
				System.out.println("You entered wrong Number. Try again.");
			}
		}
		return list;
	}

	/**
	 * Отображение результата вычисления. Запрос на выход из приложения. Да -
	 * Очистка результата вычисления Нет - запрос на очистку результата
	 * 
	 * @param reader  - сканер для обработки ввода пользователя
	 * @param calcul- объект калькулятора
	 * @return exit- ответ пользователя: yes/no
	 */
	private static String showResult(Scanner reader) {
		System.out.printf("Result: %.2f %n", calc.getResult());

		System.out.println("Exit: yes/no");
		String exit = reader.next();
		
		if (exit.equals("yes")) {
			calc.clearResult();
		} else {
			
			System.out.println("Does clear result?: yes/no");
			clearResult = reader.next();
			while (!clearResult.equals("yes") || !clearResult.equals("no")) {
				if (clearResult.equals("yes")) {
					calc.clearResult();
					break;
				} else if(clearResult.equals("no")) {
					break;
				} else {
					System.out.println("You mistaked. Does clear result?: yes/no");
					clearResult = reader.next();
				}
			}
			
		}
		return exit;
	}
}
