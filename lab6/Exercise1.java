package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
	List getValues(HashMap<Integer,Integer> map) {
		List<Integer> store = new ArrayList<>();
		for (int n : map.values())  {
			store.add(n);
		}
			Collections.sort(store);  
			return store;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1, 355);
		map.put(2, 353);
		map.put(3, 359);
		map.put(4, 350);
		map.put(5, 35);
		Exercise1 e1= new Exercise1();
		System.out.println(e1.getValues(map));

	}

}
