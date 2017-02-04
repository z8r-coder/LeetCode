import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] seq = new int[nums.length + 1];
        for(int i = 0; i < nums.length;i++){
        	seq[nums[i]]++;
        }
        for(int i = 0; i < seq.length;i++){
        	if (seq[i] == 2) {
				res.add(i);
			}
        }
        return res;
    }
}
