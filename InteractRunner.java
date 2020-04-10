import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		try {
			Calculator calc = new Calculator();
			String exit = "no";

			while(!exit.equals("yes")){
				System.out.println("Enter first number:");
				String firstNum = reader.next();
				System.out.println("Enter second number:");
				String secondNum = reader.next();
				calc.add(Integer.valueOf(firstNum), Integer.valueOf(secondNum));
				System.out.println("Result:" + calc.getResult());
				System.out.println("Exit: yes/no");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
		
	}
}
