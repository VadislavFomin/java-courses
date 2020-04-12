
/**
	класс реализует калькулятор
*/
public class Calculator {
	public Calculator() {
		super();
		
	}
	/**
		результат вычислений
	*/
	private float result;
	
	/**
		Опреация сложения
		@param params аргументы суммирования
	*/
	public void add(int param1, int param2){
		this.result = (param1 + param2);
	}
	
	/**Опреация вычитания
	 * @param param1 первое число
	 * @param param2 второе число
	 */
	public void subtract (int param1, int param2){	
			this.result = (param1 - param2);
	}
	/**
		Опреация умножения
	* @param param1 первое число
	* @param param2 второе число
	*/
	public void multipl (int param1, int param2){	
			this.result = param1 * param2;
	}
	/**
		Опреация деления
	* @param param1 первое число
	* @param param2 второе число
	*/
	public void division (int param1, int param2){	
			this.result = ((float)param1 / (float)param2);
	}
	/**
		Опреация степени
	 * @param param1 первое число
	 * @param param2 второе число
	 */
	public void power (int param1, int param2){	
			this.result = (float) Math.pow(param1, param2);
	}
	/**
		Получить результат выражения
		@return результат выражения
	*/
	public float getResult(){
		return this.result;
	}
	
	/**
		Очистить результат вычисления
	*/
	public void clearResult(){
		this.result = 0;
	}
}