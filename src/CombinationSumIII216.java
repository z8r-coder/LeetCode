import java.util.ArrayList;
import java.util.List;
public class CombinationSumIII216 {
	List<List<Integer>> res = new ArrayList<>();
	List<Integer> out = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {

    	dfs(k, n, 1);
        return res;
    }
    
    void dfs(int k, int n,int level){
    	if (n < 0) {
			return;
		}
    	if (n == 0 && out.size() == k) {
			res.add(out);
			out = new ArrayList<>();
		}
    	for(int i = level; i <= 9;i++){
    		out.add(i);
    		dfs(k, n - i, i + 1);
    		if (out.size() != 0) {
    			out.remove(out.size() - 1);
			}
    	}
    }
}
