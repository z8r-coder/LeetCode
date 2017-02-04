
public class ProductofArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
    	int[] seq = new int[nums.length];
    	int mutiSum = 1;
    	int count = 0;//Êý0
    	for(int i = 0; i < nums.length;i++){
    		if (nums[i] == 0) {
				count++;
			}
    		if (count == 2) {
    			break;
			}
    	}
    	if (count == 2) {
			for(int i = 0; i < nums.length;i++){
				seq[i] = 0;
			}
			return seq;
		}
    	for(int i = 0; i < nums.length;i++){
    		if (nums[i] == 0) {
				continue;
			}else {
				mutiSum = mutiSum * nums[i];
			}
    	}
    	for(int i = 0; i < nums.length;i++){
    		if (nums[i] == 0) {
				seq[i] = mutiSum;
			}else {
				if (count == 1) {
					seq[i] = 0;
				}else {
					seq[i] = mutiSum / nums[i];
				}
			}
    	}
        return seq;
    }
}
