/*343*/
import java.util.Vector;

public class IntegerBreak343 {
    public int integerBreak(int n) {
    	Vector<Integer> vc = new Vector<>();
    	if (n == 2 || n == 3) {
			return n - 1;
		}else if (n == 4) {
			return n;
		}else {
			while(n > 4){
				n = n - 3;
				vc.add(3);
			}
			vc.add(n);
			int temp = 1;
			for(int i = 0;i < vc.size();i++){
				temp = temp * vc.get(i);
			}
			return temp;
		}
    }
}
