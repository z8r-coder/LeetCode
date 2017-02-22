/*217*/
import java.util.HashMap;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
    	HashMap<Integer, Integer> hm = new HashMap<>();
    	for(int i = 0; i < nums.length;i++){
    		if (hm.get(nums[i]) == null) {
				hm.put(nums[i], 1);
			}else {
				int temp = hm.get(nums[i]);
				temp++;
				hm.put(nums[i], temp);
			}
    	}
    	for(int i = 0; i < nums.length;i++){
    		if (hm.get(nums[i]) > 1) {
				return true;
			}
    	}
        return false;
    }
}
