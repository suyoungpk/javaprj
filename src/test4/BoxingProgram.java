package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {
	public static void main(String[] args) {
		//�迭�� ��ü��
		// �����͸� �ĺ��ϴ� ����� ���̸� �δ� �迭��
		//1. �����Ͱ� �� �ĺ��ڴ� > Set�迭
		//���� �ߺ��Ǵ� �����ʹ� ��ü�� �ؼ� ������ �Ǿ� ������� �ʴ´�. 
		Set set = new HashSet();
		set.add("hello");
		set.add(37);
		set.add(37.0f);
		set.add(37);
		set.add(37.0f);
		//for(Object obj : set) System.out.print(obj+", "); // ������ �Ųٷ� ���
		//System.out.println();
		//2. �������� ������ �� �ĺ��ڴ� > List�迭
		List list = new ArrayList();
		list.add("hello");
		list.add(37);
		list.add(37.0f);
		list.add(37);
		list.add(37.0f);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i)+", ");
//		}
		//for(Object obj : list) System.out.print(obj+", ");
		//> �Է��� �����͸� �����ö� ������ �����Ѵ�.
//		System.out.println(list.get(0));
		//3. �������� �ĺ��ڰ� �����ִ� > Map�迭 : �Ͻ����� ��ü�� �ʿ��� ��쿡 ����
		Map map = new HashMap(); // key�� ���� �ִ�, > �׷�Ǿ��ִ� �����͸� ����ϱ� ����
		map.put("�̸�","ȫ�浿");
		map.put("����","17");
		map.put("�ּ�","�Ѿ�");
		//System.out.println(map.get("����"));
		
		//for (Object m: map.keySet()) System.out.println(m); // key ����ϱ�
		for (Object m: map.keySet()) System.out.println(map.get(m)); // key ����ϱ�

		System.out.println(map.keySet());
		
		// Generic
		
	}
}
