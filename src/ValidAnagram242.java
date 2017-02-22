import java.util.HashMap;

/*242*/
public class ValidAnagram242 {
	boolean flag = true;
    public boolean isAnagram(String s, String t) {
    	if (s.length() != t.length()) {
			return false;
		}
    	HashMap<Character, Integer> hm = new HashMap<>();
    	for(int i = 0;i < s.length();i++){
    		if (hm.get(s.charAt(i)) == null) {
				hm.put(s.charAt(i), 1);
			}else{
				int temp = hm.get(s.charAt(i));
				temp++;
				hm.put(s.charAt(i), temp);
			}
    	}
    	for(int i = 0; i < t.length();i++){
    		if (hm.get(t.charAt(i)) == null) {
				flag = false;
				break;
			}else {
				int temp = hm.get(t.charAt(i));
				temp--;
				if (temp < 0) {
					flag = false;
					break;
				}
				hm.put(t.charAt(i), temp);
			}
    	}
    	return flag;
    }
}
