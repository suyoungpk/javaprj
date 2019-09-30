package 예외;
//API
public class Calculator {
	public static int add(int x, int y) throws 반환불가예외 {
		int result = x+y;
		if(result > 10000) 
			throw new 반환불가예외();
			//System.out.println("예외");//너무 커서 반환할 수 없는 예외
		return result;
	}
	public static int sub(int x, int y) {
		int result = x-y;
		return result;
	}
	public static int div(int x, int y) {
		int result = x/y;
		return result;
	}
}
