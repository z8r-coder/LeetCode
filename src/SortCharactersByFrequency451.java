import java.util.HashMap;
//此题请用StringBuilder来生成字符串，不然会超时。由于Java中字符串的不变性，每次进行更改时，会将所有字符复制到新的内存空间。
//而StringBuilder则是动态类型，允许动态的添加字符。
public class SortCharactersByFrequency451 {
    public String frequencySort(String s) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	for(int i = 0;i < s.length();i++){
    		if (map.get(s.charAt(i)) == null) {
				map.put(s.charAt(i), 1);
			}else {
				int temp = map.get(s.charAt(i));
				temp++;
				map.put(s.charAt(i), temp);
			}
    	}
    	FreAndCh []fac = new FreAndCh[map.size()];
    	int count = 0;
    	for(Character ch : map.keySet()){
    		FreAndCh fac_temp = new FreAndCh(ch, map.get(ch));
    		fac[count] = fac_temp;
    		count++;
    	}
    	sort(fac, 0, fac.length - 1);
//    	for(int i = 0; i < fac.length;i++){
//    		System.out.println(fac[i].getFre());
//    	}
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0; i < fac.length;i++){
    		for(int j = 0; j < fac[i].getFre();j++){
    			sb.append(fac[i].getCh());
//    			res = res + fac[i].getCh();
    		}
    	}
    	String res = sb.toString();
        return res;
    }
    public int partition(FreAndCh[] arr,int low,int high) {
		FreAndCh key = arr[pivot(low, high)];
		int hi = high;
		arr[pivot(low, high)] = arr[high];
		arr[high] = key;
		while(low < high){
			while(arr[low].getFre() >= key.getFre() && high > low){
				low++;
			}
			while(arr[high].getFre() <= key.getFre() && high > low){
				high--;
			}
			if (low < high) {
				FreAndCh temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}
		arr[hi] = arr[high];
		arr[high] = key;		
    	return high;
	}
    public int pivot(int low ,int high){
    	return (low + high) / 2; 
    }
    public void sort(FreAndCh[] arr,int low, int high) {
		if (low >= high) {
			return;
		}
		int index = partition(arr, low, high);
		sort(arr, low, index - 1);
		sort(arr, index + 1, high);
	}
    class FreAndCh{
    	char ch;
    	int fre;
    	public FreAndCh(char ch,int fre) {
			// TODO Auto-generated constructor stub
    		this.ch = ch;
    		this.fre = fre;
    	}
    	public char getCh() {
			return ch;
		}
    	public int getFre() {
			return fre;
		}
    }
}
