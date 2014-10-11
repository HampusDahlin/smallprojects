package mergeSort;

public class MergeSort {

	public static void main(String[] args){
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

		if(data.length == 1){
			return data;
		}else if(data.length == 2){
			if(data[0] < data[1]){
				return data;
			}else{
				int l = data[0];
				data[0] = data[1];
				data[1] = l;
				return data;
			}
		}else{
			int[] lSplit = new int[data.length/2];
			int[] rSplit = new int[data.length - data.length/2];

			for(int i = 0; i < data.length; i++){
				if(i < data.length/2){
					lSplit[i] = data[i];
				}else{
					rSplit[i - data.length/2] = data[i];
				}
			}

			lSplit = sort(lSplit);
			rSplit = sort(rSplit);
			int lIndex = 0;
			int rIndex = 0;

			for(int i = 0; i < data.length; i++){
				if(lIndex + 1 > lSplit.length){
					data[i] = rSplit[rIndex];
					rIndex++;
				}else if(rIndex + 1 > rSplit.length){
					data[i] = lSplit[lIndex];
					lIndex++;
				}else{
					if(lSplit[lIndex] < rSplit[rIndex]){
						data[i] = lSplit[lIndex];
						lIndex++;
					}else{
						data[i] = rSplit[rIndex];
						rIndex++;
					}
				}
			}

			return data;
		}
	}
}
