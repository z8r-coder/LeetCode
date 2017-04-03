import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public List<String> generateParenthesis(int n) {
    	List<String> res = new ArrayList<>();
    	dfs(res, "", n, n);
        return res;
    }
    public void dfs(List<String> res, String tmp,int left,int right) {
		if (left == 0 && right == 0) {
			res.add(tmp);
			return;
		}else if (left > 0) {
			dfs(res, tmp + "(", left - 1, right);
		}
		if (left < right) {
			dfs(res, tmp + ")", left, right - 1);
		}
	}
}
