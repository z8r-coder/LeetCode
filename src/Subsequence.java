import java.util.Stack;

public class Subsequence {
	public boolean isSubsequence(String s,String t) {//sÊÇ×Ó´®,tÊÇ¸¸´®
		Stack<Character> st_parent = new Stack<>();
		Stack<Character> st_sub = new Stack<>();
		for(int i = 0; i < s.length();i++){
			st_sub.push(s.charAt(i));
		}
		for(int i = 0; i < t.length();i++){
			st_parent.push(t.charAt(i));
		}
		for(int i = st_sub.size() - 1; i >= 0;i--){
			//System.out.println(1);
			for(int j = st_parent.size() - 1; j >= 0;j--){
				
				if (st_parent.pop() == st_sub.get(i)) {
					st_sub.pop();
					j = st_parent.size();
					break;
				}
				j = st_parent.size();
			}
			i = st_sub.size();
			if (st_parent.size() == 0) {
				break;
			}
		}
		if (st_sub.size() == 0) {
			return true;
		}
		else{
			return false;
		}
	}
}
