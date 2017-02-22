import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopK {
	public List<Integer> topKFrequent(int[] nums,int k) {
		List<Integer> lt = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.get(nums[i])!= null) {
				int temp = hm.get(nums[i]);//pat:integer->key,num->value
				hm.put(nums[i], ++temp);
			}
			else {
				hm.put(nums[i], 1);
			}
		}

		while(k > 0){
			int temp = 0;
			int el = 0;
			for(Integer i:hm.keySet()){
				if (hm.get(i) > temp) {
					temp = hm.get(i);
					el = i;
				}
			}
			k--;
			hm.remove(el);
			lt.add(el);
		}
		return lt;
	}
}
