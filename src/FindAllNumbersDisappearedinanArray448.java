import java.util.List;
import java.util.ArrayList;

public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List result = new ArrayList<>();
        int[] seq = new int[nums.length + 1];
        for(int i = 0; i < seq.length;i++){
        	seq[i] = 0;
        }
        for(int i = 0; i < nums.length;i++){
        	seq[nums[i]]++;
        }
        for(int i = 1; i < seq.length;i++){
        	if (seq[i] == 0) {
				result.add(i);
			}
        }
        return result;
    }
}
