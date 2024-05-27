package generic;

public class Opr {
	public <T> double add(MyNum<T> numObj) {
		double num1 = ((Number) numObj.getNum1()).doubleValue();
		double num2 = ((Number) numObj.getNum2()).doubleValue();
		return num1 + num2;
	}
	public <T> double sub(MyNum<T> numObj) {
		double num1 = ((Number) numObj.getNum1()).doubleValue();
		double num2 = ((Number) numObj.getNum2()).doubleValue();
		return num1 - num2;
	}
	public <T> double mul(MyNum<T> numObj) {
		double num1 = ((Number) numObj.getNum1()).doubleValue();
		double num2 = ((Number) numObj.getNum2()).doubleValue();
		return num1 * num2;
	}
	public <T> double div(MyNum<T> numObj) {
		double num1 = ((Number) numObj.getNum1()).doubleValue();
		double num2 = ((Number) numObj.getNum2()).doubleValue();
		return num1 /num2;
	}
}
