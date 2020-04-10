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