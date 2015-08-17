package sortTypes;

public class MyQuickSort extends BaseSort{
	private int[] mArray;
	
	private void quickSort(int lowerIndex, int higherIndex){
		int i=lowerIndex;
		int j=higherIndex;
		int pivot = mArray[lowerIndex+(higherIndex-lowerIndex)/2];
		
		while(i<=j){
			while(mArray[i] < pivot){
				i++;
			}
			while(mArray[j] > pivot){
				j--;
			}
			if(i<=j){
				swapNumbers(i, j, mArray);
				//move i,j to next positions
				i++;
				j--;
			}
		}
		if(lowerIndex < j){
			quickSort(lowerIndex, j);
		}
		if(higherIndex > i){
			quickSort(i, higherIndex);
		}
	}
	
	@Override
	public void sort(int[] aArray) {
		int lowerIndex = 0;
		int higherIndex = aArray.length - 1;
		mArray = aArray;
		quickSort(lowerIndex, higherIndex);
				
		printNumbers(mArray);
		
	}

}
