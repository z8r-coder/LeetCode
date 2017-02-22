import java.util.Vector;

public class RansomNote {
	public boolean canConstruct(String ransomNote,String magazine) {
		Vector<Character> vc = new Vector<>();
		for(int i = 0; i < magazine.length();i++){
			vc.add(magazine.charAt(i));
		}
		for(int i = 0;i < ransomNote.length();i++){
			boolean flag = false;
			for(int j = 0; j < vc.size();j++){
				if (ransomNote.charAt(i) == vc.get(j)) {
					vc.remove(j);
					flag = true;
					break;
				}
			}
			if (flag == false) {
				return false;
			}
		}
		return true;
	}
}
