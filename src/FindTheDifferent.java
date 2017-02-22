import java.util.HashMap;

public class FindTheDifferent {
	public char findTheDifference(String s, String t) {//t由s随即加了个字符组成
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i = 0; i < s.length();i++){
			if (hm.get(s.charAt(i)) == null) {
				hm.put(s.charAt(i), 1);
			}else {
				int temp = hm.get(s.charAt(i));
				temp++;
				hm.put(s.charAt(i), temp);
			}
		}
		for(int i = 0; i < t.length();i++){
			if (hm.get(t.charAt(i)) == null) {
				return t.charAt(i);
			}else{
				int temp = hm.get(t.charAt(i));
				--temp;
				if (temp < 0) {
					return t.charAt(i);
				}else {
					hm.put(t.charAt(i), temp);
				}
			}
		}
		return 'c';
    }
}
