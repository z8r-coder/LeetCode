import java.util.Vector;

public class NumberComplement476 {
	Vector<Integer> vc_1 = new Vector<>();
	Vector<Integer> vc_2 = new Vector<>();
    public int findComplement(int num) {
    	int sum = 0;
    	int count = 0;
    	while(num != 0){
    		int temp = num % 2;
    		num = num / 2;
    		if (temp == 1) {
				temp = 0;
			}else {
				temp = 1;
			}
    		vc_1.add(temp);
    		vc_2.add(count);
    		count++;
    	}
    	//System.out.println(vc_1.size());
    	for(int i = 0; i < vc_1.size();i++){
    		if (vc_2.get(i) == 0) {
				sum = sum + vc_1.get(i);
			}else {
				int sum_2 = 1;
				for(int j = 0; j < vc_2.get(i);j++){
					sum_2 = sum_2 * 2;
				}
				sum = sum + vc_1.get(i) * sum_2;
			}
    	}
        return sum;
    }
}
