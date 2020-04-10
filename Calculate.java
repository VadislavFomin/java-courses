public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate...");

		double first = doubleValue(arg[0]);
		double second = doubleValuev(arg[1]);

		double sum = first + second;
		double mult = first * second;
		double power = Math.power();
		double priv = first / second;
		
		

		System.out.println("Sum " + sum);
		System.out.println("Mult " + mult);
		System.out.println("Power " + power);
		System.out.println("Priv " + priv);
		

	}
}