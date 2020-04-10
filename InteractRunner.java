import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		try {
			Calculator calc = new Calculator();
			String exit = "no";
			ArrayList<String> list;
			
			while(!exit.equals("yes")){
				System.out.println("Choose operation: +, -, *, /, ^");
				String operation = reader.next();
				switch (operation) {
				case "+":
					list = (ArrayList<String>) enterArgs(reader); 
					calc.add(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(1)));
					exit = showResult(reader, calc, exit);
					break;
				case "-":
					list = (ArrayList<String>) enterArgs(reader); 
					calc.subtract(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(1)));
					exit = showResult(reader, calc, exit);
					break;
				case "^":
					list = (ArrayList<String>) enterArgs(reader); 
					calc.power(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(1)));
					exit = showResult(reader, calc, exit);
					break;
				case "*":
					list = (ArrayList<String>) enterArgs(reader); 
					calc.multipl(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(1)));
					exit = showResult(reader, calc, exit);
					break;
				case "/":
					list = (ArrayList<String>) enterArgs(reader); 
					calc.division(Integer.valueOf(list.get(0)), Integer.valueOf(list.get(1)));
					exit = showResult(reader, calc, exit);
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
	private static List<String> enterArgs(Scanner reader) {
		List<String> list = new ArrayList<>();
		
		System.out.println("Enter first number:");
		String firstNum = reader.next();
		list.add(firstNum);
		System.out.println("Enter second number:");
		String secondNum = reader.next();
		list.add(secondNum);
		return list;
	}
	
	private static String showResult(Scanner reader, Calculator calc, String exit) {
		System.out.println("Result:" + calc.getResult());
		System.out.println("Exit: yes/no");
		return exit = reader.next();
	}
}
