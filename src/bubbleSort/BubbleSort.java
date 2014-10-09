package bubbleSort;

public class BubbleSort {

	public static void main(String[] args){
		int[] notSorted = {5,1,5,4,3,1,2,2,3,4,9};
		
		for(int i = 0; i < notSorted.length; i++){
			System.out.print(notSorted[i] + ", ");
		}
		
		int[] sorted = sort(notSorted);
		
		for(int i = 0; i < sorted.length; i++){
			System.out.print(sorted[i] + ", ");
		}
	}

	public static int[] sort(int[] data){ 
		
		boolean sorted = false;
		while(!sorted){
			sorted = true;
			for(int i = 0; i < data.length - 1; i++){
				if(data[i] > data[(i+1)]){
					int j = data[i];
					data[i] = data[i+1];
					data[i+1] = j;
					sorted = false;
				}
			}
		}
		
		System.out.println("\nYOU JUST GOT SORTED!");
		return data;
	}
}
