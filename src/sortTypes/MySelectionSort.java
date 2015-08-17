package sortTypes;

public class MySelectionSort extends BaseSort {

	@Override
	public void sort(int[] aArray) {
		for(int i=0; i<aArray.length; i++){
			int index = i;
			for(int j=i+1; j<aArray.length; j++){
				if(aArray[j] < aArray[index]){
					index = j;
				} 
			}
			swapNumbers(i, index, aArray);
		}
		printNumbers(aArray);
	}

}
