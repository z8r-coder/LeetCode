/*268*/
import java.util.HashMap;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
    	HashMap<Integer, Integer> hm = new HashMap<>();
    	for(int i = 0;i < nums.length;i++){
    		hm.put(nums[i], 1);
    	}
    	for(int i = 0;i <= nums.length;i++){
    		if (hm.get(i) == null) {
				return i;
			}
    	}
        return 0;
    }
}
