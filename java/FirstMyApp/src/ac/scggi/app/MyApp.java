package ac.scggi.app;

public class MyApp {
	// 함수 정의, 주석(실행과 아무런 관련이 없음)
	public static void main(String[] args) {
		int total = 0; // 변수 선언
		float mul = 0f;
		System.out.println("Hello World!");
		total = sum(1, 2);
		System.out.println(total);
		total = subtract(1, 2);
		//mul = multiply(1f, 2f);
		MyApp myApp = new MyApp();// 클래스의 인스턴스를 생성
		mul = myApp.multiply(1f, 2f);
		// mul을 출력하세요
		System.out.println(mul);
	}
	
	static int subtract(int x, int y) {
		return x-y;
	}
	
	static int sum(int x, int y) {
		return x+y;
	}
	
	float multiply(float x, float y) {
		return x*y;
	}
}
