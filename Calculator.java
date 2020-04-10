/**
	класс реализует калькулятор
*/
public class Calculator {
	/**
		результат вычислений
	*/
	private int result;
	
	/**
		Опреация сложения
		@param params аргументы суммирования
	*/
	public void add(int ...params){
		for (Integer param: params) {
			this.result += param;
		}
	}
	/**
		Опреация вычитания
		@param param1, param2 аргументы разности
	*/
	public void subtract (int param1, int param2){	
			this.result = param1 - param2;
	}
	/**
		Опреация умножения
		@param param1, param2 аргументы произведения
	*/
	public void multipl (int param1, int param2){	
			this.result = param1 * param2;
	}
	/**
		Опреация деления
		@param param1, param2 аргументы частного
	*/
	public void division (int param1, int param2){	
			this.result = param1 / param2;
	}
	/**
		Опреация степени
		@param param1, param2 аргументы степени
	*/
	public void power (int param1, int param2){	
			this.result = (int) Math.pow(param1, param2);
	}
	/**
		Получить результат выражения
		@return результат выражения
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
		Очистить результат вычисления
	*/
	public void clearResult(){
		this.result = 0;
	}
}