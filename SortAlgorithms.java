
import java.util.*;

public class SortAlgorithms {
	private int[] arrDate = new int[10];
	private int arrSize = arrDate.length;
	
	public void randomArray() {
		Random random = new Random();
		for(int i = 0; i< arrSize; i++) {
			arrDate[i] = random.nextInt(10)+10;
		}
	}
	//print menthod
	public void print() {
		System.out.println("--------------");
		for (int i = 0; i < arrSize; i++) {
			System.out.print(i + "| ");
			System.out.print(arrDate[i] + ", ");
			
		}
		System.out.println(" ");
		System.out.println("--------------");
	}
	
	public void BubbleSort() {
		int temp;
		for (int i = arrSize; i >1; i--) {
			for(int j =1; j< i;j++ ) {
				if(arrDate[j-1]>arrDate[j]) {
					temp = arrDate[j-1];
					arrDate[j-1] = arrDate[j];
					arrDate[j] = temp;
				}			
			}
			
			//System.out.print(arrDate[i-1] + " ");
		}
		System.out.println(Arrays.toString(arrDate));
	}
	
	//Binary search
	public void binarySearch(int value) {
		int first = 0;
		int last = arrSize-1;
		int mid = (first+last)/2;
		
		while (first <= last) {
			if(arrDate[mid] < value) {
				first = mid + 1;
			}else if(arrDate[mid] > value){
				last = mid -1 ;
			}else {System.out.println("The value " + value + "'s index is :" + mid);
				first = last +1;
			}
		}
	}
	public static void main(String[] args) {
		SortAlgorithms sort = new SortAlgorithms();
		sort.randomArray();
		sort.print();
		sort.BubbleSort();
		sort.binarySearch(14);
	}

}
