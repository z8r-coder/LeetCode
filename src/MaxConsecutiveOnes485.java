
public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int max = -1;
    	int count = 0;
    	for(int i = 0; i < nums.length;i++){
    		if (nums[i] == 0) {
				if (count > max) {
					max = count;
				}
				count = 0;
			}else {
				count++;
			}
    	}
    	if (count > max) {
			max = count;
		}
    	//System.out.print(max);
        return 0;
    }
}
