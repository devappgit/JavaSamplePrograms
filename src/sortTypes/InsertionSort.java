package sortTypes;

public class InsertionSort extends BaseSort {

	@Override
	public void sort(int[] aArray) {
		for(int i=0; i<aArray.length; i++){
			for(int j=i; j>0; j--){
				if(aArray[j] < aArray[j-1]){
					swapNumbers(j, j-1, aArray);
				}
			}
		}
		printNumbers(aArray);
	}

}
