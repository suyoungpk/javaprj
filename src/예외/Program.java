package 예외;
//응용프로그램
public class Program {
	 public static void main(String[] args) {
		 try{ // 오류가 생길 경우 그게 무엇인지 try 블럭에 작성
			 Thread.sleep(1000);
			 int sum = Calculator.add(10040, 3); 
			 System.out.println("sum : "+sum);
		 }catch(반환불가예외 aa) { //해당하는 오류를 처리해주는 클래스객체에  어떻게 할건지 아래 구문에 적어준다.
			 //Exception 이것은 여러 예외상황을 담아주는 클래스 
			 System.out.println(aa.getMessage());
			 // e.getMessage()
			 
		 }
		 catch(Exception aa) { //해당하는 오류를 처리해주는 클래스객체에  어떻게 할건지 아래 구문에 적어준다.
			 //Exception 이것은 여러 예외상황을 담아주는 클래스 
			 System.out.println("죄송합니다. 안되네요");
			 // e.getMessage()
			 
		 }
		 finally {
			 // 예를들어 파일을 열었을때 오류가 발생한경우 예외처리후 닫아줘야지
			 //이런 마무리하는 작업
			  System.out.println("finally..");
		 }
		 System.out.println("종료");
//		 catch (InterruptedException e) {
//			 System.out.println("ㅠㅠㅠ");
//		 } 
	}
}
