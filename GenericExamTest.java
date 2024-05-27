package generic;

public class GenericExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNum<Integer> numObj1 = new MyNum<Integer>(100, 50);
		MyNum<Double> numObj2 = new MyNum<Double>(20.5, 20.8);
		Opr opr = new Opr();
		System.out.println(opr.add(numObj1));
		System.out.println(opr.mul(numObj1));
		System.out.println("==============================");
		System.out.println(opr.add(numObj2));
		System.out.println(opr.sub(numObj2));
	}

}
