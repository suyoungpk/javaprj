package �����迭;
//����ٰ� �浹�ڵ� �ۼ�!
public class GList<�浿> {
	private �浿[] data;
	private int index;
	private int max;
	
	public GList() {
		max = 3;
		data = (�浿[]) new Object[max];
		index = 0;
	}
	public int size() {
		return index;
	}
	public void add(�浿 value) {
		//������ �ִٸ� ���� �ƴϸ� �迭 �÷��ֱ�
		if (index>=max) {
			//���� �÷��ֱ�
			//1.������ Object������ �ӽ� �迭 temp +5���� �� ū ����
			�浿[] temp = (�浿[]) new Object[max+5];
			//2. data �迭�� ������ temp�迭�� �ű��.
			for (int i = 0; i < max; i++) temp[i] = data[i];
			//3. temp �迭�� �̸��� data��� �̸����� �����Ѵ�.
//			 A a:1004 = new A();
//			 A b:1004 = a:1004;
			 data = temp;
			//4.max�� ���� +5 ���� ��Ų��.
			 max += 5;
		}
		data[index] = value;
		index++;
	}
	public �浿 get(int value) {
		return data[value];
	}
}
