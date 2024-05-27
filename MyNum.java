package generic;

public class MyNum<T> {
	T num1;
	T num2;
	public MyNum(T num1, T num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public T getNum1() {
		return num1;
	}
	public void setNum1(T num1) {
		this.num1 = num1;
	}
	public T getNum2() {
		return num2;
	}
	public void setNum2(T num2) {
		this.num2 = num2;
	}
	
}
