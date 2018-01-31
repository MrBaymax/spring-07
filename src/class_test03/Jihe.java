package class_test03;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Jihe {
	public static void main(String[] args) {
		/*List list=new ArrayList();
		list.add('a');
		list.add(0, "b");
		Object a = list.get(0);
		System.out.println(a);
		list.remove('a');
		for(Object i:list) {
		System.out.println(i);*/
/*		Set hs=new HashSet();
		hs.add("a");
		hs.add("c");
		hs.add("c");
		for(Object o:hs) {
			System.out.println(o);
		}*/
		Map map=new HashMap();
		map.put('a', "123");
		map.put('b', "456");
		map.put('c', "789");
		Set keySet = map.keySet();
		boolean a=map.containsValue("678");
		System.out.println(a);
		/*for(Object ok:keySet) {
			System.out.println(map.get(ok));
		}*/
		}
	}

