//深度优先
public class TargetSum494 {
	int result = 0;
    public int findTargetSumWays(int[] nums, int S) {
    	dfs(0, 0, nums, S);
        return result;
    }
    public void dfs(int sum,int cnt,int[] nums,int S) {
		if (cnt == nums.length) {
			if (sum == S) {
				result++;
			}
			return;
		}
		dfs(sum + nums[cnt], cnt + 1, nums, S);
		dfs(sum - nums[cnt], cnt + 1, nums, S);
	}
}
