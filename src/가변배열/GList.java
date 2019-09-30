package 가변배열;
//여기다가 충돌코드 작성!
public class GList<길동> {
	private 길동[] data;
	private int index;
	private int max;
	
	public GList() {
		max = 3;
		data = (길동[]) new Object[max];
		index = 0;
	}
	public int size() {
		return index;
	}
	public void add(길동 value) {
		//공간이 있다면 저장 아니면 배열 늘려주기
		if (index>=max) {
			//공간 늘려주기
			//1.이주할 Object형식의 임시 배열 temp +5보다 더 큰 생성
			길동[] temp = (길동[]) new Object[max+5];
			//2. data 배열의 값들을 temp배열로 옮긴다.
			for (int i = 0; i < max; i++) temp[i] = data[i];
			//3. temp 배열의 이름을 data라는 이름으로 변경한다.
//			 A a:1004 = new A();
//			 A b:1004 = a:1004;
			 data = temp;
			//4.max의 값을 +5 증가 시킨다.
			 max += 5;
		}
		data[index] = value;
		index++;
	}
	public 길동 get(int value) {
		return data[value];
	}
}
