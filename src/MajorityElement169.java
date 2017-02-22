import java.util.HashMap;

/*169*/
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
    	for(int i = 0; i < nums.length;i++){
    		if (hm.get(nums[i]) == null) {
				hm.put(nums[i], 1);
			}else{
				int temp = hm.get(nums[i]);
				temp++;
				hm.put(nums[i], temp);
			}
    	}
    	for(int i = 0; i < nums.length;i++){
    		if (hm.get(nums[i]) > nums.length / 2) {
				return nums[i];
			}
    	}
        return 0;
    }
}
