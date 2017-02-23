
public class KthSmallestElement378 {
    public int kthSmallest(int[][] matrix, int k) {
    	int[] heap_k = new int[k];
    	int temp = 0;
    	for(int i = 0; i < matrix.length;i++){
    		for(int j = 0; j < matrix[0].length;j++){
    			if (temp == k) {
    				replaceFirst(heap_k, matrix[i][j], k);
				}else {
					heap_k[temp] = matrix[i][j];
	    			temp++;
	    			if (temp == k) {
	    				buildHeap(heap_k, k);
					}
				}
    		}
    	}
    	return heap_k[0];
    }
    //parent:   r - 1/ 2  r != 0
    //leftChild 2*r + 1   2*r + 1 < n
    //rightChild 2*r + 2  2*r + 2 < n
    //leftSibling r - 1   r为偶数
    //rightSibling r + 1  r为偶数
    private void replaceFirst(int []heap,int element,int n) {
		if (element < heap[0]) {
			heap[0] = element;
			siftDown(heap, 0, n);
		}
	}
    private void swap(int[] heap,int pos_1, int pos_2){
    	int temp = heap[pos_1];
    	heap[pos_1] = heap[pos_2];
    	heap[pos_2] = temp;
    }
    //pos要调整，堆大小为n
    private void siftDown(int[] heap, int pos,int n){
    	while(!isLeaf(pos, n)){    		
    		int j = leftChild(pos);
    		int rc = rightChild(pos);
    		//位置j为更大
    		if ((rc < n) && (heap[j] < heap[rc])) {
				j = rc;
			}
    		if (heap[pos] > heap[j]) {
				return;
			}
    		swap(heap, j, pos);
    		pos = j;
    	}
    }
    public boolean isLeaf(int pos,int n) {
		return (pos >= n / 2) && (pos < n);
	}
    public int parent(int pos) {
		return (pos - 1) / 2;
	}
    public int leftChild(int pos) {
		return 2*pos + 1;
	}
    public int rightChild(int pos) {
		return 2*pos + 2;
	}
    public void buildHeap(int[] heap,int n) {
		for(int i = n / 2 - 1; i >= 0; i--){
			siftDown(heap, i, n);
		}
	}
}
