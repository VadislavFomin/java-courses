public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate...");

		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);

		int sum = first + second;
		int mult = first * second;
		int power = first^second;
		int priv = first / second;

		System.out.println("Sum " + sum);
		System.out.println("Mult " + mult);
		System.out.println("Power " + power);
		System.out.println("Priv " + priv);
		

	}
}