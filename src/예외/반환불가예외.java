package 예외;

public class 반환불가예외 extends Exception {
	@Override
	public String getMessage() {
		//안된다니깐요?????????????????????????????
		return "10000을 넘는 값이 반환되어서는 안되는 오류 발생함";
	}
}
