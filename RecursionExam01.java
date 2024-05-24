package recursion;

public class RecursionExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = length("java");
		System.out.println("문자열의 길이=>"+result);
	}
	public static int length(String str) {
		System.out.println(str.substring(1));
		if(str.equals(" ")) {
			return 0;
		}else {
			return 1+length(str.substring(1));
		}
	}

}
