package generic;

public class GenericMethodTest {
	public static<T,V> double genericTest(Point<T,V> p1,Point<T,V>p2) {
		double result = 0.0;
		double left = ((Number) p1.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		
		double right = ((Number) p2.getX()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		result = width * height;
		return result;
			
	}
	public static<T1,V1,T2,V2> double genericTest2(Point<T1,V1> p1,Point<T2,V2>p2) {
		double result = 0.0;
		double left = ((Number) p1.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		
		double right = ((Number) p2.getX()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		result = width * height;
		return result;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point<Integer, Double> point1 = new Point<Integer, Double>(10, 10.5);
		Point<Integer, Double> point2 = new Point<Integer, Double>(25, 30.5);
		
		Point<Integer, Double> point3 = new Point<Integer, Double>(10, 10.5);
		Point<Double, Integer> point4 = new Point<Double, Integer>(30.8, 25);
		double rectArea = genericTest(point1, point2);
		double rectArea2 = genericTest2(point3, point4);
		System.out.println("면적은"+rectArea+"이다");
		System.out.println("면적은"+rectArea2+"이다");
	}

}
