package 예외;

public class 반환불가예외 extends Exception {
	@Override
	public String getMessage() {
		
		return "10000을 넘는 값이 반환되어서는 안되는 오류 발생함";
	}
}
