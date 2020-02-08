package DataAndOperation;

public class Casting {
	public static void main(String[] args) {
		double a = 1.1;
		double b = 1; //자동
		double b2 = (double) 1; //수동
		System.out.println(b);
		
		//int c = 1.1;
		double d = 1.1;
		int e = (int) 1.1;
		System.out.println(e); //1로 출력. 0.1의 손실이 생겼다
		
		String f = Integer.toString(1);
		System.out.println(f.getClass()); //변수가 어떤 데이터 타입인지 알려준다 class java.lang.String
	}
}
