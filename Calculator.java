/**
	����� ��������� �����������
*/
public class Calculator {
	/**
		��������� ����������
	*/
	private int result;
	
	/**
		�������� ��������
		@param params ��������� ������������
	*/
	public void add(int ...params){
		for (Integer param: params) {
			this.result += param;
		}
	}
	/**
		�������� ���������
		@param param1, param2 ��������� ��������
	*/
	public void subtract (int param1, int param2){	
			this.result = param1 - param2;
	}
	/**
		�������� ���������
		@param param1, param2 ��������� ������������
	*/
	public void multipl (int param1, int param2){	
			this.result = param1 * param2;
	}
	/**
		�������� �������
		@param param1, param2 ��������� ��������
	*/
	public void division (int param1, int param2){	
			this.result = param1 / param2;
	}
	/**
		�������� �������
		@param param1, param2 ��������� �������
	*/
	public void power (int param1, int param2){	
			this.result = (int) Math.pow(param1, param2);
	}
	/**
		�������� ��������� ���������
		@return ��������� ���������
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
		�������� ��������� ����������
	*/
	public void clearResult(){
		this.result = 0;
	}
}