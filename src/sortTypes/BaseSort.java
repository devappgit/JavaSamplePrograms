package sortTypes;

public abstract class BaseSort implements SortType{
	
	protected void printNumbers(int[] array){
		System.out.println("Sorted integers are as follows:");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+ " ");
		}
	}
	
	protected int[] swapNumbers(int a, int b, int[] sortedArray){
		int temp = sortedArray[a];
		sortedArray[a] = sortedArray[b];
		sortedArray[b] = temp;
		return sortedArray;
	}
}
