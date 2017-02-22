import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
    	HashMap<Character, Integer> hm = new HashMap<>();
    	if (s.length() == 0) {
			return -1;
		}
    	for(int i = 0; i < s.length();i++){
    		if (hm.get(s.charAt(i)) == null) {
				hm.put(s.charAt(i), 1);
			}else{
				int temp = hm.get(s.charAt(i));
				temp++;
				hm.put(s.charAt(i), temp);
			}
    	}
    	for(int i = 0; i < s.length();i++){
    		if (hm.get(s.charAt(i)) == 1) {
				return i;
			}
    	}
    	return -1;
    }
}
