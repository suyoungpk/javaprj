package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxingProgram {
	public static void main(String[] args) {
		//배열의 대체제
		// 데이터를 식별하는 방법에 차이를 두는 계열들
		//1. 데이터가 곧 식별자다 > Set계열
		//값이 중복되는 데이터는 대체를 해서 누적이 되어 저장되지 않는다. 
		Set set = new HashSet();
		set.add("hello");
		set.add(37);
		set.add(37.0f);
		set.add(37);
		set.add(37.0f);
		//for(Object obj : set) System.out.print(obj+", "); // 순서가 거꾸로 출력
		//System.out.println();
		//2. 데이터의 순서가 곧 식별자다 > List계열
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
		//> 입력한 데이터를 가져올때 순서를 기준한다.
//		System.out.println(list.get(0));
		//3. 데이터의 식별자가 따로있다 > Map계열 : 일시적인 객체가 필요할 경우에 사용됨
		Map map = new HashMap(); // key가 따로 있다, > 그룹되어있는 데이터를 사용하기 좋음
		map.put("이름","홍길동");
		map.put("나이","17");
		map.put("주소","한양");
		//System.out.println(map.get("나이"));
		
		//for (Object m: map.keySet()) System.out.println(m); // key 출력하기
		for (Object m: map.keySet()) System.out.println(map.get(m)); // key 출력하기

		System.out.println(map.keySet());
		
		// Generic
		
	}
}
