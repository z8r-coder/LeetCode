import java.util.HashMap;
import java.util.Vector;

/*350*/
public class IntersectionofTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Vector<Integer> vc = new Vector<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i < nums1.length;i++){
        	if (hm.get(nums1[i]) == null) {
				hm.put(nums1[i], 1);
			}else {
				int temp = hm.get(nums1[i]);
				temp++;
				hm.put(nums1[i], temp);
			}
        }
        for(int i = 0; i < nums2.length;i++){
        	if (hm.get(nums2[i]) != null) {
				int temp = hm.get(nums2[i]);
				temp--;
				if (temp <= 0) {
					hm.remove(nums2[i]);
				}else {
					hm.put(nums2[i], temp);
				}
				vc.add(nums2[i]);
			}
        }
        int[] nums = new int[vc.size()];
        for(int i = 0; i < vc.size();i++){
        	nums[i] = vc.get(i);
        }
        return nums;
    }
}
