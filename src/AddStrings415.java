
public class AddStrings415 {
    public String addStrings(String num1, String num2) {
    	int n = num1.length() - 1;
    	int m = num2.length() - 1;
    	int mod = 0;//½øÎ»
    	String sum = "";
    	while(n >= 0 && m >= 0){
    		int d1 = Integer.parseInt(num1.charAt(n) + "");
    		int d2 = Integer.parseInt(num2.charAt(m) + "");
    		int ds = d1 + d2 + mod;
    		int res = ds % 10;
    		mod = (ds - res) / 10;
    		sum = res + sum;
    		n--;
    		m--;
    	}
    	while(n >= 0){
    		int d1 = Integer.parseInt(num1.charAt(n) + "");
    		int ds = d1 + mod;
    		int res = ds % 10;
    		mod = (ds - res) / 10;
    		sum = res + sum;
    		n--;
    	}
    	while(m >= 0){
    		int d1 = Integer.parseInt(num2.charAt(m) + "");
    		int ds = d1 + mod;
    		int res = ds % 10;
    		mod = (ds - res) / 10;
    		sum = res + sum;
    		m--;
    	}
    	if (mod != 0) {
    		sum = mod + sum;
		}
        return sum;
    }
}
