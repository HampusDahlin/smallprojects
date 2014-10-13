package insertionSort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] notSorted = {5,1,5,4,3,1,2,2,3,4,9};

		System.out.print("notSorted: ");
		for(int i = 0; i < notSorted.length; i++){
			System.out.print(notSorted[i] + ", ");
		}

		System.out.println();
		
		int[] sorted = sort(notSorted);

		System.out.print("sorted: ");
		for(int i = 0; i < sorted.length; i++){
			System.out.print(sorted[i] + ", ");
		}
	}
	
	public static int[] sort(int[] data){
	
		for(int i = 1; i < data.length; i++){
			for(int j = i; j > 0 && data[j] < data[j-1]; j--){
				int tmp = data[j];
				data[j] = data[j-1];
				data[j-1] = tmp;
			}
		}
		
		return data;
	}
}
