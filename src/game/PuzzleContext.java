//package game;
//
//public class PuzzleContext {// 퍼즐내에서 그리기 메서드를 동작시키기위해 
//	//캔버스 설정시에 충돌되는 상속관계를 새 클래스 설정으로 우회하여 사용할 수 있다.
//	private static PuzzleCanvas2 canvas;
//
//	public static PuzzleCanvas2 getCanvas() {
//		return canvas;
//	}
//
//	public static void setCanvas(PuzzleCanvas2 canvas) {
//		if (PuzzleContext.canvas == null)
//			PuzzleContext.canvas = canvas; 		
//		// static으로 되면서 
//		// 전역 메서드가 되므로, this를 쓰게 되면 오류나는데 
//		// 그때 해당하는 변수의 클래스를 붙여 써줌으로 표기를 한다.
//	}
//	
//}
